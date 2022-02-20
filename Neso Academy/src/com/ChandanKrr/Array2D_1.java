package com.ChandanKrr;

public class Array2D_1 {
    public static int[][] getArray(){
        return new int[][]{{12, 3, 45}, {23,53,33},{14,24,78}};
    }

    public static void printArray(int[][] arr) {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = getArray();
        printArray(arr);
    }
}
