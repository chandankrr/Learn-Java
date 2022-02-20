// https://www.programiz.com/java-programming/queue

package Queue.Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_02 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(12);
        queue.add(24);
        queue.add(36);
        queue.add(48);
        queue.add(60);
        queue.offer(72);
        System.out.println(queue);

        // iteration of queue

        // 1st way
        // Iterator<Integer> it = queue.iterator();

        // while (it.hasNext()) {
        //     System.out.print(it.next() + " ");
        // }
        // System.out.println();

        // 2nd way
        for (Integer integer : queue) {
            System.out.print(integer + " ");
        }
    }
}
