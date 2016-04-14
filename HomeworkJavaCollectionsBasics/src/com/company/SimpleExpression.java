package com.company;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputt = scanner.nextLine().replace("\\s+", "").trim();
        String[] input = inputt.split("\\-|\\+| ");
        String[] inputOper = inputt.split("[d]+| ");
        List<Double> nums = new ArrayList<Double>();
        List<String> operations = new ArrayList<String>();
        for (int i = 0; i < input.length; i++) {
            nums.add(Double.parseDouble(input[i]));
        }

        for (int i = 0; i < inputOper.length; i++) {
            operations.add(inputOper[i]);
        }
        double sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (operations.get(i).equals("+")){
                sum = sum + nums.get(i);
            }else if (operations.get(i).equals("-")) {
            sum = sum - nums.get(i);
            }
        }
        System.out.print(sum );
    }
}
// 5 -33   + 12 -  55-  1  - 2+6