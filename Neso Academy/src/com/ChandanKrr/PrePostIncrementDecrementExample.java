package com.ChandanKrr;

public class PrePostIncrementDecrementExample {
    public static void main(String[] args) {
        int i = 1;
        /*
        4    1      3*/
        i = i++ + ++i;

        System.out.println("Value of i: " + i);

        //-------------------------------------------
        i = 1;
        int j = 2;
        int k;
        /*
        13   1   2   1     2      3     4*/
        k = i + j + i++ + j++ + ++i + ++j;
        System.out.println("Value of i, j and k: " + i + ", " + j + ", and " + k);

        //-------------------------------------------

        int x = 0;
        /*
        0    0      0     1     1*/
        x = x++ - --x + ++i - i--;

        System.out.println("Value of x: " + x);
    }
}
