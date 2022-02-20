package com.ChandanKrr;

import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        int[] numbers = {5,2,3,-1,0,0,4,1};
        Arrays.sort(numbers,3,7);

        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        //---------------------------------------------
        System.out.println();

        char[] characters = {'a', 'z', 'b', 'w', 'c', 'A', 'D', 'Z', 'c'};
        Arrays.sort(characters);

        for(int i = 0; i < characters.length; i++) {
            System.out.print(characters[i] + " ");
        }

        //-----------------------------------------------
        System.out.println();

        int[] ascii = {'a', 'z', 'b', 'w', 'c', 'A', 'D', 'Z', 'c'};
        Arrays.sort(ascii);

        for(int i = 0; i < ascii.length; i++) {
            System.out.print(ascii[i] + " ");
        }
    }
}
