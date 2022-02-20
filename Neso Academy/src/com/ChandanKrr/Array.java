package com.ChandanKrr;

public class Array {
    public static void main(String[] args) {
        int[] numbers = {12, 13, 14, 15, 16};

        // System.out.println(numbers); // print address

        // for (int i = 0; i < numbers.length; i++) {
        //     System.out.println(numbers[i]);
        // }

        char[] chars = {'c', 'h', 'a', 'n', 'd', 'a', 'n'};

        System.out.println(chars);
        for (char aChar : chars) {
            System.out.println(aChar);
        }
    }
}
