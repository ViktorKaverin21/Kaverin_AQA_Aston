class Bowl {
    private int foodAmount;

    public Bowl(int foodAmount) {
        this.foodAmount = Math.max(0, foodAmount);
    }

    public void addFood(int amount) {
        foodAmount += Math.max(0, amount);
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}
