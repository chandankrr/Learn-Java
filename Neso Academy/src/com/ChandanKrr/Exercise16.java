package com.ChandanKrr;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num <= 0) {
            System.out.println(num + " is not a valid number!");
        }
        else {
            boolean isPrime = true;

            // for(int i = 2; i <= num/2; i++) {
            for (int i = 2; i <= sqrt(num); i++) {

                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            System.out.println(isPrime ? "Prime" : "Not Prime");
        }

        input.close();


        // -------------------------------------------------

        // second way
        // if (num <= 0) {
        //     System.out.println(num + " is not a valid number!");
        // }
        // else {
        //     int sum = 1;
        //     for (int i = 2; i <= num/2; i++) {
        //         if (num % i == 0) {
        //             sum += i;
        //         }
        //     }
        //     System.out.println(sum == 1 ? "prime" : "not prime");
        // }

    }
}
