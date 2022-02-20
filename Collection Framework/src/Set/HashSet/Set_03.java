// https://www.programiz.com/java-programming/hashset

package Set.HashSet;

import java.util.HashSet;

public class Set_03 {

    public static void main(String[] args) {
        HashSet<Integer> primeNumbers = new HashSet<>();

        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        System.out.println(primeNumbers);

        HashSet<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        System.out.println(oddNumbers);

        // removeAll - remove all the common element or find the difference between to sets
        primeNumbers.removeAll(oddNumbers);
        System.out.println(primeNumbers);
    }
}
