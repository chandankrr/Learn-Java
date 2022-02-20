package com.ChandanKrr;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        // Writing a program that reads an integer n and displays the nth Fibonacci number.
        System.out.print("Enter position: ");

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int t1 = 0, t2 = 1, nextTerm = 0;

        for (int i = 1; i <= n - 2; i++) {
            nextTerm = t1 + t2;
            t1 = t2;
            t2 = nextTerm;
        }
        System.out.println("Value at " + n + " position" + " = " + nextTerm);
        input.close();

    }
}
