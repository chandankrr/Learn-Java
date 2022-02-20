package com.ChandanKrr;

public class StringObject {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = new String("Hello World");

        System.out.println(s1);
        System.out.println(s2);

        // String are immutable in java

        String name = "Chandan"; // remove by java garbage collector for memory
        name = "Ravi";

        System.out.println(name);


        String str1 = "value1";
        String str2 = str1;
        str2 = "value2"; // value of str1 not effected

        System.out.println(str2);
        System.out.println(str1);
    }
}
