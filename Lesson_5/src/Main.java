public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Tuzik");
        Cat cat1 = new Cat("Barsik", 20);
        Cat cat2 = new Cat("Murzik", 25);

        cat1.run(201);
        cat2.run(200);
        dog1.run(500);
        dog1.run(501);
        cat1.swim(1);
        dog1.swim(9);
        dog1.swim(11);

        Animal.printQuantityOfAnimals();
        Cat.printQuantityOfCats();
        Dog.printQuantityOfDogs();

        Cat[] cats = new Cat[4];
        cats[0] = cat1;
        cats[1] = cat2;
        cats[2] = new Cat("Marsik", 30);
        cats[3] = new Cat("Persik", 25);

        Bowl bowl = new Bowl();
        bowl.increaseAmountOfFood(74);

        for (Cat cat : cats) {
            cat.eatFood(bowl);
        }

        bowl.info();

        for (Cat cat : cats) {
            cat.satietyInfo();
        }
    }
}