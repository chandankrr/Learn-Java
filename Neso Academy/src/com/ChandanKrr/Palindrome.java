// Exercise 22

package com.ChandanKrr;

import java.util.Scanner;

public class Palindrome {
    static boolean isPalindrome(int num) {
        int reverseNum = 0, temp = num;
        while (num > 0) {
            int lastDigit = num % 10;
            reverseNum = (reverseNum * 10) + lastDigit;
            num = num / 10;
        }

        if (temp == reverseNum) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int num = input.nextInt();

        if (isPalindrome(num))
            System.out.println("\n" + num + " is Palindrome");

        else
            System.out.println("\n" + num + " is not Palindrome");

        input.close();
    }
}
