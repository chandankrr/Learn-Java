package com.ChandanKrr;

import java.util.ArrayList;

public class ForEachLoop1 {
    public static void main(String[] args) {
        String[] itemsArray = {"Abhijeet", "Chandan", "Atul", "Aman", "Ayush", "Prem", "Nishant"};

        for (String items : itemsArray) {
            System.out.println(items);
        }

        System.out.println();

        // -----------------------------------

        ArrayList<String> itemsArrayList = new ArrayList<>();
        itemsArrayList.add("Abhijeet");
        itemsArrayList.add("Chandan");
        itemsArrayList.add("Atul");
        itemsArrayList.add("Aman");

        for (String items : itemsArrayList) {
            System.out.println(items);
        }
        System.out.println();

        // --------------------------------------

        int[] num = {12, 2, 5, 11, 10, 44, 32, 67};
        for (int i: num) {
            System.out.println(i);
        }

    }
}
