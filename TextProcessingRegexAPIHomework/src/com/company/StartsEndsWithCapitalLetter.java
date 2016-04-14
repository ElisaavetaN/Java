package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartsEndsWithCapitalLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Pattern extract = Pattern.compile("\\b[A-Z][a-zA-Z]*[A-Z]\\b");
        Matcher matching = extract.matcher(str);


        while (matching.find()) {
            System.out.print(matching.group() + " ");
        }
    }
}
