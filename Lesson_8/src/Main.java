import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = {"cat","dog","bowl","boll","pen","cat","bowl","car","apple","picture","apple","dog","strawberry","dog"};

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        System.out.println("Unique words: " + uniqueWords);
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        System.out.println("Word count: " + wordCount);

        Phonebook phonebook = new Phonebook();
        phonebook.add("Ivanov", "1111111111");
        phonebook.add("Smirnov", "2222222222");
        phonebook.add("Ivanov", "3333333333");

        List<String> ivanovNumbers = phonebook.get("Ivanov");
        System.out.println("Phone numbers for surname 'Ivanov': " + ivanovNumbers);

        List<String> smirnovNumbers = phonebook.get("Smirnov");
        System.out.println("Phone numbers for surname 'Smirnov': " + smirnovNumbers);

    }
}