public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj literę z polskiego alfabetu: ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);


        char ch = Character.toLowerCase(scanner.next().charAt(0));

        if (ch == 'a' || ch == 'ą' || ch == 'e' || ch == 'ę' || ch == 'i' || ch == 'o'
                || ch == 'u' || ch == 'ó' || ch == 'y') {
            System.out.println("Jest to samogłoska");
        } else {
            System.out.println("jest to spółgłoska");
        }
    }
}