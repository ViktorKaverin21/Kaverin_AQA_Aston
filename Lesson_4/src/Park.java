public class Park {

    public class Attractions {
        private String name;
        private String time;
        private double price;

        public Attractions(String name, String time, double price) {
            this.name = name;
            this.time = time;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public String getTime() {
            return time;
        }

        public double getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {

        Park park = new Park();
        Park.Attractions attraction = park.new Attractions("Carousel", "09:00 - 20:00", 7.0);

        System.out.println("Attraction name: " + attraction.getName());
        System.out.println("Attraction time: " + attraction.getTime());
        System.out.println("Attraction price: " + attraction.getPrice());
    }
}