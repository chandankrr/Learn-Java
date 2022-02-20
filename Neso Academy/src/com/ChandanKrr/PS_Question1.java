package com.ChandanKrr;

import java.util.Scanner;

public class PS_Question1 {

    static boolean squirrelPlay(int temp, boolean isSummer) {
        if ((temp >= 60 && temp <= 90) && !isSummer) {
            return true;
        } else {
            if ((temp >= 60 && temp <= 100) && isSummer) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        int temp = input.nextInt();

        System.out.print("Is summer ? enter (true/false): ");
        boolean isSummer = input.nextBoolean();

        boolean res = squirrelPlay(temp, isSummer);

        System.out.println("\n" + res);
    }
}
