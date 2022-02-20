package com.ChandanKrr;

import java.util.Scanner;

public class PS_Question8 {
    static boolean love6(int a, int b){
        if((a == 6 || b == 6) || (a - b == 6) || (a + b == 6)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two number: (a and b): ");
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println(love6(a, b));


    }
}
