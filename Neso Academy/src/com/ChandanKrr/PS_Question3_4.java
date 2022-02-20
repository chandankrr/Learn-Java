package com.ChandanKrr;

class A {
    void print() {
        System.out.println("From class A");
    }
}

class B {
    void print() {
        System.out.println("From class B");
    }
}

class C {
    void print() {
        System.out.println("From class c");
    }
}

class D {
    void print() {
        System.out.println("From class D");
    }
}

class E {
    void print() {
        System.out.println("From class E");
    }
}

class F extends B {
}

class G extends B{
}


public class PS_Question3_4 {
    public static void main(String[] args) {
        F obj1 = new F();
        obj1.print();

        G obj2 = new G();
        obj2.print();
    }
}

