package com.ChandanKrr;

import java.util.Scanner;

public class Exercise29 {
        // Writing a method that gets the name of the user and a method that gets the age of the user
        public static void main(String[] args) {

        System.out.print("Enter your name: ");
        System.out.println(setName());
        System.out.print("\nEnter your age: ");
        System.out.println(setAge());
    }

    public static String setName() {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        input.close();
        return s;
        // return new Scanner(System.in).nextLine();
    }

    public static int setAge() {
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        input.close();
        return s;
        // return new Scanner(System.in).nextInt();
    }

}
