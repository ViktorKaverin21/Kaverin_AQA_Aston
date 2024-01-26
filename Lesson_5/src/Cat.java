public class Cat extends Animal {
    String name;
    static int countCat = 0;

    Cat(String name) {
        super();
        countCat++;
        this.name = name;
    }

    @Override
    void run(int ran) {
        if (ran > 200) {
            System.out.println(name + " cannot to run more 200 m");
        } else {
            System.out.println(name + " have run " + ran + " m");
        }
    }

    @Override
    void swim(int swim) {
        System.out.println("Cat cannot to swim");
    }

    static int getCountCat() {
        return countCat;
    }
}

