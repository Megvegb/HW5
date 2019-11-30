import java.util.Scanner;

public class cycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Пожалуйста введите 4 числа");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int max1, max2;

        if ((num1 + num2) > (num3 + num4)) {
            max1 = num1;
            max2 = num2;
        } else {
            max1 = num3;
            max2 = num4;
        }
        boolean result = (max1 > max2);

        if (result == true) System.out.println("MAX number is " + max1);
        else System.out.println("MAX number is " + max2);



 /*       if ((num1 > num2) && (num1 > num3) && (num1 > num4)) {
            System.out.println("Maximum number is " + num1);
        }
            else if ((num2 > num3) && (num2 > num4)) {
            System.out.println("Maximum number is " + num2);
            }

            else if (num3>num4) {
            System.out.println("Maximum number is " + num3);
        }
            else {
            System.out.println("Maximum number is " + num4);
        }
 */   }
}
