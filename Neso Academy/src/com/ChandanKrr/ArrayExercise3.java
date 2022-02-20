package com.ChandanKrr;

public class ArrayExercise3 {
    public static void main(String[] args) {
        // Writing a program that displays the sum, product, and average of the elements of an integer array.
        int[] arr = {10, -25, 75, 87, 33, 46, 93, 7};

        int sum = 0;
        long product = 1;
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            product *= arr[i];
        }
        avg = (double)sum / arr.length;

        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
        System.out.println("Avg = " + avg);
    }
}
