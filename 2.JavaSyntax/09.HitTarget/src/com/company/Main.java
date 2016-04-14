package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();

        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i + j == number) {
                    System.out.println(i + "+" + j + "=" + number);
                }
            }
        }
        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i - j == number) {
                    System.out.println(i + "-" + j + "=" + number);
                }
            }
        }

    }
}
