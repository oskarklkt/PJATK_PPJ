// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class s30096_W1_Z4 {
    public static void main(String[] args) {
        int     a1 = 0x6d,  a2 =  13, a = a1 & a2,
                b1 = 0xA, b2 = 15 , b = b1 | b2,
                c1 = 11 << 2, c2 = 6, c = c1 ^ c2;
        /*
                a
                0110 1101
               &0000 1101 = 13
               =0000 1101
                b
                1100
               |1111 = 15
               =1111
                c
                 101100
                ^000110 = 6
                 101010
         */

        System.out.print(a + " " + b + " " + c);

    }
}