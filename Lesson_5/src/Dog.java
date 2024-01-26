public class Dog extends Animal {
    String name;
    static int countDod = 0;

    Dog(String name) {
        super();
        countDod++;
        this.name = name;
    }

    @Override
    void run(int ran) {
        if (ran > 500) {
            System.out.println(name + " cannot to run more 500 m");
        } else {
            System.out.println(name + " have run " + ran + " m");
        }

    }

    @Override
    void swim(int swim) {
        if (swim > 10) {
            System.out.println("Dog cannot to swim more " + swim + " m");
        } else {
            System.out.println(name + " have swam " + swim + " m");
        }
    }

    static int getCountDod() {
        return countDod;
    }
}
 