package ru.bankapp.logic;
import java.util.Scanner;
import java.util.Random;

public class TicTackToe {

    private static char[][] map;
    private static int SIZE = 3;

    private static final char X_USER = 'X';
    private static final char O_COM = 'O';
    private static final char EMPTY = '*';
    private static final boolean SILLY_MODE = false;

    private static Scanner sc = new Scanner(System.in);
    private static Random rd = new Random();

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в игру \"Крестики-нолики\".");
        System.out.println("Введите в поле 2 (x и y) цифры от 1 до 3\n");

        initMap();
        printMap();

        while (true) {
            humanTurn();
            if (isEndGame(X_USER)){
            break;
            }

            computerTurn();
            if (isEndGame(O_COM)){
            break;
            }
        }

        System.out.println("Игра закончена");
    }

// реализация методов игры

    public static void humanTurn() {
        int x;
        int y;

        do {
            System.out.println("Введите координату х");
            x = sc.nextInt() - 1;
            System.out.println("Введите координату у");
            y = sc.nextInt() - 1;
        }
            while (!isCellValue(x,y));{
                map[y][x] = X_USER;
        }
    }

    public static void computerTurn() {
        int x = -1;
        int y = -1;

        if (SILLY_MODE) {

            do {
                x = rd.nextInt(SIZE);
                y = rd.nextInt(SIZE);
            }
            while (!isCellValue(x, y));
            map[x][y] = O_COM;
            System.out.println("Компьютер выполнил ход в ячейку x = " + (x + 1) + "; y = " + (y + 1));
        }

        else {
            for (int i = 0; i <= SIZE; i++) {
                for (int j = 0; j <= SIZE ; j++) {
                    if (map [i][j] == EMPTY ) {
                        while (!isCellValue(x, y));
                        map[x][y] = O_COM;
                        System.out.println("Компьютер выполнил ход в ячейку x = " + (x + 1) + "; y = " + (y + 1));
                    }
                }
            }
        }
    }

        public static boolean isCellValue ( int x, int y){
            boolean result = true;
            if (x >= SIZE || x < 0 || y >= SIZE || y < 0) {
                    result = false;

                if (map[x][y] != EMPTY)
                    result = false;
            }
            return result;

    }

            private static boolean isEndGame (char playerSymbol) {
                boolean result = false;

                printMap();

                if (checkWin (playerSymbol)) {
                    System.out.println("Победили " + playerSymbol);
                    System.out.println();
                    result = true;
                }

                if (isMapFull()) {
                    System.out.println("Ничья");
                    System.out.println();
                    result = true;
                }

                return result;
            }

            public static boolean isMapFull() {
                boolean result = true;
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        if (map[i][j] == EMPTY) {
                            result = false;
                        } else {
                        }
                    }
                }
                return result;
            }

            private static boolean checkWin(char playerSymbol) {
                boolean result = false;
                if(
                        (map[0][0] == playerSymbol && map[0][1] == playerSymbol && map[0][2]
                                == playerSymbol) ||
                                (map[1][0] == playerSymbol && map[1][1] == playerSymbol && map[1][2] ==
                                        playerSymbol) ||
                                (map[2][0] == playerSymbol && map[2][1] == playerSymbol && map[2][2] ==
                                        playerSymbol) ||
                                (map[0][0] == playerSymbol && map[1][0] == playerSymbol && map[2][0] ==
                                        playerSymbol) ||
                                (map[0][1] == playerSymbol && map[1][1] == playerSymbol && map[2][1] ==
                                        playerSymbol) ||
                                (map[0][2] == playerSymbol && map[1][2] == playerSymbol && map[2][2] ==
                                        playerSymbol) ||
                                (map[0][0] == playerSymbol && map[1][1] == playerSymbol && map[2][2] ==
                                        playerSymbol) ||
                                (map[2][0] == playerSymbol && map[1][1] == playerSymbol && map[0][2] ==
                                        playerSymbol)){
                    result = true;
                }
                return result;
            }


            public static void initMap () {
            map = new char[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    map[i][j] = EMPTY;
                }
            }
        }

        public static void printMap () {
            for (int i = 0; i <= SIZE; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < SIZE; i++) {
                System.out.print(i + 1 + " ");
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println(" ");
            }
        }

            System.out.println("Выберите режим игры: ");
    System.out.println("1. Игра против компьютера.");
    System.out.println("2. 2 игрока.");
    System.out.println("3. Выход.");
    int i = 0;
    Scanner sc = new Scanner(System.in);
    // Считываем значение с консоли и сохраняем его
    // в переменную i
    i = sc.nextInt();
    switch (i) {
        case 1: {
            aiLevel();
            break;
        }
        case 2: {
            modeTwoPlayers();
            break;
        }
        case 3: {
            System.exit(0);
            break;
        }
        default: {
            System.out.println("Было введено неверное значение!");
        }

}

