package Set.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSet_01 {

    public static void main(String[] args) {
        /**
         * Difference between hash set and linked hash set -
         * In HashSet position of element not fixed but in LinkedHashSet position is fixed, in a way element added in set
         * All the method and properties are same as HashSet
         */
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        numbers.add(100);
        numbers.add(2);
        numbers.add(50);
        numbers.add(20);
        numbers.add(10);
        System.out.println(numbers); // printed in same way as it add in the set
    }
}
