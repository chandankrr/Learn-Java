package com.ChandanKrr;

class Grandparents {
    public void printGrandparent() {
        System.out.println("Hii from grandparents");
    }
}

class Parents extends Grandparents {
    public void printParent() {
        System.out.println("Hii from parents");
    }
}

class Child extends Parents {
    public void printChild() {
        System.out.println("Hii from child");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Child c1 = new Child();

        c1.printGrandparent();
        c1.printParent();
        c1.printChild();
    }
}
