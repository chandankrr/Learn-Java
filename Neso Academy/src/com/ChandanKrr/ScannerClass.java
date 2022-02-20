package com.ChandanKrr;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.println(input.next());

        Scanner firstName = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        System.out.println("Your name is " + firstName.next()); // read only one word

        Scanner fullName = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        System.out.println("Your name is " + fullName.nextLine());

        firstName.close();
        fullName.close();
    }
}
