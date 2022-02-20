package com.ChandanKrr;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class PS_Question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tc = input.nextInt();

        while (tc-- > 0) {
            boolean isPrime = true;
            // System.out.print("Enter number: ");
            int num = input.nextInt();

            for (int i = 2; i <= sqrt(num); i++) {

                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            System.out.println(isPrime ? "PRIME" : "NOT PRIME");
        }

        input.close();

    }

}
