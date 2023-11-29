import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        double x = scanner.nextDouble();

        //niektóre z nawiasów nie są potrzebne, używam ich ze względu na czytelność kodu
        if (    ((x > -15 && x <= -10) || (x > -5 && x < 0) || (x > 5 && x < 10)) &&
                (x <= - 13 || (x > -8 && x <= -3)) &&
                (x >= -4)) {
            System.out.println("liczba należy do częśći wspólnej zbiorów");
        } else {
            System.out.println("liczba nie należy do części wspólnej zbiorów");
        }

    }
}