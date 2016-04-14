package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Pattern extract = Pattern.compile("([A-Za-z]{2,})");
        Matcher match = extract.matcher((str));
        while(match.find()){
            System.out.print(match.group()+ " ");
        }
    }
}
