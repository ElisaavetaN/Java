package com.company;

import com.sun.org.apache.bcel.internal.generic.I2F;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("([\\d]+)|(J)|(Q)|(K)|(A)");
        Matcher matcher = pattern.matcher(input);

        List<Integer> results = new ArrayList<>();
        while (matcher.find()) {
            String currentWord = matcher.group();
            if (currentWord.equals("J")) {
                currentWord = "12";
            }

            if (currentWord.equals("Q")) {
                currentWord = "13";
            }

            if (currentWord.equals("K")) {
                currentWord = "14";
            }

            if (currentWord.equals("A")) {
                currentWord = "15";
            }

            results.add(Integer.parseInt(currentWord));
        }

        List<Integer> intNum = new ArrayList<Integer>();
        int sumOfAllCards = 0;
        for (int i = 0; i < results.size(); i++) {
            int equals = 1;
            for (int j = i + 1; j <results.size(); j++) {
                if(results.get(i) == results.get(j)) {
                    equals++;
                    i++;
                } else {
                    break;
                }
            }

            if(equals > 1) {
                sumOfAllCards += results.get(i) * equals * 2;
            } else {
                sumOfAllCards += results.get(i);
            }
        }

        System.out.println(sumOfAllCards);
    }
}

/*
 int res = 0;
        int k = 1;
        int m = 1;
        for (int j = 0; j < results.size(); j++) {
            int currentInt = Integer.parseInt(String.valueOf(results.get(j)));
            if (results.size()==1)
            {
                res = currentInt;
                break;
            }

            int nextInt = Integer.parseInt(String.valueOf(results.get(j + 1)));
            if (currentInt != nextInt) {
                res += currentInt;
                if (j >= results.size() - 2) {
                    res += nextInt;
                    j++;
                    break;

                }
            } else if (currentInt == nextInt) {
                while (currentInt == nextInt) {
                    k++;
                    j++;
                    nextInt = Integer.parseInt(String.valueOf(results.get(j + 1)));
                    if ((j >= results.size() - 2 && currentInt == nextInt)) {
                        k++;
                        j++;
                        break;
                    }
                    else if ((j >= results.size() - 2) && currentInt != nextInt) {
                        res += nextInt;
                        j++;
                        break;

                    }
                }

                res += (currentInt * k) * 2;
                k = 1;
            }

        }

        System.out.println(res);
    }
}
*/
