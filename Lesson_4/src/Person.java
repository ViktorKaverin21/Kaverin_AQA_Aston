//Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//        Конструктор класса должен заполнять эти поля при создании объекта.
//        Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
//
//        Создать массив из 5 сотрудников.
//        Пример:
//// вначале объявляем массив объектов
//        Person[] persArray = new Person[5];
//// потом для каждой ячейки массива задаем объект
//        persArray[0] = new Person("Ivanov Ivan", "Engineer",
//        "ivivan@mailbox.com", "892312312", 30000, 30);
//        persArray[1] = new Person(...);
//        ...
//        persArray[4] = new Person(...);



public class Person {
    private String name;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    Person(String name, String position, String email, String phone, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Position: " + position + ", email: " + email + ", Phone: "
                + phone + ", Salary: " + salary + ", Age: " + age;
    }

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
    }

    void print() {
        System.out.println(toString());
    }
}