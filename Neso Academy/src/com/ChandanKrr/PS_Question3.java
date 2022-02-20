package com.ChandanKrr;

import java.util.Scanner;

public class PS_Question3 {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        num = input.nextInt();

        System.out.println("\nMultiplication of " + num + " with 2 = " + (num << 1));
        System.out.println("Division of " + num + " by 2 = " + (num >> 1));

        input.close();
    }
}
