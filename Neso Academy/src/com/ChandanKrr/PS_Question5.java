package com.ChandanKrr;

import java.util.Scanner;

public class PS_Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str;
        System.out.print("Enter a string: ");
        str = input.next();

        char[] ch = str.toCharArray();
        boolean isAlphabetChar = false;

        for(int i = 0; i < str.length(); i++){
            if((ch[i] >= 'A' && ch[i] <= 'Z') || (ch[i] >= 'a' && ch[i] <= 'z')) {
                isAlphabetChar = true;
            }
            else {
                isAlphabetChar = false;
            }
        }

        if(isAlphabetChar)
            System.out.println("True");
        else
            System.out.println("False");

        input.close();
    }
}
