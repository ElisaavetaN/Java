package com.company;
import java.io.*;

public class SumLines {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(
                new FileReader(
                        new File("res/liness.txt")))) {
            String line = reader.readLine();
            while (line != null) {
                int currentLineSum = 0;
                for (int i = 0; i < line.length(); i++) {
                    currentLineSum += line.charAt(i);
                }
                System.out.println(currentLineSum);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
