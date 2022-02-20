package com.ChandanKrr;

public class Array2D_RaggedArray {
    public static void main(String[] args) {
        int[][] arr = {
                {12,34,5,1},
                {34,50},
                {45,1,23,78,23,12,34,15,11,9,5},
                {0},
                {100,34,1}
        };

        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
