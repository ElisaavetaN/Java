package com.company;

import java.util.Scanner;

public class StuckNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        String[] input = new String[n];
        input = scanner.nextLine().split(" ");
       // List<Integer> intNum = new ArrayList<Integer>();

        int[] elements = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            elements[i] = Integer.parseInt(input[i]);
        }
        boolean hasEqualElements = false;
        for (int i = 0; i < elements.length ; i++) {
            for (int j = 0; j < elements.length; j++) {
                for (int k = 0; k < elements.length; k++) {
                    for (int l = 0; l < elements.length; l++) {
                        int a = elements[i];
                        int b = elements[j];
                        int c = elements[k];
                        int d = elements[l];

                        if ((a != b && a != c) && (a != d && b != c) && (c != d) && (b != d)){
                            String left = a + "" + b;
                            String right = c+ "" + d;

                            if (left.equals(right)){
                                System.out.println(a + "|" + b + "==" + c + "|" + d);
                                hasEqualElements = true;
                            }
                        }
                    }
                }
                
            } 
        }
        if (!hasEqualElements){
            System.out.println("No");
        }

    }
}
