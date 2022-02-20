package com.ChandanKrr;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> number;
        number = new ArrayList<>();

        ArrayList<String> fruits = new ArrayList<>();

        // add() method used to add element in ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Strawberry");

        // add() method overload to add element at any index
        fruits.add(0,"Orange");
        System.out.println(fruits);

        // get() method to access element of ArrayList
        System.out.println(fruits.get(0));
        System.out.println(fruits.get(1));
        System.out.println(fruits.get(2));
        System.out.println(fruits.get(3));

        // set() method to change value at index
        fruits.set(2, "Papaya");
        System.out.println(fruits);

        // remove() method used to remove element by index or by value
        fruits.remove(1);
        fruits.remove("Strawberry");
        System.out.println(fruits);

        // size() method used find the size of ArrayList
        System.out.println(fruits.size());

        // clear() method used to remove all element of ArrayList
        fruits.clear();
        System.out.println(fruits);
    }
}
