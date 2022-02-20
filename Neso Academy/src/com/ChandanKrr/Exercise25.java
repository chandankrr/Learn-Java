package com.ChandanKrr;

import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        System.out.print("Enter a positive integer: ");

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();

    }
}
