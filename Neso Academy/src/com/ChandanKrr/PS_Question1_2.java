package com.ChandanKrr;

import java.util.Scanner;

public class PS_Question1_2 {
    static boolean onlyString(String str) {
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (!((str.charAt(i) >= 65 && str.charAt(i) <= 90) || (str.charAt(i) >= 97 && str.charAt(i) <= 122))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        if (onlyString(str)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
