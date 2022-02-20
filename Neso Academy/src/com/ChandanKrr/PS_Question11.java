package com.ChandanKrr;

public class PS_Question11 {
    public static void main(String[] args) {
        int[] a = {2, 3, 1, 2, 3};
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j  = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.print(a[j] + " ");
                }
            }
        }
    }
}
