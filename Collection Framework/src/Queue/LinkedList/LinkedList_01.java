// https://www.programiz.com/java-programming/linkedlist

package Queue.LinkedList;

import java.util.LinkedList;

public class LinkedList_01 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        // add
        ll.add("Geeks");
        ll.add("Geeks");
        ll.add(1, "For");
        System.out.println(ll);

        // set / update
        ll.set(1, "Geeks");
        System.out.println("Updated LL: " + ll);

        // remove
        ll.remove("Geeks");
        ll.remove(1);

        // size of linked-list
        System.out.println(ll.size());

        // iterate linked-list
        for (String str : ll)
            System.out.println(str + " ");

        // get last
        System.out.println(ll.get(0));
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());

        // contains
        System.out.println(ll.contains("Geeks"));

        // clear
        ll.clear();
        System.out.println(ll);
    }
}
