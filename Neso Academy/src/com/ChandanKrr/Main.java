package com.ChandanKrr;

interface MinorDetails {
    void MinorDetails(String g);
}

class MajorDetails {
    void MajorDetails(String n){
        System.out.println("Name = " + n);
    }
}

class Details extends MajorDetails implements MinorDetails {
    void Details() {
        MajorDetails("Lekhraj");
        MinorDetails("Male");
    }

    @Override
    public void MinorDetails(String g) {
        System.out.println("Gender = " + g);
    }
}

public class Main{
    public static void main (String[] args) {
        Details d1 = new Details();
        d1.Details();
        MajorDetails mj1 = new MajorDetails();
        mj1.MajorDetails("Chandan");
        d1.MinorDetails("Male");


    }
}