package com.ChandanKrr;

import java.util.Arrays;

public class ArrayExercise6 {
    public static void main(String[] args) {
        // Writing a program that puts the odd elements of an array before the even elements.
        int[] arr = {1, 2, 4, 5, 7, 9, -2, 3};
        int[] temp = new int[arr.length];

        int j = 0;
        int k = arr.length-1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                temp[j++] = arr[i];
            }
            else {
                temp[k--] = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

        System.out.println("Elements are: " + Arrays.toString(arr));

    }
}
