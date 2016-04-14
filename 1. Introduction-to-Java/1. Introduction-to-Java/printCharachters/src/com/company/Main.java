package com.company;

public class Main {

    public static void main(String[] args) {
        char space = ' ';
        for (char i = 'a'; i <= 'z' ; i++) {
            System.out.print(i);
            if (i < 'z') {
                System.out.print(space);
            }

        }
        System.out.println();
    }
}
