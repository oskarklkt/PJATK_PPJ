// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Task6_03 {
    public static void main(String[] args) {
        Truck heavyTruck = new Truck("Black", 2, 24);
        heavyTruck.startEngine();
        Truck lightTruck = new Truck("Blue", 4, 18);
        lightTruck.startEngine();

    }
}

class Vehicle {
    private String color;

    public Vehicle(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

class WheeledVehicle extends Vehicle {
    private int numberOfAxes;

    public WheeledVehicle(String color, int numberOfAxes) {
        super(color);
        this.numberOfAxes = numberOfAxes;
    }

    public int getNumberOfAxes() {
        return numberOfAxes;
    }
}

class Truck extends WheeledVehicle {
    private double weight;

    public Truck(String color, int numberOfAxes, double weight) {
        super(color, numberOfAxes);
        this.weight = weight;
    }

    public void startEngine() {
        if ( (weight/getNumberOfAxes()) > 11) {
            System.out.println( "Jazda niebezpieczna, odmowa uruchomienia silnika");
        } else {
            System.out.println("Silnik włączony");
        }
    }
}