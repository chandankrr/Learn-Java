// https://www.programiz.com/java-programming/arraylist

package List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_01 {
    public static void main(String[] args) {
        ArrayList<String> studentName = new ArrayList<>();

        // default size = 10;
        // size increase by = n + n / 2 + 1;

        studentName.add("Chandan");
        studentName.add("Ravi");
        studentName.add("Neelu");
        studentName.add("Neelam");

        System.out.println(studentName);

        studentName.add(1,"Payal");
        System.out.println(studentName);

        Collections.sort(studentName);
        System.out.println(studentName);
    }
}
