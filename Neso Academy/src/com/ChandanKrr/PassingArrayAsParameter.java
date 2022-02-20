package com.ChandanKrr;

public class PassingArrayAsParameter {
    public static void main(String[] args) {
        int[] num = {1,2};
        change(num);
        printArray(num);
    }

    public static void change(int[] num) {
        num[0] = 2;
        num[1] = 1;
    }

    public static void printArray(int[] num) {
        for (int i = 0; i < 2; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
