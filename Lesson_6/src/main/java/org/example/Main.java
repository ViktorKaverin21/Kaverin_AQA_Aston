package org.example;

public class Main {
    public static void main(String[] args) {
        String[] header = {"First column", "Second column", "Third column"};
        int[][] data = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        AppData appData = new AppData(header, data);
        appData.save("data.csv");

        AppData loadedData = AppData.load("data.csv");
        if (loadedData != null) {
            for (String element : loadedData.header) {
                System.out.print(element + "  ");
            }
            System.out.println();
            for (int[] row : loadedData.data) {
                for (int element : row) {
                    System.out.print(element + "  ");
                }
                System.out.println();
            }
        }
    }
}