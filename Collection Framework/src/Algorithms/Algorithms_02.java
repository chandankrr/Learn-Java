package Algorithms;

import java.util.ArrayList;
import java.util.Collections;

public class Algorithms_02 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(4);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers);

        ArrayList<Integer> oddNumbers = new ArrayList<>();

        oddNumbers.add(1);
        oddNumbers.add(2);
        oddNumbers.add(5);
        System.out.println(oddNumbers);

        // copy
        Collections.copy(oddNumbers, numbers);
        System.out.println(oddNumbers);

        // Fill
        Collections.fill(numbers, 0);
        System.out.println(numbers);

        // addAll
        oddNumbers.addAll(numbers);
        System.out.println(oddNumbers);
    }
}
