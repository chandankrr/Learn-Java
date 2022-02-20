package com.ChandanKrr;

public class ArrayExercise4 {
    public static void main(String[] args) {
        // Writing a program that displays the number of occurrences of an element in the array.
        int[] arr = {1, 1, 1, 2, 3, 4, 4, 5};
        int searchElement = 4;

        System.out.println("Occurrence of number " + searchElement + " is: " + getNumberOccurrence(arr, searchElement)
        );
    }

    public static int getNumberOccurrence(int[] arr, int searchElement) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                count++;
            }
        }
        return count;
    }
}
