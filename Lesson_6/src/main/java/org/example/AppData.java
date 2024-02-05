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
<<<<<<< HEAD
        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath), ';',
                CSVWriter.DEFAULT_QUOTE_CHARACTER,
                CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                CSVWriter.DEFAULT_LINE_END)) {
=======
        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
>>>>>>> a2a0b04fa99a67e0f825773abe5d0b3827429830
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

<<<<<<< HEAD
    public void load(String filePath) throws IOException, CsvValidationException {
=======
    public void load(String filePath) throws IOException {
>>>>>>> a2a0b04fa99a67e0f825773abe5d0b3827429830
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            try {
                header = reader.readNext();
            } catch (CsvValidationException e) {
                throw new RuntimeException(e);
            }

            String[] nextLine;
<<<<<<< HEAD
            while ((nextLine = reader.readNext()) != null) {
                int[] row = new int[nextLine.length];
                for (int i = 0; i < nextLine.length; i++) {
                    String[] rowData = nextLine[i].split(";");
                    row[i] = Integer.parseInt(rowData[0].replaceAll("\"", ""));
=======
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
>>>>>>> a2a0b04fa99a67e0f825773abe5d0b3827429830
                }
            }
        }
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> a2a0b04fa99a67e0f825773abe5d0b3827429830