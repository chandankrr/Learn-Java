package com.ChandanKrr;

public class CommandLineArgument1 {
    public static void main(String[] args) {
        int fact;
        int num = Integer.parseInt(args[0]);
        if (num <= 0) {
            System.out.println(num + " is not a valid number!");
        } else {
            for (int i = 2; i <= num; i++) {
                fact = 0;
                for(int j = 1; j <= num; j++){
                    if(i%j==0)
                        fact++;
                }
                if(fact == 2)
                    System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
