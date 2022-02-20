// https://www.programiz.com/java-programming/priorityqueue

package Queue.PriorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue_01 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // default use min heap

        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);
        System.out.println(pq);

        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());

        System.out.println(pq.contains(36));

        System.out.println(pq.size());

        // iterating
        // 1st way
        // Iterator<Integer> it = pq.iterator();
        //
        // while (it.hasNext()){
        //     System.out.print(it.next() + " ");
        // }
        // System.out.println();

        // 2nd way -- recommended
        for (Integer integer : pq) {
            System.out.print(integer + " ");
        }
    }
}
