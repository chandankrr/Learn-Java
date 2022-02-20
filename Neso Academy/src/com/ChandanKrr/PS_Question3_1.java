package com.ChandanKrr;

abstract class Telephone{
    abstract void with();
    abstract void lift();
    abstract void disconnected();
}

class Smart_Telephone extends Telephone{
    @Override
    void with() {
        System.out.println("I am on call with someone");
    }

    @Override
    void lift() {
        System.out.println("Someone lift the telephone");
    }

    @Override
    void disconnected() {
        System.out.println("Call get disconnected");
    }
}

public class PS_Question3_1 {
    public static void main(String[] args) {
        Smart_Telephone st1 = new Smart_Telephone();
        st1.with();
        st1.lift();
        st1.disconnected();
    }
}
