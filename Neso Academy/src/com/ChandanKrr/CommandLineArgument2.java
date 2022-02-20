package com.ChandanKrr;

public class CommandLineArgument2 {
    public static void main(String[] args) {
        int evensum=0,oddsum=0,evenavg=0,oddavg=0,evencount=0,oddcount=0;
        for(int i=0; i<args.length; i++)
        {
            int n=Integer.parseInt(args[i]);
            if(n%2==0)
            {
                evensum=evensum+n;
                evencount++;
            }
            else
            {
                oddsum=oddsum+n;
                oddcount++;
            }
        }
        evenavg=evensum/evencount;
        oddavg=oddsum/oddcount;
        System.out.println("the sum of even numbers is "+evensum+" average of even numbers "+evenavg);
        System.out.println("the sum of odd numbers is "+oddsum+" average of odd numbers "+oddavg);
    }
}

