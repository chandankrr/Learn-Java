package CollectionsClass;

import java.util.ArrayList;
// import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsClass_02 {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("Chandan", 20));
        list.add(new Student("Ravi", 10));
        list.add(new Student("Aditya", 22));
        list.add(new Student("Ravi", 32));
        list.add(new Student("Neelu", 5));
        System.out.println(list);

        // Student s1 = new Student("Payal", 10);
        // Student s2 = new Student("Chandan", 5);
        // System.out.println(s1.compareTo(s2));

        // Collections.sort(list, new Comparator<Student>() {
        //     @Override
        //     public int compare(Student o1, Student o2) {
        //         return o1.name.compareTo(o2.name);
        //     }
        // });
        list.sort(Comparator.comparing(o -> o.name));
        System.out.println(list);
    }
}
