package com.ChandanKrr;

public class Exercise6 {
    public static void main(String[] args) {
        int n = 5;

        switch (n % 2){
            case 0:
                System.out.println("even");
                break;
            case 1:
                System.out.println("odd");
                break;
            default:
                System.out.println("not even nor odd");
        }
    }
}
