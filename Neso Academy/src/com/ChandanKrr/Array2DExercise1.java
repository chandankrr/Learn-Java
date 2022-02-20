package com.ChandanKrr;

public class Array2DExercise1 {
    public static void main(String[] args) {
        // 1) Writing a program that prints the sum of each row in a 2D array.
        // 2) Writing a program that prints the sum of each column in a 2D array.
        int[][] arr = {
                {12, 3, 6, 1},
                {2, 15, 7, 9},
                {10, 20, 22, 5}
        };

        for (int i = 0; i < arr.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                rowSum += arr[i][j];
            }
            System.out.println("Sum of element of row " + (i + 1) + ": " + rowSum);
        }

        System.out.println();

        for (int i = 0; i < 4; i++) {
            int colSum = 0;
            for (int j = 0; j < 3; j++) {
                colSum += arr[j][i];
            }
            System.out.println("Sum of element of column " + (i + 1) + ": " + colSum);
        }
    }
}
