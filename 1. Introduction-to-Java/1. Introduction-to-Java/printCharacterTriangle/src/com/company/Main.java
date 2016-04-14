package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        // char[] ch = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for (int i = 0; i < input; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(j + 97) + " ");
            }
            System.out.println();
        }
        for (int i = input - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {

                //System.out.print(ch[j]);
                System.out.print((char)(j + 97) + " ");
            }
            System.out.println("");

        }

    }
}
