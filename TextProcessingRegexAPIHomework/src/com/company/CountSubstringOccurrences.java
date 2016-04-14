package com.company;
import java.util.Scanner;

public class CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase();
        String word = scanner.nextLine();
        int count = countString(text, word);
        System.out.println(count);
    }

    public static int countString(String text, String word) {

        int count = 0;
        int i = 0;
        while ((i = text.indexOf(word, i)) != -1) {
            i++;
            count++;
        }
        return count;
    }
}
