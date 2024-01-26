class Bowl {
    private int food;
    public Bowl(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
        } else {
            System.out.println("Not enough food in the plate");
        }
    }

    public void addFood(int amount) {
        food += amount;
    }
}
