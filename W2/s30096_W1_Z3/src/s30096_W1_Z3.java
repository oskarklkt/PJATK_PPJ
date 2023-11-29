// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class s30096_W1_Z3 {
    public static void main(String[] args) {
        int a = 1902000001; //01110001 01011110 00110111 10000001
        //1
        System.out.print("Wartość 5 najmłodszych bitów: ");
        System.out.println(a & 0b11111);
        //2
        System.out.print("Siódmy bit: ");
        System.out.println((a >> 6) & 0b1);
        //3
        System.out.print("wartość 1 bajtu: ");
        System.out.println((a >> 24) & 0xFF );
        System.out.print("wartość 2 bajtu: ");
        System.out.println((a >> 16) & 0xFF );
        System.out.print("wartość 3 bajtu: ");
        System.out.println((a >> 8) & 0xFF );
        System.out.print("wartość 4 bajtu: ");
        System.out.println(a & 0xFF);
        //4
        System.out.print("Warstość dwóch środkowych bajtów: ");
        System.out.println((a >> 8) & 0xFFFF);


    }
}