public class Animal {
    static int countAnimal = 0;

    Animal() {
        countAnimal++;
    }

    void run(int ran) {
        System.out.println("Animal have run " + ran + " m");
    }

    void swim(int ran) {
        System.out.println("Animal have swam " + ran + " m");
    }

}