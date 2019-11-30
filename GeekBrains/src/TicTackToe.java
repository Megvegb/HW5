import java.util.Scanner;
import java.util.Random;

public class TicTackToe {
    /*
        Определение параментров игры
    */
    private static char[][] map;
    private static int SIZE = 3;

    private static final char X_USER = 'X';
    private static final char O_COM = 'O';
    private static final char EMPTY = '*';
    private static int sillyMode;

    private static Scanner sc = new Scanner(System.in);
    private static Random rd = new Random();

       /*
                                                Выбор желаемого режима игры
                                            */

    public static void startGame() {
        System.out.println("Добро пожаловать в игру \"Крестики-нолики\".");

        System.out.println("Перед началом игры выберите режим игры: ");
        System.out.println("1. Игра против тупого компьютера.");
        System.out.println("2. Игра против умного компьютера.");
        System.out.println("3. Игра против суперумного компьютера.");


        int i = 0;
        Scanner sc = new Scanner(System.in);

        i = sc.nextInt();
        switch (i) {
            case 1: {
                sillyMode = 1;
                break;
            }
            case 2: {
                sillyMode = 2;
                ;
                break;
            }
            case 3: {
                sillyMode = 3;
                break;
            }
            default: {
                System.out.println("Было введено неверное значение!");
            }
        }
    }

                                                /*
                                                    Запуск игры
                                                */

    public static void main(String[] args) {

        startGame();
        initMap();
        printMap();

        while (true) {
            humanTurn();
            if (isEndGame(X_USER)) {
                break;
            }

            computerTurn();
            if (isEndGame(O_COM)) {
                break;
            }
        }

        System.out.println("Игра закончена");
    }


   /*
Реализация хода пользователя
 */

    public static void humanTurn() {
        int x;
        int y;

        do {
            System.out.println("Введите в поле координаты x и y в соответсвии с цифрами полей\n");
            System.out.println("Введите координату х");
            x = sc.nextInt() - 1;
            System.out.println("Введите координату у");
            y = sc.nextInt() - 1;
        }
        while (!isCellValue(x, y));
        {
            map[y][x] = X_USER;
        }
    }

       /*
Реализация хода компьютера в зависимости от выбранного режима.
1. Тупой компьютер, значения проставляются рандомно.
2. Умный компьютер, значения ячейки присваиваются из ближайших к последнему выбранному варианту.
3. Супер усный компьютер, расчет хода производится на основе набранных очков
        */

    public static void computerTurn() {
        int x = -1;
        int y = -1;
        boolean ai_win = false;
        boolean user_win = false;
        int numOfSameSimybolsNearby = 0;
        int temp;

    /*
Логика работы. Режим №1
 */
        if (sillyMode == 1) {

            do {
                x = rd.nextInt(SIZE);
                y = rd.nextInt(SIZE);
            }
            while (!isCellValue(x, y));
            map[x][y] = O_COM;
            System.out.println("Компьютер выполнил ход в ячейку x = " + (x + 1) + "; y = " + (y + 1));
        }
    /*
Логика работы. Режим №2
 */

            else if (sillyMode == 2){

                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {

                        if (map[i][j] == EMPTY) {

                            temp = checkCellsNearby(i, j);

                            if (temp > numOfSameSimybolsNearby) {

                                numOfSameSimybolsNearby = temp;
                                x = i;
                                y = j;
                            }
                        }
                    }
                }

            if (numOfSameSimybolsNearby > 0) {

                computerDecision(x, y);

            } else {

            }
        }
    }

    public static int checkCellsNearby(int x, int y) {
        int quantity = 0;

        for (int i = x - 1; i < 2; i++) {
            for (int j = y - 1; j < 2; j++) {

                if (isCellExists(i, j) && map[i][j] == O_COM) {

                    quantity++;
                }
            }
        }
        return quantity;
    }


        private static void computerDecision(int x, int y){

            map[x][y]=O_COM;
            System.out.println("Компьютер выбрал ячейку " + (x+1) + " " + (y+1));
            System.out.println();
        }

        public static boolean isCellExists(int x, int y){

            boolean result = true;
            if(x<0 || y<0 || x>=SIZE || y>=SIZE){
                result = false;
            }
            return result;
        }

                /*
Логика работы. Режим №3
 */

       /*
Метод проверки выбранной ячейки
 */

    public static boolean isCellValue ( int x, int y){
        boolean result = true;
        if (x >= SIZE || x < 0 || y >= SIZE || y < 0) {
            result = false; }

        else if (map[x][y] != EMPTY) {
            result = false;
        }
        return result;
    }

    /*
Метод проверки условий для завершения игры
*/

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

    /*
Условия при котором наступает ничья
*/
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

    /*
Условия при котором наступает выигрыш
*/
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

        /*
Инициализация игрового поля
*/

    public static void initMap () {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = EMPTY;
            }
        }
    }

            /*
Отображение игрового поля.
*/

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
}
