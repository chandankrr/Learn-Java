package com.ChandanKrr;

class Vehicle{
    void printWheels(){
        System.out.println("Number of wheels = " + 2);
    }

    void printWheels(int x){
        System.out.println("Number of wheels = " + x);
    }

    void printWheels(int x, int y){
        System.out.println("Number of wheels = " + (x + y));
    }
}

class Car extends Vehicle{
    @Override
    void printWheels(int x) {
        System.out.println("Number of wheels of car = " + x);
    }
}

public class OverloadingAndOverriding {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.printWheels();
        v1.printWheels(10);
        v1.printWheels(2, 6);

        System.out.println();
        Car c1 = new Car();
        c1.printWheels(4);


    }
}
