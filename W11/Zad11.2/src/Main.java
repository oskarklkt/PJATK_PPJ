import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(10) + 1;
        System.out.print("size: ");
        System.out.println(size);
        int[][] tab = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                tab[i][j] = random.nextInt(10);
            }
        }
        System.out.println("Array with duplicates: ");
        arrayPrinter(tab);

        int rowCounter = 0;
        for (int[] row : tab) {
            int [] newRow = new int[size];
            int uniqueValues = 0;
            outer: for (int i = 0; i < size; i++) {
                for (int j = 0; j < i; j++) {
                    if (row[j] == row[i]) {
                        continue outer;
                    }
                }
                newRow[uniqueValues] = row[i];
                uniqueValues++;
            }
            int[] resultRow = new int[uniqueValues];
            for (int i = 0; i < uniqueValues; i++) {
                resultRow[i] = newRow[i];
            }
            tab[rowCounter] = resultRow;
            rowCounter++;
        }
        System.out.println("Array without duplicates: ");
        arrayPrinter(tab);
    }

    public static void arrayPrinter(int[][] array) {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}