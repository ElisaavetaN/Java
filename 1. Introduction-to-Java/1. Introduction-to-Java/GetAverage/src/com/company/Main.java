package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Enter 3 numbers:");
        Scanner sc=new Scanner(System.in);

        double number1, number2, number3;
        double average;

        number1=sc.nextDouble();
        number2=sc.nextDouble();
        number3=sc.nextDouble();

        average=getAverage(number1,number2,number3);

        System.out.println(String.format("%.2f", average));
    }

    public static double getAverage(double a, double b, double c){
        return (a+b+c)/3;
    }
}
