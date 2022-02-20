package com.ChandanKrr;

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int iNum = num;
        int sum = 0;

        while( num > 0) {
            sum += (num % 10);
            num /= 10;
        }
        System.out.println("Sum of digit of " + iNum + " = " + sum);
        input.close();

    }
}
