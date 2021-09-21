package HW3;

public class HomeWork3 {
    public static void main(String[] args) {
        //zd1();
        //zd2();
        //zd3();
       // zd4();
        zd5(5,20);

    }

    /**
     * Задать целочисленный массив,
     * состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    public static void zd1() {
        int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.print(arr[i]);

        }
        System.out.println(" ");
    }


    /**
     * 2. Задать пустой целочисленный массив длиной 100.
     * С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
     *
     * @return
     */
    public static void zd2() {
        int[] arr1 = new int[101];
        int i;
        for (i = 1; i < arr1.length; i++) {
            arr1[i] = i++;
        }
    }

    /**
     * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
     * пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    public static void zd3() {
        int[] arr2 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) {
                arr2[i] *= 2;
            }
            System.out.println(arr2[i]);
        }
    }

    /**
     * Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
     * если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
     * то есть [0][0], [1][1], [2][2], …, [n][n];
     */
    public static void zd4() {
        int[][] arr4 = new int[7][7];
        int a = 7;
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                if (j == i) {
                    arr4[i][j] = i;
                }
                System.out.print(" " + arr4[i][j]);
            }System.out.println();

        }

    }
/**
 Написать метод, принимающий на вход два аргумента: len и initialValue,
 и возвращающий одномерный массив типа int длиной len,
 каждая ячейка которого равна initialValue;
 */
        public static void zd5(int len, int initialValue) {
            int [] arr5 = new int [len];
            for(int i=0; i< arr5.length; i++){
                for (int j=0; j< arr5.length;j++){
                    arr5[i]=initialValue;
                }
                System.out.print(" "+ arr5[i]);
            }
            System.out.println();

        }
}



