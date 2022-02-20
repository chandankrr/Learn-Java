package com.ChandanKrr;

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        System.out.print("Enter a positive integer: ");

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        input.close();

    }
}
