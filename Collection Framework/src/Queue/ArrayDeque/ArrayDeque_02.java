// https://www.programiz.com/java-programming/arraydeque

package Queue.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDeque_02 {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(23);
        adq.offer(45);
        adq.offerFirst(10);
        adq.offerLast(20);
        System.out.println(adq);

        // iterating
        // 1st way

        // ascending
        Iterator<Integer> it = adq.iterator();

        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }

        // descending
        Iterator<Integer> desIt = adq.descendingIterator();

        while (desIt.hasNext()){
            System.out.print(desIt.next() + " ");
        }


        // 2nd way

        // ascending
        for (Integer integer : adq) {
            System.out.print(integer + " ");
        }
    }
}
