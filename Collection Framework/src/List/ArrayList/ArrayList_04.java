// https://www.programiz.com/java-programming/arraylist

package List.ArrayList;

import java.util.ArrayList;

public class ArrayList_04 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(11);
        System.out.println(list);

        list.set(1, 500);
        System.out.println(list);

        System.out.println(list.contains(7));
    }
}
