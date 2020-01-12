import java.lang.reflect.Array;

public class Shifting {
    public static void main(String[] args) {

        System.out.println("Исходный массив смещен на: ");
        shiftArray(13, 1, 5, 3, 2, 11, 4, 8, 9, 20);
        System.out.println(" ");
        shiftArray(-3, 1, 5, 3, 2, 11, 4, 8, 9, 20);

    }

    public static void shiftArray(int shift, int... incomingArray) {
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

