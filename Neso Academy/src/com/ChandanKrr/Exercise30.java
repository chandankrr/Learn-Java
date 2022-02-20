package com.ChandanKrr;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Exercise30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter starting and ending range: ");
        int start = input.nextInt();
        int end = input.nextInt();

        printPrimeBetween(start, end);
        input.close();
    }

    public static boolean isPrime(int n) {
        if (n <= 0) {
            return false;
        }
        else {
            for (int i = 2; i <= sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printPrimeBetween(int start, int end) {
        for(int i = start; i <= end; i++) {
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
