package com.ChandanKrr;

import java.util.Arrays;
import java.util.Scanner;

public class PS_Question2_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = input.nextInt();

        System.out.print("Enter elements of arrays: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[n-1];

        System.out.println(max + " - " + min + " = " + (max - min));
    }
}
