package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        double b = console.nextDouble();
        double c = console.nextDouble();

        String hexadecimal = Integer.toHexString(a).toUpperCase();
        String binary = Integer.toBinaryString(a);
        int binaryNum = Integer.parseInt(binary);

        System.out.printf("|%1$-10s|%2$010d|%3$10.2f|%4$-10.3f| ", hexadecimal, binaryNum, b, c);
    }
}
