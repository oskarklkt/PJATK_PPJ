import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] tab = {

                {1, 0, 0, 0, 0},

                {0, 1, 0, 0},

                {0, 0, 1}

        };

        int[] newTab = new int[12];

        int index = 0;

        for (int[] t : tab) {
            for(int i : t) {
                newTab[index] = i;
                index++;
            }
        }

        System.out.println(Arrays.toString(newTab));


    }
}