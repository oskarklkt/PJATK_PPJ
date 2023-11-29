
public class Task6_01 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2, 5);
        rectangle1.showArea();
        Rectangle rectangle2 = new Rectangle(rectangle1);
        rectangle2.showArea();
        Cuboid cuboid1 = new Cuboid(3,5,5);
        cuboid1.showVolume();
        cuboid1.showArea();
        Cuboid cuboid2 = new Cuboid(rectangle1, 10);
        cuboid2.showVolume();
        cuboid2.showArea();
    }
}

class Rectangle {

    //długość boku a
    private int a;

    //długość boku b
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle(Rectangle rectangle) {
        a = rectangle.a;
        b = rectangle.b;
    }

    public void showArea() {
        System.out.println("Area: " + a * b);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}

class Cuboid extends Rectangle {
    //Długość c (wysokość bryły)
    private int c;

    public Cuboid(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    public Cuboid(Rectangle rectangle, int c) {
        super(rectangle);
        this.c = c;
    }

    public void showVolume() {
        System.out.println("Volume: " + getA() * getB() * c);
    }

}