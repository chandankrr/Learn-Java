package com.ChandanKrr;

public class PS_Question1_5 {
    static int calPower(int base, int exponent) {
        int result = 1;
        for(;exponent != 0; exponent--){
            result = result * base;
        }
        return  result;
    }

    public static void main(String[] args) {
        int base = 7;
        int exponent = 5;
        int ans = calPower(base, exponent);
        System.out.println("Power of 7 raise to 5 = " + ans);
    }
}
