package com.company;
import java.io.*;

public class AllCapitals {
    public static void main(String[] args) {
        String pathFile = "res/lines.txt";
        StringBuilder uppercasedText = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(pathFile));
        ) {
            String line = reader.readLine();
            while (line != null) {
                uppercasedText.append(line.toUpperCase() + "\n");
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter(pathFile))) {
            writer.write(uppercasedText.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
