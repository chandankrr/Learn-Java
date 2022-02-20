// https://www.programiz.com/java-programming/arraylist

package List.ArrayList;

import java.util.ArrayList;

public class ArrayList_03 {
    public static void main(String[] args) {
        ArrayList<String> city = new ArrayList<>();

        city.add("Pune");
        city.add("Delhi");
        city.add("Patna");
        city.add("Kolkata");
        city.add("Indore");
        System.out.println(city);

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(11);
        System.out.println(list);

        city.remove("Indore"); // remove by value
        System.out.println(city);
        city.remove(2); // remove by index
        System.out.println(city);
        list.remove(Integer.valueOf(11)); // remove integer value, not by index
        System.out.println(list);

        city.clear();
        System.out.println(city);
    }
}
