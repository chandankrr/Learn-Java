package com.ChandanKrr;

public class PS_Question7 {

    static void five(int ...num){
        for(int i = 0; i < num.length; i++){
            if(num[i] % 5 == 0){
                System.out.print(num[i] + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
            five(5);
            five(5, 10);
            five(5, 10, 3);
            five(5, 10, 3, 4);
            five(5, 10, 3, 4, 7);

    }
}
