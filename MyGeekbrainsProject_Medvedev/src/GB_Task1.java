public class GB_Task1 {

    /*
    Добрый день! Оцените пожалуйста написанный мной код. Для вашего удобства реализован механизм вывода данных в консоль.
    Запустите файл через компилятор и посмотрите результат, изменять входные пареметры можно в методе main путем изменения цифр.
    Например: task3(2 , 3.0 , 8.0 , 4) можно заменить на task3(4 , 5, 8 , 10) и тд.
    Надеюсь все понятно написал.

Задания:
1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат, где a, b, c, d – входные параметры этого метода;
4. Написать метод, принимающий на вход два числа, и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false;
5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное число передали или отрицательное (Замечание: ноль считаем положительным числом.);
6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
8. *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
9. *Не набирая код в IDE, ответьте на следующий вопрос. Есть два метода:
void myMethod(int a, String b) {}
void myMethod(String b, int a) {}
Это две разных сигнатуры одного метода или один и тот же метод?
     */

    public static void main(String[] args) { // Задание №1
        System.out.println("\nРезультат задания №1(см. код, метод main запускает все последующие проверки по заданиям).");

        System.out.println("\nРезультат задания №2(см. код).");

        System.out.println("\nРезультат задания №3");
        System.out.println(task3(2, 3.0, 8.0, 4));

        System.out.println("\nРезультат задания №4");
        System.out.println(task4(10, 9));

        System.out.println("\nРезультат задания №5");
        task5(0);
        task5(5);
        task5(-3);

        System.out.println("\nРезультат задания №6");
        System.out.println(task6(-7));

        System.out.println("\nРезультат задания №7");
        task7("Vladimir");

        System.out.println("\nРезультат задания №8");
        task8(2020);
        task8(1998);
        task8(1964);

        System.out.println("\nРезультат задания №9");
        task9();

        //    Задание №2

        byte type1 = 127;
        short type2 = 32762;
        int type3 = 2000000;
        long type4 = 3000000000L;
        float type5 = 12.546f;
        double type6 = 125.897654;
        char type7 = '0';
        boolean type8 = true;
        String name = "Vova";

        //    Задание №3

    }
        public static double task3 (double a, double b, double c, double d){
            return a * (b + (c / d));
        }

        //    Задание №4
    public static boolean task4(int num1, int num2){
        int sum = num1 + num2;
        return (sum >= 10 && sum <= 20);
    }

        //    Задание №5
    public static void task5(int num){
        if (num >= 0) System.out.println(num + " - положительное число");
        else System.out.println(num + " - отрицательное число");
    }

        //    Задание №6

    public static boolean task6(int num){
        return (num < 0);
    }

    //    Задание №7

    public static void task7(String name){
        System.out.println("Привет, " + name + "!");
    }

    //    Задание №8
    public static void task8(int year){
    if (year % 400 == 0 || year % 100 !=0 && year % 4 == 0) System.out.println(year + " - високосный год");
    else System.out.println(year + " - не високосный год");
    }

    //    Задание №9
    public static void task9 (){
        System.out.println("Указанные методы - две разных сигнатуры одного метода ");
    }
}

