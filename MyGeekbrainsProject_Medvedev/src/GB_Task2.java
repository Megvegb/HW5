import org.w3c.dom.ls.LSOutput;

public class GB_Task2 {
    public static void main(String[] args) {

        /*
 Задача № 1
        * Задать целочисленный массив, состоящий из элементов 0 и 1.
        * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        * С помощью цикла и условия заменить 0 на 1, 1 на 0;
        */

        System.out.println("\nЗадача № 1");
        task_1(1, 1, 0, 0, 1, 0, 1, 1, 0, 0);

        /*
Задача № 2
        * Задать пустой целочисленный массив размером 8.
        * С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        */
//        System.out.println("\n");
//        System.out.println("Задача № 2");
//        task_2();

        /*
Задача № 3
        * Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        * пройти по нему циклом, и числа меньшие 6 умножить на 2;
         */

//        System.out.println("\n");
//        System.out.println("Задача № 3");
//        task_3(1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1);

        /*
Задача № 4
        * Создать квадратный двумерный целочисленный массив (количество строк и столбцов
        * одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
         */

        System.out.println("\n");
        System.out.println("Задача № 4");
        task_4();


        /*
Задача № 5
        * Задать одномерный массив и найти в нем минимальный и максимальный
        * элементы (без помощи интернета);
     */

//        System.out.println("\n");
//        System.out.println("Задача № 5");
//        task_5(1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 20);
    }


//  Задача № 1
    public static void task_1 (int ... args) {
        int[] array = args;
        System.out.println("массив до изменения:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (array[i] == 1) array[i] = 0;
            else if (array[i] == 0) array[i] = 1;
        }

        System.out.println("\nмассив после изменения:");
        for (int tmp : array) {
            System.out.print(tmp + " ");
        }
    }

    //  Задача № 2

    public static void task_2 () {
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 3;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //  Задача № 3

        public static void task_3(int ... args) {
            int[] array = args;
            System.out.println("Переданный массив:");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");

                if (array[i] < 6) {
                    array[i] = array[i] * 6;
                }
            }

            System.out.println("\nИзмененный массив:");
            for (int tmp : array){
                System.out.print(tmp + " ");
            }
        }

    //  Задача № 4

    public static void task_4 () {
            final int MAX = 7;
            char symbol;
            int[][] array = new int[MAX][MAX];

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (i == j || (array.length - 1) - i == j) { symbol = '1';
                    }
                    else symbol = 'x';
                    System.out.print(symbol + " ");
                }
                System.out.println("");
            }

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j == i; j++) {
                    array[i][j] = 1;
                }
            }
    }

    //  Задача № 5

    public static void task_5 (int ... args) {
        int [] array = args;
        int maxValue = array[1];
        int minValue = array[1];
        System.out.print("Исходный массив:\n");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
           if (array[i] > maxValue) maxValue = array[i];
           if (array[i] < minValue) minValue = array[i];
        }
        System.out.println("\nМаксимальное значение массива = " + maxValue);
        System.out.println("Минимальное значение массива = " + minValue);
    }
}
