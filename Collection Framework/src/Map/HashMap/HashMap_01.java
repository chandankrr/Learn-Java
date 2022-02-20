// https://www.programiz.com/java-programming/hashmap

package Map.HashMap;

import java.util.HashMap;

public class HashMap_01 {

    public static void main(String[] args) {
        /**
         * HashMap is same as unordered_map in C++ STL
         * It stores data in key value pair but not in sorted order
         * all operation take O(1) time
         * and HashSet use hashing to store data
         */
        HashMap<String, Integer> numbers = new HashMap<>();

        // put
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 5);
        System.out.println(numbers);

        // if(!numbers.containsKey("Two")){
        //     numbers.put("Two", 23);
        // }

        // putIfAbsent
        numbers.putIfAbsent("Six", 6);
        System.out.println(numbers);

        // containsKey
        System.out.println(numbers.containsKey("One"));
        // containsValue
        System.out.println(numbers.containsValue(3));

        // get
        System.out.println(numbers.get("Two"));

        // replace
        numbers.replace("Four", 9);
        System.out.println(numbers);

        // remove
        numbers.remove("One");
        System.out.println(numbers);

        // isEmpty
        System.out.println(numbers.isEmpty());

        // clear
        numbers.clear();
        System.out.println(numbers);

    }
}
