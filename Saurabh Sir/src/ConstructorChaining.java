class A4 {
    int a;

    public A4(int x) {
        a = x;
        System.out.println("A1");
    }
}

class B4 extends A4 {
    public B4() {
        this(5);
        System.out.println("B1");
    }

    public B4(int a) {
        super(10);
        System.out.println("B2");
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        new B4();
    }
}
