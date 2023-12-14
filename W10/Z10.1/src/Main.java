public class Main {
    public static void main(String[] args) {
        char[] chars = {'L', '-', 't'};
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < min) {
                min = chars[i];
                index = i;
            }
            System.out.println("indeks: " + i + " element: " + chars[i] + " wartość: " + (int) chars[i]);
        }

        System.out.println("Element o najmniejszej wartości znajduje się pod indeksem: "+ index);

    }
}