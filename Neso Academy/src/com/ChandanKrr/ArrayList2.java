package com.ChandanKrr;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Orange");
        fruits.add("Graphs");
        fruits.add("Apple");
        fruits.add("Kiwi");

        for (int i = 0; i < fruits.size(); i++) {
            System.out.print(fruits.get(i) + " ");
        }
        System.out.println();

        // sort() method of Collections class used to sort list means ArrayList
        Collections.sort(fruits);
        System.out.println(fruits);

        // -----------------------------------------------

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(45);
        numbers.add(0);
        numbers.add(-7);
        numbers.add(-23);

        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
