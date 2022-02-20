package com.ChandanKrr;

import java.util.Scanner;

 public class Exercise2 {
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int num1 = n1.nextInt();

        Scanner n2 = new Scanner(System.in);
        System.out.print("Enter number2: ");
        int num2 = n1.nextInt();

        n1.close();
        n2.close();

        int sum = num1 + num2;

        System.out.println("Sum of numbers: " + sum);


    }
}
