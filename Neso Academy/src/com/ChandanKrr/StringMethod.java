package com.ChandanKrr;

public class StringMethod {
    public static void main(String[] args) {
        String s1 = "ChaNdaN kUmaRC";
        String s2 = "hello world";
        String s3 = "  ";

        System.out.println(s1.toUpperCase()); // uppercase
        System.out.println(s1.toLowerCase()); // lowercase
        System.out.println(s1.length()); // length of string including whitespace
        System.out.println(s2.isEmpty()); // return true or false
        System.out.println(s3.isBlank()); // return true or false, but not considered space as character
        System.out.println(s1.charAt(10)); // print char at index 10
        System.out.println(s1.indexOf('R')); // print index of char R, if char not found return -1
        System.out.println(s1.lastIndexOf('C')); // print index of last char C

        String s4 = "Abhijeet";
        String s5 = s4.concat("kumar");
        System.out.println(s5);
    }
}
