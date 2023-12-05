import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input amount of money in polish zloty: ");
        double money = scanner.nextDouble();

        ArrayList<Double> polishCoins = new ArrayList<>(List.of(500.0, 200.0, 100.0, 50.0, 20.0, 10.0, 5.0,
                2.0, 1.0, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01));

        for (Double coinType : polishCoins) {
            int count = 0;
            while (money >= coinType) {
                money -= coinType;
                count++;
            }
            if (coinType >= 1 && count > 0) {
                System.out.println(count + " * " + (int)(coinType * 1) + " zl");
            } else if (coinType < 1 && count > 0){
                System.out.println(count + " * " + (int)(coinType * 100) + " gr");
            }
        }

    }
}