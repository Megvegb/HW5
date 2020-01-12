import java.util.Scanner;

public class Solution {
    public static boolean result;
    public static int rightEl;
    public static int leftEl;
    public static void main(String[] args) {
        System.out.println("\r\n4 - задание");
        System.out.println(task_6(1,1,1,3,1));
        System.out.println("Равны элементы до индекса: Слева = " + leftEl + " Справа = " + rightEl);
    }

    public static boolean task_6(int... args) {
        int[] array = args;
        int[][] sum = new int[2][array.length];
        int leftToRight = 0;
        int rightToLeft = 0;

        for (int j = 0; j < array.length; j++) {
            leftToRight += array[j];
            rightToLeft += array[array.length - j - 1];

            sum[0][j] = leftToRight;
            sum[1][j] = rightToLeft;
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                System.out.println(sum[0][i] + "=" + sum[1][j]);
                if (sum[0][i] == sum[1][j]) {
                    leftEl = i;
                    rightEl = j;
                    result = true;
                }
            }
        } return result;
    }
}






