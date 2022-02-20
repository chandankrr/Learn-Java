package com.ChandanKrr;

public class ReturningArray {
    public static void main(String[] args) {
        int[] num = getNumbers();
        printArray(num);
    }

    public static int[] getNumbers() {
        return new int[] {1,2,3,4,5};
    }

    public static void printArray(int[] num) {
        for(int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

    }
}
