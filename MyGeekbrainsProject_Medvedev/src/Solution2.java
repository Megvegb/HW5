public class Solution2 {

    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("Задача № 6");
        System.out.println(task_6(1, 5, 3, 2,1));
    }

    public static boolean task_6(int... args) {
        int[] array = args;
        int leftSum, rightSum;


        for (int i = 0; i < array.length + 1; i++) {
            leftSum = 0;
            rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += args[j];
            }

            for (int j = i; j < array.length; j++) {
                rightSum += array[j];

            }

            if (leftSum == rightSum) return true;
        }
        return false;
    }
}
