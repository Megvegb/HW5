public class Task5 {
    public static void main(String[] args) {
        int [] arr = {1, 5, 3, 2, 15, 4, 5, 2, 4, 8, 9, 1};
        int min = arr[0];
        int max = arr[11];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {min = arr[i];}
            if (arr[i] > max) {max = arr[i];}
            }
        System.out.println("minimum number is " + min);
        System.out.println("maximum number is " + max);

        }
    }
