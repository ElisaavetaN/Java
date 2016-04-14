package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int decimalNum = console.nextInt();
        String baseSevenNum = Integer.toString(decimalNum, 7);
        System.out.println(baseSevenNum);
    }
}
