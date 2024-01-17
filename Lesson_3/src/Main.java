//1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
//2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
//3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
//4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;
//5. Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
//6. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
//7. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100;
//8. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
//9. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], ..., [n][n];
//10. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue.

public class Main {
    public static void main(String[] args) {
        System.out.println(isCheckSum(10, 10));
        System.out.println(isCheckSum(3, 4));

        isPrintNumberType(1);
        isPrintNumberType(-1);
        isPrintNumberType(0);

        System.out.println(isNegative(-10));
        System.out.println(isNegative(5));

        isPrintStringNTimes("Aston ", 3);

        System.out.println(isLeapYear(2024));
        System.out.println(isLeapYear(1950));
        System.out.println(isLeapYear(1996));

        int[] replaceValues = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] multiply = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        zerosAndOnes(replaceValues);
        System.out.println("\n");

        fillArray(100);
        System.out.println("\n");

        multiplyNumbers(multiply);
        System.out.println("\n");

        squareArray();
        System.out.println("\n");

        createArray(5, 6);

    }

    public static boolean isCheckSum(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void isPrintNumberType(int number) {
        System.out.println(number >= 0 ? "Положительное число" : "Отрицательное число");
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void isPrintStringNTimes(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(str);
        }
        System.out.println();
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static void zerosAndOnes(int[] replaceValues) {
        for (int i = 0; i < replaceValues.length; i++) {
            replaceValues[i] = (replaceValues[i] > 0) ? 0 : 1;
            System.out.print(replaceValues[i] + " ");
        }
    }

    public static void fillArray(int size) {
        int[] fillArr = new int[size];
        for (int i = 0; i < fillArr.length; i++) {
            fillArr[i] = i + 1;
            System.out.print(fillArr[i] + " ");
        }
    }

    public static void multiplyNumbers(int[] multiply) {
        for (int i = 0; i < multiply.length; i++) {
            if (multiply[i] < 6) {
                multiply[i] = multiply[i] * 2;
            }
            System.out.print(multiply[i] + " ");
        }
    }

    public static void squareArray() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                arr[i][j] = (i == j || i == x) ? 1 : 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }
}