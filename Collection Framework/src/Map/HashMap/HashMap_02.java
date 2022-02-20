// https://www.programiz.com/java-programming/hashmap

package Map.HashMap;

import java.util.HashMap;

public class HashMap_02 {

    public static void main(String[] args) {
        HashMap<String, Integer> numbers = new HashMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 5);
        System.out.println(numbers);

        // iteration

        for(HashMap.Entry<String, Integer> e : numbers.entrySet()){
            System.out.println(e);
        }
        System.out.println();

        for(HashMap.Entry<String, Integer> e : numbers.entrySet()){
            System.out.println(e.getKey() + ": " + e.getValue());
        }
        System.out.println();

        // iterating on key
        for(String key : numbers.keySet()){
            System.out.print(key + ", ");
        }
        System.out.println();

        // iterating on value
        for(Integer value : numbers.values()){
            System.out.print(value + ", ");
        }
    }
}
