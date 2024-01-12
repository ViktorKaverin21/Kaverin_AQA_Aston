public class HomeWork {
    public static void printThreeWords() {

        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

    public static void checkSumSign() {
        int a = 7;
        int b = -5;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Положительная сумма " + sum);
        } else {
            System.out.println("Отрицательная сумма " + sum);

        }
    }

    public static void printColor() {
        int value = 52;
        if (value < 0) {
            System.out.println("Красный");
        } else if (value >= 0 && value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");

        }

    }

    public static void compareNumbers() {
        int a = 6;
        int b = 5;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }
}
