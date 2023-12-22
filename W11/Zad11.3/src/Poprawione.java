import java.util.Random;

public class Poprawione {
    public static void main(String[] args) {
        int size = 10;
        Random random = new Random();

        int wrongCoordinatesCounter = 0;
        while (wrongCoordinatesCounter < 20) {
            int x = (int) (random.nextInt((int) (size * 1.4) + 1) - 0.2 * size);
            int y = (int) (random.nextInt((int) (size * 1.4)) - 0.2 * size);
            if (x > size - 1 || x < 0 || y > size - 1 || y < 0) {
                System.out.print(++wrongCoordinatesCounter + ". ");
                System.out.println("coordinates outside array range(" + x +"," + y+")");
            } else {
                System.out.println("coordinates correct(" + x +"," + y+")!!");
            }
        }
    }
}