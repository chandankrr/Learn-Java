// https://www.programiz.com/java-programming/hashset

package Set.HashSet;

import java.util.HashSet;

public class Set_04 {

    public static void main(String[] args) {
        HashSet<Integer> primeNumbers = new HashSet<>();

        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(7);
        System.out.println(primeNumbers);

        HashSet<Integer> evenNumbers = new HashSet<>();

        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println(evenNumbers);

        // Intersection of two sets
        evenNumbers.retainAll(primeNumbers);
        System.out.println(evenNumbers);
    }
}
