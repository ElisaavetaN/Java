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

        if (numbers.size() % 2 !=0){
            System.out.println("Invalid length");
            System.exit(0);
        }

        for (int i = 0; i < numbers.size(); i += 2) {
            if (numbers.get(i) % 2 == 0 && numbers.get(i + 1) % 2 == 0) {
                System.out.printf("%1$d, %2$d -> both are even", numbers.get(i), numbers.get(i + 1));
                System.out.println();
            } else if (numbers.get(i) % 2 != 0 && numbers.get(i + 1) % 2 != 0) {
                System.out.printf("%1$d, %2$d -> both are odd", numbers.get(i), numbers.get(i + 1));
                System.out.println();
            }else {
                System.out.printf("%1$d, %2$d -> different", numbers.get(i), numbers.get(i + 1));
                System.out.println();

            }
        }
    }
}
