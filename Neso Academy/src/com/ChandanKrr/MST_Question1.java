package com.ChandanKrr;

import java.util.Scanner;

public class MST_Question1 {
    public static void main(String[] args) {
        String str;
        System.out.print("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        str = input.nextLine();

        try {
            int a = Integer.parseInt(str);
            System.out.println("The square of value of " + a + " = " + (a * a));
            System.out.println("The work has been done successfully");
        } catch (NumberFormatException e) {
            System.out.println("Entered input is not a valid format for an integer.");
        }


        input.close();
    }
}
