package com.ChandanKrr;

import java.util.Scanner;

public class PS_Question2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int num = input.nextInt();

        int digitSquare = 0;
        while(num > 0){
            int lastDigit = num % 10;
            digitSquare += lastDigit * lastDigit;
            num = num / 10;
        }

        System.out.println("Sum of square of digit of an integer = " + digitSquare);
    }
}
