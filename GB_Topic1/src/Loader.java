public class Loader {
    public static void main(String[] args) {

/*      В данном классе собрана визуализация всех методов, Вы можете проверить корректность
        работы программы подставив соответсвующие значения для переменных*/

//      Задание № 1
        System.out.println("Задание № 1: см. класс Task1 ");

//      Задание № 2
        System.out.println("Задание № 2: см. класс Task2 ");

//      Задание № 3
        System.out.print("Задание № 3: ");
        System.out.println (Task3.task3(3.0,5.2,3.2,4.0));

//      Задание № 4
        System.out.print("Задание № 4: ");
        System.out.println(Task4.tasks4(5.0,6.0));

//      Задание № 5
        System.out.print("Задание № 5: ");
        Tasks5.tasks5 (1);

//      Задание № 6
        System.out.print("Задание № 6: ");
        System.out.println(Tasks6.tasks6(- 5));

//      Задание № 7
        System.out.print("Задание № 7: ");
        Tasks7 t7 = new Tasks7();
        t7.Tasks7("Vlad");

//      Задание № 8
        System.out.print("Задание № 8: ");
        Tasks8 t8 = new Tasks8();
        t8.year = 1998;
        t8.tasks8();
    }
}
