package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();

        int area = a * b;
        //System.out.println(area);
        System.out.printf("%d", area);
    }
}
