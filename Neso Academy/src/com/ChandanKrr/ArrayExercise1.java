package com.ChandanKrr;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercise1 {
    public static void main(String[] args) {
        // Writing a program that fills an array with n integers entered by the user.

        Scanner input = new Scanner(System.in);
        System.out.print("How many elements? (max is 20): ");
        int n = input.nextInt();
        
        while (n > 20 || n <= 0) {
            System.out.print("Invalid number, try again: ");
            n = input.nextInt();
        }
        
        int[] numbers = new int[n];
        fillArrayOfInteger(numbers);
        printArrayOfInteger(numbers);
    }

    private static void printArrayOfInteger(int[] numbers) {
        System.out.print("\nElements are: ");
        System.out.println(Arrays.toString(numbers));
    }

    private static void fillArrayOfInteger(int[] numbers) {
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
    }
}
