package com.ChandanKrr;

public class PS_Question2_1 {

    static String rearrangeWord(String str) {
        String s1 = "";
        s1 += str.substring(str.length() - 1);
        s1 += str.substring(1, str.length() - 1);
        s1 += str.substring(0, 1);

        return s1;
    }

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(rearrangeWord(str));
    }
}
