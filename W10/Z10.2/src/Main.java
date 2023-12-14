public class Main {
    public static void main(String[] args) {
        int[] xArray = {-3, 1, 0, -2, 1};
        int[] yArray = {-1, 1, 0, 0, -1};

        int xMax = getMaxValue(xArray);
        int yMax = getMaxValue(yArray);
        int xMin = getMinValue(xArray);
        int yMin = getMinValue(yArray);

        System.out.println("Współrzędne środka prostokąta: " + "x: " + (float)(xMax + xMin)/2 + " y: " + (float)(yMax + yMin)/2);
        System.out.println("Wysokość prostokąta: " + (yMax - yMin));
        System.out.println("Szerokość prostokąta: " + (xMax - xMin));

    }

    public static int getMaxValue(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int a : array) {
            if (a > max) {
                max = a;
            }
        }
        return max;
    }

    public static int getMinValue(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int a : array) {
            if (a < min) {
                min = a;
            }
        }
        return min;
    }


}