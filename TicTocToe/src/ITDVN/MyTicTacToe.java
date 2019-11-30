package ITDVN;
import java.util.Scanner;

public class MyTicTacToe {

    public static final char SIZE = 3;
    public static final char X_USER = 'X';
    public static final char O_COMP = 'O';
    public static final char SECOND_USER = 'O';
    public static int aiLevel = 0;
    public static final char EMPTY = '*';
    public static final char [][] FIELD =  new char [SIZE][SIZE];

    public static void main(String[] args) {

        main_menu();
        initField();
        printField();
    }



    public static void main_menu(){
        int i;
        System.out.println("Пожалуйста выберите тип игры:");
        System.out.println("1. Игра с компьютером");
        System.out.println("2. Игра против другого игрока");
        System.out.println("3. Выйти из программы");
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();

// Алгоритм выбора типа игры.

        switch(i){
            case 1:
               aiLevel();
                break;
            case 2:
                modeTwoPlayers();
                break;

            case 3:
                exitGame();
                break;

            default:
                System.out.println("Пожалуйста выберите значение из предложенных");
                break;
        }
    }

    public static void aiLevel (){

    }

    public static void modeTwoPlayers(){

    }

    public static void exitGame(){

    }

    public static void initField() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                FIELD[i][j] = EMPTY;
            }
        }
    }

    public static void printField () {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(FIELD [i][j] + " ");
            }
            System.out.println();
            }
        System.out.println();
    }
}

