// https://www.programiz.com/java-programming/treemap

package Map.TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMap_01 {

    public static void main(String[] args) {
        /**
         * TreeMap is same as ordered_map in C++ STL
         * It stores data in key value pair in sorted order
         * all operation take O(log(n) time
         * and HashSet use Binary Tree to store data
         */
        TreeMap<String, Integer> numbers = new TreeMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 5);
        System.out.println(numbers); // print in sorted order wrt key

        TreeMap<Integer, String> students = new TreeMap<>(Comparator.reverseOrder());

        students.put(2,"Chandan");
        students.put(10,"Neelu");
        students.put(4,"Ravi");
        System.out.println(students);

        // TODO
        //  NOTE: and all the function are same as HashMap
    }
}
