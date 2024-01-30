public class Attraction {
    private String name;
    private String workingHours;
    private double price;

    public Attraction(String name, String workingHours, double price) {
        this.name = name;
        this.workingHours = workingHours;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Name Attraction: " + name + ", Working hours: " + workingHours + ", Price: " + price;
    }
}
