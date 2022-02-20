package com.ChandanKrr;

interface  FourWheeler{
    public void numOfWheels(int w);
}

interface TwoWheeler{
    public void blowHorn();
}

class Vehicle1 implements TwoWheeler, FourWheeler {
    @Override
    public void numOfWheels(int w){
        System.out.println("Number of wheels = " + w);
    }

    @Override
    public void blowHorn(){
        System.out.println("Blowing horn: pe pe pep pepeeee");
    }
}

public class InterfaceExample{
    public static void main(String[] args) {
       Vehicle1 v1 = new Vehicle1();
       v1.numOfWheels(10);
       v1.blowHorn();
    }
}
