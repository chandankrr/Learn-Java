package com.ChandanKrr;

abstract class fruit {
    abstract void apple();

    abstract void mango();
}

class SubClass1 extends fruit {
    @Override
    void apple() {
        System.out.println("Apple from subclass 1");
    }

    @Override
    void mango() {
        System.out.println("Mango from subclass 1");
    }
}

class SubClass2 extends fruit {
    @Override
    void apple() {
        System.out.println("Apple from subclass 2");
    }

    @Override
    void mango() {
        System.out.println("Mango from subclass 2");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        SubClass1 s1 = new SubClass1();
        s1.apple();
        s1.mango();

        SubClass2 s2 = new SubClass2();
        s2.apple();
        s2.mango();

    }
}
