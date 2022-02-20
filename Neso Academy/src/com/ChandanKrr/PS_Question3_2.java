package com.ChandanKrr;

import java.util.Scanner;

public class PS_Question3_2 {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(System.in);
            int a, b;

            System.out.print("Enter two number: ");
            a = input.nextInt();
            b = input.nextInt();

            System.out.println("output = " + (a / b));
            input.close();
        }
        catch (ArithmeticException e) {
            System.out.println("\njava.lang.ArithmeticException: " + e.getMessage());
        }

    }
}
