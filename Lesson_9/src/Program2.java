import java.util.ArrayList;
import java.util.Collections;

public class Program2 {
    public static void main(String[] args) {
        ArrayList<String> collection = new ArrayList<>();
        collection.add("Highload");
        collection.add("High");
        collection.add("Load");
        collection.add("Highload");

        int countHigh = Collections.frequency(collection, "High");
        System.out.println("Number of 'High' in collection: " + countHigh);

        String firstElement = (collection.size() > 0) ? collection.get(0) : "0";
        System.out.println("First element in the collection: " + firstElement);

        String lastElement = (collection.size() > 0) ? collection.get(collection.size() - 1) : "0";
        System.out.println("Last item in the collection: " + lastElement);
    }
}