package com.ChandanKrr;

import java.util.Scanner;

public class PS_Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] A = new int[3];

        System.out.println("Enter three numbers...");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            A[i] = input.nextInt();
        }

        if ((A[0] < A[1]) && (A[1] < A[2])) {
            System.out.println("\nIncreasing order");
        }
        else if ((A[0] > A[1]) && (A[1] > A[2])) {
            System.out.println("\nDecreasing order");
        }
        else {
            System.out.println("\nNeither increasing nor decreasing");
        }

        input.close();

    }

}
