import java.util.Random;

public class Fruit {
    private final String name;
    private final double weight;

    public Fruit(String name) {
        Random random = new Random();
        this.name = name;
        this.weight = random.nextDouble(0.5, 0.8);
    }
}