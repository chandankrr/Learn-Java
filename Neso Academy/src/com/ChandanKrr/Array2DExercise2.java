package com.ChandanKrr;

public class Array2DExercise2 {
    public static void main(String[] args) {
        // 1) Writing a program that prints the maximum and minimum of each row in a 2D array.
        int[][] arr = {
                {12, 3, 6, 1},
                {2, 15, 7, 9},
                {10, 20, 22, 5}
        };

        // max element of each row
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i][0];
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            System.out.print("Max element of row " + (i + 1) + ": " + max);
            System.out.println();
        }

        System.out.println();

        //min element of each row
        for(int i = 0; i < arr.length; i++) {
            int min = arr[i][0];
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
            System.out.print("Min element of row " + (i+1) + ": " + min);
            System.out.println();
        }
    }
}
