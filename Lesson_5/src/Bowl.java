public class Bowl {
    private int amountOfFood;

    public void increaseAmountOfFood(int amountOfFood) {
        this.amountOfFood += amountOfFood;
    }

    public void decreaseAmountOfFood(int amountToDecrease) {
        amountOfFood -= amountToDecrease;
    }

    public int getAmountOfFood() {
        return amountOfFood;
    }

    public void info() {

        System.out.println("\nAmount of food in bowl : " + amountOfFood);

    }
}