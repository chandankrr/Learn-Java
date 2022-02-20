package com.ChandanKrr;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name and age: ");
        String name = input.nextLine();
        int age = input.nextInt();

        
        input.close();
        
        System.out.println(name + "! are you " + age + " years old?");
    }
}
