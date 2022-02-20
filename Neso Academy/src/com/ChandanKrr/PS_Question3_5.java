package com.ChandanKrr;

import java.util.ArrayList;

public class PS_Question3_5 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(12);
        a1.add(1);
        a1.add(32);
        a1.add(3);

        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(0);
        a2.add(12);
        a2.add(2);
        a2.add(23);

        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i <= a1.size() - 1; i++){
            if(i % 2 != 0){
                result.add(a1.get(i));
            }
            if(i % 2 == 0) {
                result.add(a2.get(i));
            }
        }
        System.out.println("input1: " + a1);
        System.out.println("input2: " + a2);
        System.out.println("\noutput: " + result);
    }
}
