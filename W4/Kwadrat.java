
public class Kwadrat {
    private double bok;

    public Kwadrat(double bok) {
        this.bok = bok;
    }

    public void show() {
        System.out.print("Pole powierzchnii tego kwadratu wynosi: ");
        System.out.println(Math.pow(bok, 2));
        System.out.print("objętość sześcianu zbudowanego na podstawie tego kwadratu wynosi: ");
        System.out.println(Math.pow(bok, 3));
    }
    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat(5);
        kwadrat.show();
    }
}