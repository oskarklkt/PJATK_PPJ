import java.util.NoSuchElementException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź (przedzielając spacją lub innym wybranym znakiem nie będącym liczbą)\n" +
                "wspolrzedne odpowiednio x i y dla lewego górenego rogu prostokąta oraz x i y dla prawego dolnego\n" +
                "rogu prostokąta dla dwóch prostokątów (łącznie 8 wartości): ");
        String input = scanner.nextLine();
        Scanner strScanner = new Scanner(input);
        try {
            int xl1 = strScanner.nextInt();
            int yl1 = strScanner.nextInt();
            int xp1 = strScanner.nextInt();
            int yp1 = strScanner.nextInt();
            int xl2 = strScanner.nextInt();
            int yl2 = strScanner.nextInt();
            int xp2 = strScanner.nextInt();
            int yp2 = strScanner.nextInt();

            int xlMax = Math.max(xl1, xl2);
            int xpMin = Math.min(xp1, xp2);
            int ylMin = Math.min(yl1, yl2);
            int ypMax = Math.max(yp1, yp2);

            int result = (xpMin - xlMax) * (ylMin - ypMax);
            if (result > 0) {
                System.out.println("Pole wspólnej powierzhchni wynosi: " + result + " jednostek kwadratowych");
            } else {
                System.out.println("Te dwa prostokąty nie mają wspólnej powierzchnii");
            }

        } catch (NoSuchElementException e) {
            System.out.println("Podano zbyt mało wartości :(");
        }



    }
}