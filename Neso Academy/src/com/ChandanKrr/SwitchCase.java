package com.ChandanKrr;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.print("Enter number: ");

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        // first way
        //switch (n) {
        //     case 10:
        //         System.out.println("= 10");
        //         break;
        //     case 90:
        //         System.out.println("= 90");
        //         break;
        //     case -3:
        //         System.out.println("= -3");
        //         break;
        //     default:
        //         System.out.println("none of above");
        // }

        // second way
        switch (n) {
            case 10 -> System.out.println("= 10");
            case 90 -> System.out.println("= 90");
            case -3 -> System.out.println("= -3");
            default -> System.out.println("none of above");
        }
        input.close();
    }
}
