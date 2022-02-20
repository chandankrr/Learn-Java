package com.ChandanKrr;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int max = num;
        int min = num;

        if (num < 0) {
            System.out.println(num  + " is not valid!");
        }
        else {
            while (true) {
                System.out.print("Enter a number: ");
                num = input.nextInt();

                if (num < 0) {
                    break;
                } else {
                    max = num > max ? num : max;
                    min = num < min ? num : min;
                }
            }
            System.out.println("\nMax = " + max + "\nMin = " + min);
        }
        input.close();

    }
}
