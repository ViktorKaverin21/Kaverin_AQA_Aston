import java.util.ArrayList;

class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }
    public float getWeight() {
        if (fruits.isEmpty()) {
            return 0;
        }

        float weight = 0.0f;
        for (T fruit : fruits) {
            if (fruit instanceof Apple) {
                weight += 1.0f;
            } else if (fruit instanceof Orange) {
                weight += 1.5f;
            }
        }
        return weight;
    }

    public boolean compare(Box<?> box) {
        return this.getWeight() == box.getWeight();
    }

    public void transferFruits(Box<T> box) {
        if (this == box) {
            return;
        }

        box.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}