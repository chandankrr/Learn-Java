package com.ChandanKrr;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        System.out.print("Enter num1 operator num2 (8 + 2): ");

        Scanner s = new Scanner(System.in);

        double d1 = s.nextDouble();
        char op = s.next().charAt(0);
        double d2 = s.nextDouble();

        if (op == '+') {
            System.out.println((int) (d1 + d2));
        }
        else if (op == '-') {
            System.out.println((int) (d1 - d2));
        }
        else if (op == '*') {
            System.out.println((int) (d1 * d2));
        }
        else if (op == '/') {
            System.out.println((int) (d1 / d2));
        }
        else {
            System.out.println("invalid operator!");
        }

        s.close();
    }
}
