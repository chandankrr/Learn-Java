/* public class FinalKeyword {
    private int x; // instance variable inititalize with zero
    private final int y1 = 5; // final instance member variable, final instance member variable initialization is blank and further value cannot be change
    private final int y2;
    private final int y3;

    // instance initialization block
    {
        y2 = 10;
    }
    
    // constructor 
    FinalKeyword() {
        y3 = 20;
    }

    private static final int z; // normal static instance variable initialize with zero, but final instance variable initialization is blank

    public void f1() {
        int a; // local variable initialization is blank but value can be change futher
        final int b; // final local variable initialization is also blank but value can't be change futher
    }
}

// final class
final class Dummy { // final class means class cannot be change or inherit
    
}

// final method:- means method cannot be overridden but overloading is possible
class Dummy1 {
    public final void ex1() {
        System.out.println("Hello World");
    }
    
}

class Dummy2 extends Dummy1 {
    // public void ex1() { // error bcz ex1 cannot be overridden
    //     System.out.println("Hello Chandan");
    // }
} */