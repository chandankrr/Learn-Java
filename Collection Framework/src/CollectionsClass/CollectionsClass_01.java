package CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsClass_01 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(34);
        list.add(12);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(29);
        list.add(75);
        list.add(76);
        System.out.println(list);

        // min
        System.out.println(Collections.min(list));

        // max
        System.out.println(Collections.max(list));

        // frequency
        System.out.println(Collections.frequency(list, 9));

        // sort
        Collections.sort(list);
        System.out.println(list);

        // sort in descending order
        // Collections.sort(list, Comparator.reverseOrder());
        list.sort(Comparator.reverseOrder());
        System.out.println(list);

    }
}
