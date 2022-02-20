package com.ChandanKrr;

import java.util.Scanner;

class Multiply {
    public int mul(int a, int b) {
        return a * b;
    }

    public int mul(int a, int b, int c) {
        return a * b * c;
    }

    public int mul(int a, int b, int c, int d) {
        return a * b * c * d;
    }

    public int mul(int a, int b, int c, int d, int e) {
        return a * b * c * d * e;
    }
}

public class PS_Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter five number...");
        int[] A = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            A[i] = input.nextInt();
        }

        Multiply obj = new Multiply();

        System.out.println("\n" + obj.mul(A[0], A[1]));
        System.out.println(obj.mul(A[0], A[1], A[2]));
        System.out.println(obj.mul(A[0], A[1], A[2], A[3]));
        System.out.println(obj.mul(A[0], A[1], A[2], A[3], A[4]));

        input.close();
    }
}
