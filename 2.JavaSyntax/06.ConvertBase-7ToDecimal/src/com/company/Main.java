package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String baseSevenNumber = console.next();
        int decimalNumber = Integer.valueOf(baseSevenNumber, 7);
        System.out.println(decimalNumber);
    }
}
