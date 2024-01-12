import java.io.FileInputStream;
import java.util.Scanner;
// zawartość pliku: 12 0,5 2 11,7 3 179

public class Main {
    public static void main(String[] args) {
        double sum = 0;
        try {
            FileInputStream in = new FileInputStream("D:\\PROGRAMOWANIE\\zadanie12.1.txt");
            Scanner scanner = new Scanner(in);
            while (scanner.next){
                double d = scanner.nextDouble();
                sum += d;
            }
            in.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(sum);

    }
}