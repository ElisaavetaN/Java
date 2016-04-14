package com.company;
import java.util.HashMap;
import java.util.Scanner;

public class MagicExchangeableWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] line = scan.nextLine().split(" ");
        String first = line[0];
        String second = line[1];
        System.out.println(exchangeableWords(first, second));

    }

    private static boolean exchangeableWords(String a, String b) {
        boolean exchangeableWords = true;
        HashMap<Character, Character> map = new HashMap<>();
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                char firstChar = a.charAt(i);
                char secondChar = b.charAt(i);
                if (!map.containsKey(firstChar)) {
                    map.put(firstChar, secondChar);
                } else {
                    if (!map.containsValue(secondChar)) {
                        exchangeableWords = false;
                    }
                }
            }
        } else {
            exchangeableWords = false;
        }

        return exchangeableWords;
    }
}
