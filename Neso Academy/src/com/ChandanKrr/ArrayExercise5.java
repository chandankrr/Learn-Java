package com.ChandanKrr;

public class ArrayExercise5 {
    public static void main(String[] args) {
        // Writing a program that displays the maximum and minimum elements of an array.
        int[] arr = {3, 2, 1, 5, -4};
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if(arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
    }
}
