import java.util.*;

public class Phonebook {
    private Map<String, String> phonebook;

    public Phonebook() {
        phonebook = new HashMap<>();
    }

    public void add(String surname, String phoneNumber ) {
        phonebook.put(surname, phoneNumber);
    }

    public List<String> get(String phoneNumber) {
        List<String> surnames = new ArrayList<>();
        for (Map.Entry<String, String> entry : phonebook.entrySet()) {
            if (entry.getKey().equals(phoneNumber)) {
                surnames.add(entry.getValue());
            }
        }
        return surnames;
    }
}
