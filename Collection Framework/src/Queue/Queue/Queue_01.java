// https://www.programiz.com/java-programming/queue

package Queue.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_01 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // add / offer
        queue.add(12); // throws exception when addition of element is possible or not
        queue.offer(24);
        queue.offer(36);
        queue.offer(48);
        queue.offer(60);
        queue.offer(72); // throws true or false when addition of element is possible or not
        System.out.println(queue);

        // peek
        System.out.println(queue.peek());

        // The remove () and poll () methods differ only in their behavior when the queue is empty:
        // the remove () method throws an exception, while the poll () method returns null.

        // remove
        // queue.remove(60); // remove object, index if queue of string, Integer.valeOf(60)
        // System.out.println(queue);

        // poll -- recommended
        queue.poll(); // remove element from starting
        System.out.println(queue);


    }
}
