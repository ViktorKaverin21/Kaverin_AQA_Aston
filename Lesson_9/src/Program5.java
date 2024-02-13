import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        List<String> logins = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter logins:");
        String login = scanner.nextLine();

        while (!login.isEmpty()) {
            logins.add(login);
            login = scanner.nextLine();
        }

        System.out.println("Logins starting with a letter 'f':");
        for (String l : logins) {
            if (l.startsWith("f")) {
                System.out.println(l);
            }
        }
    }
}