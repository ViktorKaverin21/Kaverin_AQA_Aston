class Cat extends Animal {
    private boolean satiety;

    public Cat(String name) {
        super(name, 200, 0);
        satiety = false;
    }

    public void eat(int foodAmount) {
        if (foodAmount >= 0) {
            satiety = true;
            System.out.println(name + " ate and became full.");
        } else {
            System.out.println(name + " can't eat that much food.");
        }
    }

    public boolean isSatiety() {
        return satiety;
    }
}
