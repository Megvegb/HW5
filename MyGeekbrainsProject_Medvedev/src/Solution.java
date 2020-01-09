import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.println("\r\n4 - задание");
        int[][] arr4 = new int[7][7];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0, j2 = arr4[i].length; j < arr4[i].length; j++, j2--) {
                if (i == j || i == (j2 - 1)) arr4[i][j] = 1;
                System.out.print(arr4[i][j] + " ");
            }
            System.out.print("\r\n");
        }
    }
}



