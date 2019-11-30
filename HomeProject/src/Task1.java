public class Task1 {
    public static void ChangeNumber () {
        int [] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 1 ? 0 : 1;
            System.out.print(" " + arr[i]);}
    }
}


