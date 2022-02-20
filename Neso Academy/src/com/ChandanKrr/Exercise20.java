package com.ChandanKrr;

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        // Writing a program that displays a string with space after each character.
        System.out.print("Enter a string: ");

        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();

        System.out.print("New string: ");
        for (int i = 0; i < s1.length(); i++) {
            System.out.print(s1.charAt(i) + " ");
        }
        System.out.println();
        input.close();

    }
}
