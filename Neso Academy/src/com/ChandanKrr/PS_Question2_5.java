package com.ChandanKrr;

import java.util.ArrayList;
import java.util.Scanner;

public class PS_Question2_5 {
    public static void main(String[] args) {
        ArrayList<String> word = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 4; i++) {
            String str = input.nextLine();
            word.add(str);
        }

        System.out.println();
        String searchElement = input.nextLine();
        System.out.println("------------------------------------");
        int lengthSearchElement = searchElement.length();
        int count = 0;

        for(int i = 0; i < 4; i++){
            if(word.get(i).length() == lengthSearchElement){
                count++;
            }
        }

        System.out.println("\ninput1: " + word);
        System.out.println("input2: " + searchElement);

        System.out.println("\noutput: " + (word.size() - count));
    }
}
