public class Lesson5 {
    public static void main(String[] args) {
        byte[] num1 = {3, 5, 7, 9};
        short[] num2 = {10, 20, 30, 40, 50};
        int[] num3 = {100, 200, 300};
        long[] num4 = {1000, 2000, 3000};
        float[] num5 = {15, 6f, 25, 5f, 14, 7};
        double[] num6 = {25, 9d, 100, 5d, 155, 7d};
        String[] team = {"Navi", "Faze", "Spirit"};
        int[][] result = new int[num1.length] [num2.length];
        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num2.length; j++) {
                result[i][j] = num1[i] + num2[j];
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(result[i][j] + " ");
            }
        }




    }
}












