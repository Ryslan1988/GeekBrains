package hw1;

// добавление в пул не до конца разобрался, извините
public class HomeWorkApp {
    public static void main(String[] args) {

        printThreeWords();
        checkSumSign(2, 5);
        printColor(17);
        compareNumbers(2, 8);

        System.out.println(tekaNumber(2, 5));
        System.out.println(tekaNumber(6, 5));
        System.out.println(tekaNumber(7, 22));
        System.out.println(tekaNumber(5, 45));
        System.out.println(tekaNumber(1, 1));

        positiveNumber(5);
        positiveNumber(-5);
        positiveNumber(0);
        positiveNumber(15);
        positiveNumber(-242434234);

        System.out.println(negaveNumber(25));
        System.out.println(negaveNumber(-25));
        System.out.println(negaveNumber(0));
        System.out.println(negaveNumber(2));
        System.out.println(negaveNumber(52));

        stringNumber("The next level", 5);
        stringNumber("The oops", 1);
        stringNumber("Have a little time", 2);
        stringNumber("Need more information", 3);
        stringNumber("Need to do something", 4);


        System.out.println(leapНear(1924));
        System.out.println(leapНear(2005));
        System.out.println(leapНear(100));
        System.out.println(leapНear(1983));
        System.out.println(leapНear(400));

    }


    /**
     * Этот метод выполняет функционал
     * развертвания 5 фраз
     * в столбец
     */
    public static void printThreeWords() {
        System.out.println("Orange ");
        System.out.println("Banana ");
        System.out.println("Apple ");
        System.out.println("sad ");
        System.out.println("saasd");


    }

    public static void checkSumSign(int a, int b) {

        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value < 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");

        } else {
            System.out.println("a < b");
        }
    }


    /**
     * Метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
     * в противном случае – false.
     */

    public static boolean tekaNumber(int c, int d) {
        return (c + d) >= 10 && (c + d) <= 20;
    }

    /**
     * Метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
     * положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
     */
    public static void positiveNumber(int a) {
        if (a >= 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }

    }

    /**
     * Написать метод, которому в качестве параметра передается целое число.
     * Метод должен вернуть true, если число отрицательное,
     * и вернуть false если положительное.
     */
    public static boolean negaveNumber(int a) {
        return a < 0;
    }

    /**
     * Написать метод, которому в качестве аргументов передается строка и число,
     * метод должен отпечатать в консоль указанную строку, указанное количество раз;
     */
    public static void stringNumber(String d, int a) {

        for (int i = 0; i < a; i++) {
            System.out.println(d);
        }
    }


    /**
     * Написать метод, который определяет, является ли год високосным,
     * и возвращает boolean (високосный - true, не високосный - false).
     * Каждый 4-й год является високосным, кроме каждого 100-го,
     * при этом каждый 400-й – високосный.
     */
    public static boolean leapНear(int year) {
        if (year % 4 == 0) {
            if ((year % 100 != 0) || (year % 400 == 0)) {
                return true;
            } else if (!(year % 100 == 0)) {
                return false;
            } else {
                return false;
            }

        }
        return false;
    }
}

