package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double a = console.nextDouble();
        double b = console.nextDouble();
        double c = console.nextDouble();

        double formulaOneResult = Math.pow(((a * a + b * b) / (a * a - b * b)), (a + b + c) / (Math.sqrt(c)));
        double formulaTwoResult = Math.pow((a * a + b * b - Math.pow(c, 3)), a - b);
        double numbersAverage = (a + b + c) / 3;
        double formulasAverage = (formulaOneResult + formulaTwoResult) / 2;
        double difference = Math.abs(numbersAverage - formulasAverage);

        System.out.printf("F1 result: %.2f; ", formulaOneResult);
        System.out.printf("F2 result: %.2f; ", formulaTwoResult);
        System.out.printf("Diff: %.2f", difference);
    }
}
