public class Task7 {
    public static void shiftOfNumbers(int[] arr, int n) {
        for (int i : arr) System.out.print(i + " ");
        System.out.println("\r\n");

        if (n > 0) {
            for (int x = 0; x < n; x++) {
                int buf = arr[arr.length - 1];
                if (arr.length - 1 >= 0) System.arraycopy(arr, 0, arr, 1, arr.length - 1);
                arr[0] = buf;
                //смотрим матрицу после каждого сдвига
                for (int i : arr) System.out.print(i + " ");
                System.out.println();
            }
        }
        if (n < 0) {
            for (int x = 0; x > n; x--) {
                int buf = arr[0];
                System.arraycopy(arr, 1, arr, 0, arr.length - 1);
                arr[arr.length - 1] = buf;
                //смотрим матрицу после каждого сдвига
                for (int i : arr) System.out.print(i + " ");
                System.out.print("\r\n");
            }
        }
    }
}
