public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        System.out.println("Apple Box 1 Weight: " + appleBox1.getWeight());
        System.out.println("Apple Box 2 Weight: " + appleBox2.getWeight());
        System.out.println("Orange Box Weight: " + orangeBox.getWeight());

        System.out.println("Comparing Apple Box 1 and Apple Box 2: " + appleBox1.compare(appleBox2));
        System.out.println("Comparing Apple Box 1 and Orange Box: " + appleBox1.compare(orangeBox));

        Box<Apple> appleBox3 = new Box<>();
        appleBox3.addFruit(new Apple());
        appleBox3.addFruit(new Apple());

        System.out.println("Apple Box 3 Weight before transfer: " + appleBox3.getWeight());
        System.out.println("Apple Box 2 Weight before transfer: " + appleBox2.getWeight());

        appleBox3.transferFruits(appleBox2);

        System.out.println("Apple Box 3 Weight after transfer: " + appleBox3.getWeight());
        System.out.println("Apple Box 2 Weight after transfer: " + appleBox2.getWeight());
    }
}