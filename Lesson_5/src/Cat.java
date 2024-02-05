public class Cat extends Animal {
    private String name;
    private int needFood;
    private boolean satiety = false;
    private static int catCount;

    public Cat(String name, int needFood) {
        super();
        this.name = name;
        this.needFood = needFood;
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance > 0 && distance <= 200) {
            System.out.println("The cat " + name + " ran " + distance + " meters");
        }
        if (distance > 200)
            System.out.println("The cat " + name + " сannot run more than 200 meters");
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cats can't swim");
    }

    public static void printQuantityOfCats() {
        System.out.println("Number of cats : " + catCount);
    }

    public void eatFood(Bowl bowl) {
        if (satiety)
            System.out.println("The cat " + name + " not hungry");
        else if (bowl.getAmountOfFood() >= needFood && satiety == false) {
            bowl.decreaseAmountOfFood(needFood);
            satiety = true;
            System.out.println("\nThe cat " + name + " ate "
                    + needFood + " eat");
        } else
            System.out.println("\nThe cat " + name + " didn't eat because he didn't have enough ");
    }

    public void satietyInfo() {
        if (satiety) System.out.println("\nThe cat " + name + " has eaten and is no longer hungry");
        else System.out.println("\nThe cat " + name + " has not eaten and demands to be fed");
    }
}