import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //NIE b większe od a I NIE a większe od b to to samo co a jest równe b
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert first number: ");
        int a = scanner.nextInt();
        System.out.println("Insert second number: ");
        int b = scanner.nextInt();
        boolean wyr = a == b;
        System.out.println("Are those numbers equal?: ");
        System.out.println(wyr);
    }
}