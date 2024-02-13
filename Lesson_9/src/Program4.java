import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

public class Program4 {
    private static Collection<Student> students = Arrays.asList(
            new Student("Дмитрий", 18, Gender.MAN),
            new Student("Максим", 17, Gender.MAN),
            new Student("Екатерина", 17, Gender.WOMAN),
            new Student("Михаил", 28, Gender.MAN)
    );

    private enum Gender {
        MAN,
        WOMAN
    }

    private static class Student {
        private final String name;
        private final Integer age;
        private final Gender gender;

        public Student(String name, Integer age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Gender getGender() {
            return gender;
        }

        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    "}";
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name) &&
                    Objects.equals(age, student.age) &&
                    Objects.equals(gender, student.gender);
        }

        public int hashCode() {
            return Objects.hash(name, age, gender);
        }
    }

    public static void main(String[] args) {
        double averageAgeOfMales = calculateAverageAgeOfMales(students);
        System.out.println("Average age of male students: " + averageAgeOfMales);

        Collection<Student> studentsOfDraftAge = getStudentsOfDraftAge(students);
        System.out.println("Students at risk of receiving a summons this year:");
        for (Student student : studentsOfDraftAge) {
            System.out.println(student.getName());
        }
    }

    private static double calculateAverageAgeOfMales(Collection<Student> students) {
        int sumOfAges = 0;
        int countOfMales = 0;

        for (Student student : students) {
            if (student.getGender() == Gender.MAN) {
                sumOfAges += student.getAge();
                countOfMales++;
            }
        }

        return (double) sumOfAges / countOfMales;
    }

    private static Collection<Student> getStudentsOfDraftAge(Collection<Student> students) {
        Collection<Student> studentsOfDraftAge = new ArrayList<>();

        for (Student student : students) {
            if (student.getAge() >= 18 && student.getAge() <= 27) {
                studentsOfDraftAge.add(student);
            }
        }

        return studentsOfDraftAge;
    }
}