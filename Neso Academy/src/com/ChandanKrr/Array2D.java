package com.ChandanKrr;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        int[][] arr = {
                {3,5,7},
                {10,2,9}
        };

        // printing elements row by
        for(int i = 0; i< 2;i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // printing elements column by
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.toString(arr));
    }
}
