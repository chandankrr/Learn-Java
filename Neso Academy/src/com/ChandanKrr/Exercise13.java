// even number

package com.ChandanKrr;

public class Exercise13 {
    public static void main(String[] args) {
        // for (int i = 1; i <= 100; i++) {
        //     if (i % 2 == 0) {
        //         System.out.print(i + " ");
        //     }
        // }
        // System.out.println();

        // another way
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();


        //--------------------------------------


        // for (int j = 100; j >= 1; j--) {
        //     if (j % 2 == 0) {
        //         System.out.print(j + " ");
        //     }
        // }
        // System.out.println();

        // another way
        for (int j = 100; j >= 1; j -= 2) {
            System.out.print(j + " ");
        }
    }
}
