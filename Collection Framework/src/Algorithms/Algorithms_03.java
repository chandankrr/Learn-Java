package Algorithms;

import java.util.ArrayList;
import java.util.Collections;

public class Algorithms_03 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        System.out.println(numbers);

        // Using binarySearch
        int pos = Collections.binarySearch(numbers, 3);
        System.out.println("The position of 3 is " + pos);

        // frequency
        int count = Collections.frequency(numbers, 2);
        System.out.println("Count of 2: " + count);

        ArrayList<Integer> newNumbers = new ArrayList<>();

        newNumbers.add(5);
        newNumbers.add(6);
        System.out.println("newNumbers: " + newNumbers);

        // Disjoint
        boolean value = Collections.disjoint(numbers, newNumbers);
        System.out.println("Two lists are disjoint: " + value);

        // min
        int min = Collections.min(numbers);
        System.out.println("Minimum Element: " + min);

        // max
        int max = Collections.max(numbers);
        System.out.println("Maximum Element: " + max);
    }
}
