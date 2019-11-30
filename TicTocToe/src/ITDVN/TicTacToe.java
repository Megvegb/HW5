package ITDVN;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.util.Scanner;

public class TicTacToe {
    /*
    блок настроек
     */
    private static char [][] map;
    private static int SIZE = 3;

    private static final char DOT_EMPTY = '⦁';
    private static final char DOT_X = 'X';
    private static final char DOT_O = '0';

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        initMap();
        printMap();

        while (true) {
            humanTurn();

            if (isEndGame(DOT_X))
                break;

//            computerTurn();
//            if (isEndGame(DOT_O))
//                break;
        }
        System.out.println("Игра закончена");
    }

    private static void initMap () {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;

            }
        }

    }
    
     private static void printMap() {
         for (int i = 0; i < SIZE; i++) {
             System.out.print("  " + i);
         }
         System.out.println(); // проставляет цифры по горизонтали

            for (int i = 0; i < SIZE; i++){
                System.out.print((i + 1) + "  "); // ставит цифры по вертикали
         for (int j = 0; j < SIZE ; j++) {
             System.out.print(map[i][j] + "  ");
         }
                System.out.println();
        }
         System.out.println();
    }

    private static void humanTurn(){
        int x;
        int y;

        do {
            System.out.println("Пожалуйста введите координаты точки");
            y = sc.nextInt() - 1;
            x = sc.nextInt() - 1;

        } while (!isCellValue(x,y));
        map[y][x] = DOT_X;
    }
    private static boolean isCellValue(int x, int y) {
        boolean result = false;
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            result = false;
        }

        if (map[y][x] != DOT_EMPTY) {
            result = false;
        }
        return result;

    }

    private static boolean isEndGame (char playerSymbol) {
        boolean result = false;

        printMap();

        if (checkWin (playerSymbol)) {
            System.out.println("Победили " + playerSymbol);
            result = true;
        }

        if (isMapFull()) {
            System.out.println("Ничья");
            result = true;
        }

        return result;
    }

    private static boolean isMapFull () {
        boolean result = true;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY)
                    result = false;
            }
        }
        return result;
    }

        private static boolean checkWin (char playerSymbol){
        boolean result = false;

        if (map [0][0] == playerSymbol && map [0][1] == playerSymbol && map[0][2] == playerSymbol) {
            result = true;
        }

        return result;
    }
}
