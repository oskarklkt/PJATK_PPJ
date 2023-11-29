public class Square {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public String toString() {
        return "Pole powierzchni tego kwadratu: " + side * side + '\n' +
                "objętość sześcianu zbudowanego na podstawie tego kwadratu: " + side * side * side;
    }

    public void show() {
        System.out.println("Pole powierzchni tego kwadratu: " + side * side);
        System.out.println("objętość sześcianu zbudowanego na podstawie tego kwadratu: " + side * side * side);
    }

    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println("Wykorzystanie metody show:");
        square.show();
        System.out.println("-----------");
        System.out.println("Wykorzystanie metody toString:");
        System.out.println(square);
    }
}
