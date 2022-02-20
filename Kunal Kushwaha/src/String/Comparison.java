package String;

public class Comparison {
    public static void main(String[] args) {
        // string are immutable so, we cannot change its value after assigning it a value.
        // and string are store in string pool in heap memory, if two different reference variable have
        // same valued means in string pool there is only one value and all other reference variable
        // refer to that string only and if we made any changes to any of variable then it creates new
        // object and start referring to that one in string pool.
        // string are immutable because of security reason.
        // example: In a class more than one student's name is "Chandan" and in string pool all the
        // student's name referring to that, and if any of one student want to change its name then name of
        // all the other student also get change that why string are immutable

        String a = "Chandan";
        String b = "Chandan";

        System.out.println(a == b); // checks memory address if same then return true
        // System.out.println(a.equals(b)); // check value only not memory

        // how to create two different string of same value
        String s1 = new String("chandan");
        String s2 = new String("chandan");

        System.out.println(s1 == s2); // checks memory address if not same then return false
        // System.out.println(s1.equals(s2)); // check value only not memory
    }
}
