
public class Point2D {
    private int x;
    private int y;

    public String get() {
        //"" wstawiam na początku aby zwracany był string
        return "" + x + '\n' + y + '\n' + 1;
    }

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }



    public static void main(String[] args) {
        Point2D p;
        p = new Point2D();
        p.set(3, 2);
        System.out.println(p.get());
    }
}