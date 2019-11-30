public class ArrayTest {
    public static void main(String[] args) {
        int [][] arr = new int [5][5];

        for (int i = 0; i < arr.length; i++) {
            arr [i][i] = 1;
            arr [i][arr.length - i - 1 ] = 1;

            }
    }

}
