package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int m = console.nextInt();
        int firstNum = 0;
        int secondNum = 0;

        if (n > m) {
            firstNum = n;
            secondNum = m;
        } else if (n < m) {
            firstNum = m;
            secondNum = n;
        } else {
            System.out.println(n);
        }

        List<Integer> numbers = new ArrayList<>();

        for (int i = secondNum; i <= firstNum; i++) {
            numbers.add(i);
            Collections.shuffle(numbers);
        }
        for (int item : numbers) {
            System.out.println(item);
        }

    }
}
