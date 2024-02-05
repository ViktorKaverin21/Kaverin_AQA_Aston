package org.example;

<<<<<<< HEAD
import com.opencsv.exceptions.CsvValidationException;

=======
>>>>>>> a2a0b04fa99a67e0f825773abe5d0b3827429830
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String[] header = {"First column", "Second column", "Third column"};
        int[][] data = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        AppData appData = new AppData(header, data);

        try {
            appData.save("data.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            appData.load("data.csv");
<<<<<<< HEAD
        } catch (IOException | CsvValidationException e) {
=======
        } catch (IOException e) {
>>>>>>> a2a0b04fa99a67e0f825773abe5d0b3827429830
            e.printStackTrace();
        }
    }
}