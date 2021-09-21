package HW4;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    static final int SIZE = 7;
    static final int WIN = 4;

    static final char DOTE_X = 'X';
    static final char DOTE_0 = '0';
    static final char DOTE_EMPTY = '*';

    static char[][] field;

    static Scanner scan = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        initializationField();
        drawField();

        for (int i = 0; i < (SIZE * SIZE); i++) {
            humanTurn();
            drawField();
            if (checkWin(DOTE_X)) {
                System.out.println("Human WIN!!");
                break;
            }
            if (isFool()) {
                System.out.println("Ничья");
                break;
            }

            iiTurn();
            drawField();
            if (checkWin(DOTE_0)) {
                System.out.println("Human LOOSE!!");
                break;
            }
            if (isFool()) {
                System.out.println("Ничья");
                break;
            }
        }


    }

    public static void initializationField() {
        field = new char[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = DOTE_EMPTY;
            }
        }
    }

    public static void drawField() {
        System.out.print("   ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + "  ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.printf(" %c ", field[i][j]);
            }
            System.out.println(" ");
        }
    }

    public static void humanTurn() {
        int x, y;

        do {
            System.out.println("Input y x");
            y = scan.nextInt() - 1;
            x = scan.nextInt() - 1;
        } while (!isCellValid(y, x));
        field[y][x] = DOTE_X;

    }

    public static void iiTurn() {
        int x, y;

        do {
            y = random.nextInt(SIZE);
            x = random.nextInt(SIZE);
        } while (!isCellValid(y, x));
        if (botWin(DOTE_X)) {
            field[y][x] = DOTE_0;
        }
    }


    public static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        return field[y][x] == DOTE_EMPTY;
    }

    public static boolean isFool() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (field[i][j] == DOTE_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkWin(char c) {

        for (int i = 0; i < WIN; i++) {
            for (int j = 0; j < WIN; j++) {
                if (field[i][j] == c && field[i][j + 1] == c && field[i][j + 2] == c && field[i][j + 3] == c ||
                        field[j][i] == c && field[j + 1][i] == c && field[j + 2][i] == c && field[j + 3][i] == c) {
                    return true;

                } else if (field[i][j] == c && field[i + 1][j + 1] == c && field[i + 2][j + 2] == c && field[i + 3][j + 3] == c ||
                        field[i + 2][j] == c && field[i + 1][j + 1] == c && field[i][j + 2] == c && field[i][j + 3] == c) {


//                if (field[i][j] == c && field[i][j + 1] == c && field[i][j + 2] == c ||
//                        field[j][i] == c && field[j + 1][i] == c && field[j + 2][i] == c) {
//                    return true;
//
//                } else if (field[i][j] == c && field[i+1][j+1] == c && field[i+2][j+2] == c ||
//                        field[i+2][j] == c && field[i+1][j+1] == c && field[i][j+2] == c) {
                    return true;
                }
            }

//        if (field[0][0] == c && field[0][1] == c && field[0][2] == c) {
//            return true;
//        }
//        if (field[1][0] == c && field[1][2] == c && field[1][2] == c) {
//            return true;
//        }
//        if (field[2][0] == c && field[2][1] == c && field[2][2] == c) {
//            return true;
//        }
//
//        if (field[0][0] == c && field[1][0] == c && field[2][0] == c) {
//            return true;
//        }
//        if (field[0][1] == c && field[1][1] == c && field[2][1] == c) {
//            return true;
//        }
//        if (field[0][2] == c && field[1][2] == c && field[2][2] == c) {
//            return true;
//        }
//
//        if (field[0][0] == c && field[1][1] == c && field[2][2] == c) {
//            return true;
//        }
//        if (field[0][2] == c && field[1][1] == c && field[2][0] == c) {
//            return true;
        }
        return false;
    }


    public static boolean botWin(char a) {
        for (int i = 0; i < WIN; i++) {
            for (int j = 0; j < WIN; j++) {
                if (field[i][j] == a) {
                    if (field[i][j] == a && field[i][j + 2] == a || field[i][j + 1] == a && field[i][j + 3] == a ||
                            field[j][i] == a && field[j + 2][i] == a || field[j + 1][i] == a && field[j + 3][i] == a) {
                        return true;
                    } else if (field[i][j] == a && field[i + 2][j + 2] == a || field[i + 1][j + 1] == a && field[i + 3][j + 3] == a ||
                            field[i + 2][j] == a && field[i][j + 2] == a || field[i + 1][j + 1] == a && field[i][j + 3] == a) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}










