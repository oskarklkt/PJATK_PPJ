//Moje obliczenia liczą także ten dzień do którego liczymy
public class Main {
    static int baseYear = 2023;
    static int baseMonth = 1;
    static int baseDay = 1;
    public static void main(String[] args) {
        System.out.println(getDays(29, 2, 2036));
    }

    public static int getDays(int day, int month, int year) {
        int days = 0;
        while (baseYear < year) {
            if (isLeapYear(baseYear)) {
                days += 366;
            } else {
                days += 365;
            }
            baseYear++;
        }
        while (baseMonth < month) {
            days += getDaysInAMonth(baseMonth);
            baseMonth++;
        }
        days += day;
        if (isLeapYear(year) && (month > 2)) {
            days++;
        }
        return days;
    }


    public static int getDaysInAMonth(int month) {
        if (month > 12 || month < 1) {
            throw new IllegalArgumentException("wrong month");
        }
        switch (month) {
            case 1,3,5,7,8,10,12: return 31;
            case 4,6,9,11: return 30;
            case 2: return  28;
        }
        return 0;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 ==0);
    }
}