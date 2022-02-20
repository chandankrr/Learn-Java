package com.ChandanKrr;

import java.util.Scanner;

public class PS_Question6 {
    static void reverseWord(String s1){
        String newS1 = "";
        char ch;
        for(int i = 0; i < s1.length(); i++){
            ch = s1.charAt(i);
            newS1 = ch + newS1;
        }
        System.out.println(newS1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s1 = input.next();

        reverseWord(s1);
    }
}
