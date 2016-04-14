package com.company;
        import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int aX = console.nextInt();
        int aY = console.nextInt();
        int bX = console.nextInt();
        int bY = console.nextInt();
        int cX = console.nextInt();
        int cY = console.nextInt();

        int result = (aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY)) / 2;
        System.out.println(Math.abs(result));
    }
}