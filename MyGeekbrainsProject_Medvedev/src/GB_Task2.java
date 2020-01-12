import org.w3c.dom.ls.LSOutput;

 /*
    Добрый день! Оцените пожалуйста написанный мной код. Для вашего удобства реализован механизм вывода данных в консоль.
    Запустите файл через компилятор и посмотрите результат, изменять входные пареметры можно в методе main
    путем изменения входных параментов в методах.
    Например: task3(2 , 3.0 , 8.0 , 4) можно заменить на task3(4 , 5, 8 , 10) и тд.
    Надеюсь все понятно написал.
*/

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
        System.out.println("\n");
        System.out.println("Задача № 2");
        task_2();

        /*
Задача № 3
        * Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        * пройти по нему циклом, и числа меньшие 6 умножить на 2;
         */

        System.out.println("\n");
        System.out.println("Задача № 3");
        task_3(1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1);

        /*
Задача № 4
        * Создать квадратный двумерный целочисленный массив (количество строк и столбцов
        * одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
         */

        System.out.println("\n");
        System.out.println("Задача № 4");
        task_4(5);

//        boxSize - т.е. параметр в скобках равен кол-ву ячеек в квадрате.

        /*
Задача № 5
        * Задать одномерный массив и найти в нем минимальный и максимальный
        * элементы (без помощи интернета);
     */

        System.out.println("\n");
        System.out.println("Задача № 5");
        task_5(1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 20);


    /*
    Задача № 6
     * Написать метод, в который передается не пустой одномерный целочисленный массив,
     * метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части
     * массива равны. Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance
     * ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 10]) → true,
     */

        System.out.println("\n");
        System.out.println("Задача № 6");
        System.out.println(task_6(1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 20));

         /*
    Задача № 7
     * Написать метод, которому на вход подается одномерный массив и число n (может быть
     * положительным, или отрицательным), при этом метод должен сместить все элементы
     * массива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными
     * массивами.
     */

        System.out.println("\n");
        System.out.println("Задача № 7");
        System.out.println("Исходный массив смещен на: ");
        task_7(5, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 20);
        System.out.println(" ");
        task_7(-3, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 20);
        System.out.println(" ");
        task_7(16, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 20);

    }


    //  Задача № 1
    public static void task_1(int... args) {
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

    public static void task_2() {
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 3;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //  Задача № 3

    public static void task_3(int... args) {
        int[] array = args;
        System.out.println("Переданный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

            if (array[i] < 6) {
                array[i] = array[i] * 6;
            }
        }

        System.out.println("\nИзмененный массив:");
        for (int tmp : array) {
            System.out.print(tmp + " ");
        }
    }

    //  Задача № 4

    public static void task_4(int boxSize) {
        int[][] array = new int[boxSize][boxSize];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j || (array.length - 1) - i == j) {
                    array[i][j] = 1;
                } else array[i][j] = 0;
                ;
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Размер квадрата = " + boxSize + "x" + boxSize);
    }

    //  Задача № 5

    public static void task_5(int... args) {
        int[] array = args;
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

    //  Задача № 6
    private static boolean task_6(int... args) {
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


    //  Задача № 7

    public static void task_7(int shift, int... incomingArray) {
        int changeShift;
        int[] array = incomingArray;

//        оптимизируем кол-во смещений, на тот случай если число n больше длинны массива

        if (shift != 0 && Math.abs(shift) > array.length) changeShift = shift % array.length;
        else changeShift = shift;

        if (changeShift > 0) {
            for (int i = 0; i < changeShift; i++) {
                int buffer = array[0];

                for (int j = 1; j < array.length; j++) {
                    array[j - 1] = array[j];
                }
                array[array.length - 1] = buffer;
            }
        }
        if (changeShift < 0) {
            for (int i = 0; i > changeShift; i--) {
                int buffer = array[array.length - 1];

                for (int j = 1; j < array.length; j++) {
                    array[array.length - j] = array[array.length - j - 1];
                }
                array[0] = buffer;
            }
        }

        System.out.println(shift + " позиции");
        for (int tmp : array) {
            System.out.print(tmp + " ");
        }
    }
}

