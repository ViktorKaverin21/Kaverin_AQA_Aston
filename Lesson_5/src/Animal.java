class Animal {
    protected String name;
    protected int runLimit;
    protected int swimLimit;
    protected static int animalCount;

    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        animalCount++;
    }

    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " ran " + distance + " м.");
        } else {
            System.out.println(name + " can't run " + distance + " м.");
        }
    }

    public void swim(int distance) {
        if (distance <= swimLimit) {
            System.out.println(name + " swam " + distance + " м.");
        } else {
            System.out.println(name + " can't swim " + distance + " м.");
        }
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}