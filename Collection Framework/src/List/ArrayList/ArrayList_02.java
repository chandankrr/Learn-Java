// https://www.programiz.com/java-programming/arraylist

package List.ArrayList;

import java.util.ArrayList;

public class ArrayList_02 {
    public static void main(String[] args) {

        ArrayList<String> studentName = new ArrayList<>();

        studentName.add("Chandan");
        studentName.add("Ravi");
        studentName.add("Neelu");
        studentName.add("Neelam");
        System.out.println(studentName);

        ArrayList<String> city = new ArrayList<>();

        city.add("Pune");
        city.add("Delhi");
        city.add("Patna");
        city.add("Kolkata");
        city.add("Indore");
        System.out.println(city);

        studentName.addAll(city);
        System.out.println(studentName);

        System.out.println(city.get(2));

        studentName.removeAll(city);
        System.out.println(studentName);
    }
}
