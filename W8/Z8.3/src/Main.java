
public class Main {
    public static void main(String[] args) {
        //samą liczbę też uznaję jako jej dzielnik np 7 jest dzielnikiem 7
        System.out.println(getHighestPrimeDivider(55));
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int getHighestPrimeDivider(int n) {
        if (isPrime(n)) {
            return n;
        }

        for (int i = n/2; i > 0; i--) {
            if (isPrime(i) && n % i == 0) {
                return i;
            }
        }

        return 1;
    }
}