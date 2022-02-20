// https://www.programiz.com/java-programming/arraydeque

package Queue.ArrayDeque;

import java.util.ArrayDeque;

public class ArrayDeque_01 {
    public static void main(String[] args) {
        // array deque is exactly same as double ended queue: insertion and deletion of element take place
        // from both end starting and from end
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(23);
        adq.offer(45);
        adq.offerFirst(10);
        adq.offerLast(20);
        System.out.println(adq);

        System.out.println(adq.getFirst());
        System.out.println(adq.getLast());

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println("poll() " + adq);

        System.out.println(adq.pollFirst());
        System.out.println("pollFirst() " + adq);

        System.out.println(adq.pollLast());
        System.out.println("pollLast() " + adq);

        adq.clear();
        System.out.println(adq);
    }
}
