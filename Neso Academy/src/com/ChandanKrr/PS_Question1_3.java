package com.ChandanKrr;

import java.util.Scanner;

public class PS_Question1_3 {
    public static void main(String[] args) {
        int p, q, r, s, t;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any integer p: ");
        p = input.nextInt();
        q = ++p;
        System.out.println("\nResult after Pre Increment p: " + p);
        System.out.println("Result after Pre Increment q: " + q);
        r = p++;
        System.out.println("Result after Pre Increment p: " + p);
        System.out.println("Result after Post Increment r: " + r);
        s = --p;
        System.out.println("Result after Pre Increment p: " + p);
        System.out.println("Result after Pre Decrement s: " + s);
        t = p--;
        System.out.println("Result after Pre Increment p: " + p);
        System.out.println("Result after Post Decrement t: " + t);
    }
}
