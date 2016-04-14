package com.company;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ImplementRecursiveBinarySearch {
    static List<Integer> hayStack;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int searchNum = scanner.nextInt();
        scanner.nextLine();
        hayStack = Stream.of(scanner.nextLine().split(" "))
                .map(num -> Integer.parseInt(num))
                .sorted()
                .collect(Collectors.toList());

        int needleIndex = binarySearch(searchNum, 0, hayStack.size() - 1);
        System.out.println(needleIndex);

    }

    private static int binarySearch(int searchnum, int start, int end) {

        if (end < start) {
            return -1;
        }

        int middle = (start + end) / 2;

        if (hayStack.get(middle) < searchnum) {
            return binarySearch(searchnum, middle + 1, end);
        }

        if (hayStack.get(middle) > searchnum) {
            return binarySearch(searchnum, start, middle - 1);
        }

        return middle;
    }
}
