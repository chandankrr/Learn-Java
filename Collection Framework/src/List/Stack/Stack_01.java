// https://www.programiz.com/java-programming/stack

package List.Stack;

import java.util.Stack;

public class Stack_01 {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println(animals);

        System.out.println(animals.peek());

        animals.pop();
        System.out.println(animals);
        System.out.println(animals.peek());

        // search --> return position of element if available
        System.out.println("Position of Horse: " + animals.search("Horse"));

        // size
        System.out.println(animals.size());

        // empty
        System.out.println(animals.empty());
    }
}
