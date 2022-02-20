// https://www.programiz.com/java-programming/treeset

package Set.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_01 {

    public static void main(String[] args) {
        /**
         * TreeSet is exactly same as ordered_set in C++ STL
         * All the operation will take O(logn) time complexity
         * All the operation is same as hash set
         */

        TreeSet<String> names = new TreeSet<>();

        names.add("Chandan");
        names.add("Ravi");
        names.add("Atul");
        names.add("Abhijeet");
        System.out.println(names); // print in sorted form

        TreeSet<Integer> numbers = new TreeSet<>(Comparator.reverseOrder());

        numbers.add(3);
        numbers.add(7);
        numbers.add(1);
        System.out.println(numbers);

        // TODO
        //  NOTE: All the operation is same as hash set
    }
}
