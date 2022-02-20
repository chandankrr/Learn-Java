package com.ChandanKrr;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        while (true) {
            if (num >= 1 && num <= 10) {
                System.out.println(num + " is between 1 to 10, Thanks!");
                break;
            }
            else {
                System.out.print(num + " is not between 1 to 10, Try again: ");
                num = input.nextInt();
            }
        }

        // second way

        // while(num < 1 || num > 10) {
        //     System.out.print(num + " is not between 1 and 10, Try again: ");
        //     num = input.nextInt();
        // }
        //
        // System.out.println(num + " is between 1 to 10, Thanks!");

        input.close();
    }
}
