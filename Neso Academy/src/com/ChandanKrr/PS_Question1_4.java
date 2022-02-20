package com.ChandanKrr;

import java.util.Scanner;

public class PS_Question1_4 {
    static boolean peekElement(int[] arr, int n) {
        if (n == 1) {
            return false;
        }
        if (arr[0] >= arr[1]) {
            return false;
        }
        if (arr[n - 1] >= arr[n - 2]) {
            return true;
        }

        for(int i = 1; i < n-1; i++){
            if(arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        if(peekElement(arr,n)){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }


    }
}
