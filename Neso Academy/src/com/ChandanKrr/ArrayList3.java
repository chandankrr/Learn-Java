package com.ChandanKrr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList3 {
    public static void main(String[] args) {
        // 1) Creating a list of unique elements taken from the user, then sorting and printing these elements using an
        // ArrayList in Java.
        ArrayList<Integer> num = new ArrayList<>();

        System.out.print("Enter 5 integer: ");
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            int temp = input.nextInt();
            if(!num.contains(temp)) {
                num.add(temp);
            }
        }

        Collections.sort(num);
        System.out.println(num);
    }
}
