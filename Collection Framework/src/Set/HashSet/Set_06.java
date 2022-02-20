package Set.HashSet;

import java.util.HashSet;
// import java.util.Iterator;

public class Set_06 {

    public static void main(String[] args) {
        HashSet<Students> studentSet = new HashSet<>();

        studentSet.add(new Students("Chandan", 24));
        studentSet.add(new Students("Neelu", 30));
        studentSet.add(new Students("Chandan", 40));
        studentSet.add(new Students("Ravi", 5));
        studentSet.add(new Students("Chandan", 24));

        // System.out.println(studentSet);

        // iterating
        // 1st way
        // Iterator<Students> studentsIterator = studentSet.iterator();

        // while (studentsIterator.hasNext()){
        //     System.out.println(studentsIterator.next());
        // }
        // System.out.println();

        // 2nd way
        for (Students students : studentSet) {
            System.out.println(students);
        }
    }
}
