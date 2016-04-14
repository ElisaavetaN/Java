package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        String firstStr = cn.next("\\w+");
        String secondStr = cn.next("\\w+");

        System.out.println(findChars(firstStr, secondStr));
    }

    public static int findChars(String firstString, String secondString) {
        int findChar = 0;
        if (firstString.length() == secondString.length()) {
            for (int i = 0; i < firstString.length(); i++) {
                findChar += firstString.charAt(i) * secondString.charAt(i);
            }
        } else if (firstString.length() > secondString.length()) {
            for (int i = 0; i < secondString.length() ; i++) {
                findChar+= firstString.charAt(i) * secondString.charAt(i);
            }
            for (int i = secondString.length() ; i < firstString.length() ; i++) {
                findChar+= firstString.charAt(i);
            }

        }else {
            for (int i = 0; i < firstString.length() ; i++) {
                findChar+= firstString.charAt(i) * secondString.charAt(i);
            }
            for (int i = firstString.length() ; i < secondString.length() ; i++) {
                findChar+= secondString.charAt(i);
            }
        }
        return findChar;
    }
}
