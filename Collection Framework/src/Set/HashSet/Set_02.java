// https://www.programiz.com/java-programming/hashset

package Set.HashSet;

import java.util.HashSet;
// import java.util.Iterator;

public class Set_02 {

    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(2);
        numbers.add(9);
        numbers.add(7);
        System.out.println("HashSet: " + numbers);

        System.out.println(numbers.size());

        System.out.println(numbers.contains(7));

        // iteration in set

        // 1st way - Calling iterator() method
        // Iterator<Integer> it = numbers.iterator();
        //
        // while(it.hasNext()){
        //     System.out.print(it.next() + " ");
        // }
        // System.out.println();

        // 2nd way - Enhanced for loop
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
