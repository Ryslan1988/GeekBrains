package Java2HW2;

public class Java2HW2 {

   static class MyException extends Exception {
        MyException(String message) {
            super(message);
        }
    }

    static class MyArrayDataException extends MyException {

        MyArrayDataException(int row, int col) {
            super(String.format("Неверные данные находятся в [%d, %d]\n", row, col));
        }
    }

    static class MyArraySizeException extends MyException {

        MyArraySizeException() {
            super("Размер массива  [4 x 4]\n");
        }
    }

    static class Converter {
         static int strConverter(String[][] strArray)
                throws MyArraySizeException, MyArrayDataException {

            int sum = 0;

            if (4 != strArray.length) throw new MyArraySizeException();
            for (int i = 0; i < strArray.length; i++) {
                if (4 != strArray[i].length) throw new MyArraySizeException();
                for (int k = 0; k < strArray[i].length; k++) {
                    try {
                        sum += Integer.parseInt(strArray[i][k]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, k);
                    }
                }
            }

            return sum;
        }
    }

    public static class HomeWork2 {

        private static void emiCalc(double[][] human) {

            for (int i = 0; i < human.length; i++) {
                for (int j = 0; j < human[i].length; j += 2) {
                    double bmi = human[i][j] / (human[i][j + 1] * human[i][j + 1]);

                    System.out.printf("Weight: %.2f\tHeight: %.2f | BMI: %.2f | ", human[i][j], human[i][j + 1], bmi);

                    if (bmi < 14.7) {
                        System.out.print("Underweight\n");
                    } else if (bmi > 14.7 && bmi < 23.0) {
                        System.out.print("Normal\n");
                    } else if (bmi > 23.0 && bmi < 28.0) {
                        System.out.print("Overweight\n");
                    } else {
                        System.out.print("Obesity\n");
                    }
                }
            }
        }

        public static void main(String[] args) {

            String[][] correctMatrix = {
                    {"2", "4", "1", "1"},
                    {"5", "2", "3", "1"},
                    {"1", "0", "8", "2"},
                    {"3", "0", "9", "1"}
            };
            String[][] wrongSizeMatrix = {
                    {"0", "3", "1", "5"},
                    {"4", "5", "2", "6"},
                    {"8", "5", "2", "7"},
                    {"1", "7"}
            };
            String[][] wrongCharMatrix = {
                    {"6", "2", "7", "5"},
                    {"2", "5", "4", "6"},
                    {"3", "4", "6", "7"},
                    {"5", "2", "5", "3"}
            };

            try {
                System.out.println("Экспозиция 1:");
                System.out.println("Сумма всех элементов массива равна " + Converter.strConverter(correctMatrix) + ".\n");
            } catch (MyException e) {
                e.getMessage();
            }

            try {
                System.out.println("Экспозиция 2:");
                System.out.println("Сумма всех элементов массива равна " + Converter.strConverter(wrongSizeMatrix) + ".\n");
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }

            try {
                System.out.println("Экспозиция 3:");
                System.out.println("Сумма всех элементов массива равна " + Converter.strConverter(wrongCharMatrix) + ".\n");
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }

        }
    }
}