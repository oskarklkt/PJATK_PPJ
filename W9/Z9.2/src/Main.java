import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input sign's size (This program will print sign in size 2*size+1 X 2*size+1): ");
        int SIZE = scanner.nextInt();
        System.out.println();

        for (int i = SIZE; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(". ");
            }
            for (int j = 0; j < (SIZE - i) * 2 + 1; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(". ");
            }
            System.out.println();
        }
        for (int i = SIZE; i >= 0; i--) {
            for (int j = SIZE; j > i; j--) {
                System.out.print(". ");
            }
            for (int j = 0; j < (2 * i) + 1; j++) {
                System.out.print("* ");
            }
            for (int j = SIZE; j > i; j--) {
                System.out.print(". ");
            }
            System.out.println();
        }
    }
}

