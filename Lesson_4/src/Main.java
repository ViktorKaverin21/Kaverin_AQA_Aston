import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person employee = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        employee.print();

        Person[] persArray = new Person[5];

        persArray[0] = new Person("Ivanov Aleksander", "Engineer", "name1@mail.ru", "1111111112", 1000, 25);
        persArray[1] = new Person("Ivanov Nikita", "Engineer", "name2@mail.ru", "1111111113", 2000, 26);
        persArray[2] = new Person("Ivanov Egor", "Engineer", "name3@mail.ru", "1111111114", 3000, 27);
        persArray[3] = new Person("Ivanov Maksim", "Engineer", "name4@mail.ru", "1111111115", 4000, 28);
        persArray[4] = new Person("Ivanov Viktor", "Engineer", "name5@mail.ru", "1111111116", 5000, 29);

        for (int i = 0; i < persArray.length; i++) {
            persArray[i].print();
        }

        Park park = new Park();
        park.addAttraction("Ferris Wheel", "10:00 - 20:00", 8.0);
        park.addAttraction("Autodrome", "09:00 - 19:00", 7.0);
        park.addAttraction("Calipso", "11:00 - 21:00", 6.0);

        List<Attraction> attractions = park.getAttractions();
        for (Attraction attraction : attractions) {
            System.out.println(attraction);
        }
    }
}

