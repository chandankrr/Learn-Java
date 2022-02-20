package com.ChandanKrr;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        do {
            System.out.print("Enter a number: ");
            sum += input.nextInt();

        } while (sum <= 100);

        System.out.println("Done " + sum);
        input.close();
    }
}
