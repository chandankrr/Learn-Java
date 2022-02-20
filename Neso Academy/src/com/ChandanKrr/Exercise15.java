package com.ChandanKrr;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int sum = 0;

        for (int i = 1; i <= num/2; i++) {

            if (num % i == 0) {
                sum += i;
                System.out.print(i + " ");
            }
        }
        System.out.println("\n\nSum of strict divisor: " + sum);
        input.close();

    }
}
