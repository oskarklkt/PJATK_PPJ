
public class Main {
    public static void main(String[] args) {
        int[] elements = {1, 1, 2, 3, 3, 4, 5, 150, 150, 150, 150, 160, 12893487};
        int result = 1;
        for (int i = 1; i < elements.length; i++) {
            if (elements[i] != elements[i - 1]) {
                result++;
            }
        }
        if (result < 2) {
            System.out.println("W tej tablicy występuje tylko jedna wartość");
        } else if (result < 5) {
            System.out.println("W tej tablicy są " + result + " różne wartości");
        } else {
            System.out.println("W tej tablicy jest " + result + " różnych wartośći");
        }
    }
}