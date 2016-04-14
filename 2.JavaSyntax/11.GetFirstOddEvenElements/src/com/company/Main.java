package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] input = console.nextLine().split(" ");

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            numbers.add(Integer.parseInt(input[i]));

        }
        String[] secondInput = console.nextLine().split(" ");
        int numbersToGet = Integer.parseInt(secondInput[1]);
        String evenOrOddToGet = secondInput[2];

        findingEvenOrOdd(numbers, numbersToGet, evenOrOddToGet);

    }

    static int findingEvenOrOdd(List<Integer> numbers, int numbersToGet, String evenOrOddToGet) {
        if (evenOrOddToGet.equals("even")) {
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) % 2 == 0) {
                    System.out.print(numbers.get(i) + " ");
                    numbersToGet--;
                    if (numbersToGet == 0) {
                        System.exit(0);
                    }

                }

            }
        } else {
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) % 2 != 0) {
                    System.out.print(numbers.get(i) + " ");
                    numbersToGet--;
                    if (numbersToGet == 0) {
                        System.exit(0);
                    }

                }
            }
        }
        return 1;
    }
}
