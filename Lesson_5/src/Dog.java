public class Dog extends Animal {

    private String dogName;
    private static int dogCount;
    public Dog(String dogName) {
        super();
        this.dogName = dogName;
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance > 0 && distance <= 500) {
            System.out.println("The dog " + dogName + " ran " + distance + " meters");
        }
        if (distance > 500)
            System.out.println("The dog " + dogName + " сannot run more than 500 meters");
    }

    @Override
    public void swim(int distance) {
        if (distance > 0 && distance <= 10) {
            System.out.println("The dog " + dogName + " swam " + distance + " meters");
        }
        if (distance > 10)
            System.out.println("The dog " + dogName + " cannot swim more than 10 meters");
    }

    public static void printQuantityOfDogs() {
        System.out.println("Number of dogs : " + dogCount);
    }
}