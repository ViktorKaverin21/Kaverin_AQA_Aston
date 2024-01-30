package org.example;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public void save(String filePath) throws IOException {
        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
            writer.writeNext(header);

            for (int[] row : data) {
                String[] rowAsString = new String[row.length];
                for (int i = 0; i < row.length; i++) {
                    rowAsString[i] = String.valueOf(row[i]);
                }
                writer.writeNext(rowAsString);
            }
        }
    }

    public void load(String filePath) throws IOException {
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            try {
                header = reader.readNext();
            } catch (CsvValidationException e) {
                throw new RuntimeException(e);
            }

            String[] nextLine;
            while (true) {
                try {
                    if (!((nextLine = reader.readNext()) != null))
                        break;
                } catch (CsvValidationException e) {
                    throw new RuntimeException(e);
                }
                int[] row = new int[nextLine.length];
                for (int i = 0; i < nextLine.length; i++) {
                    row[i] = Integer.parseInt(nextLine[i]);
                }
            }
        }
    }
}