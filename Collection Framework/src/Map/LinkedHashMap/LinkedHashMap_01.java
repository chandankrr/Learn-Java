// https://www.programiz.com/java-programming/linkedhashmap

package Map.LinkedHashMap;

import java.util.LinkedHashMap;

public class LinkedHashMap_01 {

    public static void main(String[] args) {
        /**
         * LinkedHashMap is same as HashMap
         * It stores data in key value pair not in sorted, but it maintains the insertion order
         * all operation take O(1) time,
         * and it use hashing to store data
         */
        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 5);
        System.out.println(numbers); // insertion order maintains

        // TODO:
        //  Note: all the operation is same as HashMap
    }
}
