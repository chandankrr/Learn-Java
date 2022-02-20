package com.ChandanKrr;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList4 {
    public static void main(String[] args) {
        // 1. Creating a menu program with the following options:
        // a. Add Element
        // b. Remove Element
        // c. Display Elements
        // d. Exit
        // 2. Removing an integer from an ArrayList using a new Integer().
        // 3. Removing an integer from an ArrayList using Integer.valueOf().

        ArrayList<Integer> num = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while(true) {
            displayMenu();
            int choice = input.nextInt();

            if(choice == 1) {
                System.out.print("Enter an integer: ");
                num.add(input.nextInt());
                System.out.println("Added");
            }
            else if(choice == 2) {
                System.out.print("Enter the number to remove: ");
                int elementToRemove = input.nextInt();
                if(num.contains(elementToRemove)) {
                    num.remove(Integer.valueOf(elementToRemove));
                }
            }
            else if(choice == 3) {
                System.out.println("Your List: " + num);
            }
            else if(choice == 4) {
                System.out.println("Good Bye");
                break;
            }
        }

    }

    private static void displayMenu() {
        System.out.println();
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. Display");
        System.out.println("4. Exit");
        System.out.println();
        System.out.print("Your Choice: ");
    }
}
