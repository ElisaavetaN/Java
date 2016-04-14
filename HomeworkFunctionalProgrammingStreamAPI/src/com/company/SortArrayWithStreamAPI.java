package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class SortArrayWithStreamAPI {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] numbers = console.nextLine().split("\\s+");
        String orderSort = console.nextLine();

        if (orderSort.equals("Ascending")) {
            Arrays.stream(numbers)
                    .mapToInt(Integer::parseInt)
                    .boxed()
                    .sorted()
                    .forEach(d -> System.out.printf("%d ", d));
        } else {
            Arrays.stream(numbers)
                        .mapToInt(Integer::parseInt)
                        .boxed()
                        .sorted((d1, d2) -> d2.compareTo(d1))
                        .forEach(d -> System.out.printf("%d ", d));
        }
    }
}