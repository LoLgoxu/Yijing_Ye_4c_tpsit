package it.itisgalileiroma.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvFileReader {

    public CsvFileReader() {

    }

    /**
     * Reads a CSV file line by line using BufferedReader and skips the first row (headers).
     * @param filePath the path of the CSV file to be read
     */
    public void readCsvFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Skip the first line (header)
            if ((line = br.readLine()) != null) {
                // System.out.println("Skipping header: " + line); // Optional: Debug log
            }

            // Read the remaining lines
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading the CSV file: " + e.getMessage());
        }
    }


}