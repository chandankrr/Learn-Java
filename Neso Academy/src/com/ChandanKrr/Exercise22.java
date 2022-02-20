package com.ChandanKrr;

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        // -> Writing a program that finds if a string is a palindrome string or not.

        // System.out.print("Enter a string: ");
        //
        // Scanner input = new Scanner(System.in);
        // String s1 = input.nextLine();
        //
        // StringBuilder reverseStr = new StringBuilder();
        //
        // for (int i = s1.length() - 1; i >= 0; i--) {
        //     reverseStr.append(s1.charAt(i));
        // }
        // System.out.println(reverseStr);
        //
        // if (s1.equals(reverseStr.toString())) {
        //     System.out.println("\n=> Palindrome");
        // }
        // else {
        //     System.out.println("\n=> Not palindrome");
        // }
        // input.close();

        // -----------------------------------------------------
        // #second way

        System.out.print("Enter a string: ");

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        boolean isPalindrome = true;

        for (int i = 0, j = (str.length() - 1); i < j; i++, j--) {

            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome ? "Palindrome" : "Not palindrome");
        s.close();

    }
}
