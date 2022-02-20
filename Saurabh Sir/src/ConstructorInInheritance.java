class A3 {
    int a;

    A3(int x) {
        a = x;
        System.out.println("A");
    }
}

class B3 extends A3 {
    int b;

    public B3() {
        super(10); // if constructor of super class is not parametize then no need of super()
        System.out.println("B");
    }
}


public class ConstructorInInheritance {
    public static void main(String[] args) {
        new B3();
    }
    
}
