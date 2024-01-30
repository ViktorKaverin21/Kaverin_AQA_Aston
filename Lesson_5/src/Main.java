public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Tuzik");
        Cat cat1 = new Cat("Barsik");
        Cat cat2 = new Cat("Tuzik");

        Animal[] animals = {dog, cat1, cat2};
        Bowl bowl = new Bowl(15);

        for (Animal animal : animals) {
            animal.run(300);
            animal.swim(5);
        }

        System.out.println("Number of animals created: " + Animal.getAnimalCount());

        System.out.println("Information about cats' satiety:\n");
        for (Cat cat : new Cat[]{cat1, cat2}) {
            cat.eat(bowl.getFoodAmount());
            System.out.println(cat.name + " full: " + cat.isSatiety());
        }

        System.out.println("Adding food to the bowl...");
        bowl.addFood(10);

        System.out.println("New information about satiety of cats:");
        for (Cat cat : new Cat[]{cat1, cat2}) {
            cat.eat(bowl.getFoodAmount());
            System.out.println(cat.name + " full: " + cat.isSatiety());
        }
    }
}
