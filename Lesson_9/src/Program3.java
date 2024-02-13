import java.util.ArrayList;
import java.util.Arrays;

public class Program3 {
    public static void main(String[] args) {
        ArrayList<String> collection = new ArrayList<>();
        collection.add("f10");
        collection.add("f15");
        collection.add("f2");
        collection.add("f4");
        collection.add("f4");

        String[] sortedArray = collection.toArray(new String[0]);
        Arrays.sort(sortedArray);

        System.out.println("Sorted array:");
        for (String element : sortedArray) {
            System.out.println(element);
        }
    }
}