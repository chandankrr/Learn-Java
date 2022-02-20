// https://www.programiz.com/java-programming/algorithms

package Algorithms;

import java.util.ArrayList;
import java.util.Collections;

public class Algorithms_01 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(4);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Unsorted ArrayList: " + numbers);

        // Sort
        Collections.sort(numbers);
        System.out.println("Sorted ArrayList: " + numbers);

        // Shuffle
        Collections.shuffle(numbers);
        System.out.println("ArrayList after shuffle: " + numbers);

        ArrayList<String> letters = new ArrayList<>();

        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");
        letters.add("E");
        System.out.println("New ArrayList: " + letters);

        // Swap
        Collections.swap(letters,0,4);
        System.out.println("ArrayList after swap: " + letters);

        // Reverse
        Collections.reverse(letters);
        System.out.println("ArrayList after reverse: " + letters);
    }
}
