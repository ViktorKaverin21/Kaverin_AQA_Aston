import java.util.Random;

public class Program1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];
        int evenCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);

            if (numbers[i] % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println("Number of even numbers: " + evenCount);
    }
}