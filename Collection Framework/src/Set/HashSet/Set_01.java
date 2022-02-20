// https://www.programiz.com/java-programming/hashset

package Set.HashSet;

import java.util.HashSet;

public class Set_01 {

    public static void main(String[] args) {
        /**
         * HashSet is exactly same as unordered_set of C++ STL
         *
         * By default,
         * the capacity of the hash set will be 16
         * the load factor will be 0.75
         * position of elements in set not defined, they are arranged randomly
         */
        HashSet<Integer> numbers = new HashSet<>();

        // System.out.println(numbers.isEmpty());

        numbers.add(2);
        numbers.add(9);
        numbers.add(7);
        System.out.println("HashSet: " + numbers);

        System.out.println(numbers.size());

        HashSet<Integer> evenNumber = new HashSet<>();

        evenNumber.add(4);
        evenNumber.add(6);
        evenNumber.add(8);
        System.out.println("New HashSet: " + evenNumber);

        // addAll - doing union of two hash set
        numbers.addAll(evenNumber);
        System.out.println(numbers);

        numbers.clear();
        System.out.println(numbers);
    }
}