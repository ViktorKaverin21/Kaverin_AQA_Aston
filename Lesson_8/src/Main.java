import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = {"cat", "dog", "bowl", "boll", "pen", "cat", "bowl", "car", "apple", "picture", "apple", "dog", "strawberry", "dog"};

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        System.out.println("Unique words: " + uniqueWords);

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        System.out.println("Word count: " + wordCount);

        Phonebook phonebook = new Phonebook();
        phonebook.add("1111111111", "Ivanov");
        phonebook.add("2222222222", "Smirnov");
        phonebook.add("3333333333", "Ivanov");

        List<String> ivanovNumbers = phonebook.get("1111111111");
        System.out.println("Surnames for phone number '1111111111': " + ivanovNumbers);

        List<String> smirnovNumbers = phonebook.get("2222222222");
        System.out.println("Surnames for phone number '2222222222': " + smirnovNumbers);

        ivanovNumbers = phonebook.get("3333333333");
        System.out.println("Surnames for phone number '3333333333': " + ivanovNumbers);
    }
}