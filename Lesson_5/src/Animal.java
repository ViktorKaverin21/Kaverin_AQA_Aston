public class Animal {
    private static int animalCount;
    public Animal() {
        animalCount++;
    }

    public void run (int distance) {
        System.out.println("The animal ran " + distance + " meters");
    }

    public void swim (int distance) {
        System.out.println("The animal swam " + distance + " meters");
    }

    public static void printQuantityOfAnimals() {
        System.out.println("\nNumber of animals : " + animalCount);
    }
}