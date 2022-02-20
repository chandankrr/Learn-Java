package com.ChandanKrr;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        System.out.print("Enter 4-digits number: ");

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        if (!(num > 999 && num < 10000)) {
            System.out.println(num + " not a 4-digits number");
        }
        else {
            int fourthDigit = num % 10;
            int thirdDigit = (num / 10) % 10;
            int secondDigit = (num / 100) % 10;
            int firstDigit = (num / 1000) % 10;

            if (firstDigit + secondDigit == thirdDigit + fourthDigit) {
                System.out.println(":) lucky");
            } else {
                System.out.println(":( not lucky!");
            }
        }
        input.close();
    }
}
