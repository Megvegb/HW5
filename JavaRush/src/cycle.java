import java.util.Scanner;

public class cycle {

    public static int i, j, k, l;
    public static boolean result;

    public static void main(String[] args) {
        int max1;
        int max2;

        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        j = sc.nextInt();
        k = sc.nextInt();
        l = sc.nextInt();

        if (i >= j) max1 = i;
            else { max1 = j}
        if (k > l) max2 = k;
                else {max2 = l}

        if result = (max1 > max2);
        System.out.println( "max number is " + max1);

        else {
            System.out.println(max2);
        }


    }

}
