package com.ChandanKrr;

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        // Writing a program that displays the reverse of a string.
        // Reversing a string in a new string.

        System.out.print("Enter a string: ");

        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();

        String reverseStr = "";
        for (int i = (s1.length() - 1); i >= 0; i--) {
            // System.out.print(s1.charAt(i));

            reverseStr += s1.charAt(i);
        }
        System.out.println("Reverse string = " + reverseStr);
        input.close();

    }
}