// https://www.programiz.com/java-programming/arraylist

package List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_05 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(11);
        System.out.println(list);

        // 1st way
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // 2nd way
        for(int element : list){
            System.out.print(element + " ");
        }
        System.out.println();

        // 3rd way
        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }
}
