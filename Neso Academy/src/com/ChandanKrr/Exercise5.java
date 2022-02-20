package com.ChandanKrr;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");

        // first way
        //  int x;
        //  x = input.nextInt();
        //
        //  if(x % 2 == 0) {
        //       System.out.println("Even");
        //  }
        //  else {
        //       System.out.println("Odd");
        //  }
        //
        //  input.close();


        // second way
        if (input.nextInt() % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        input.close();
    }
}
