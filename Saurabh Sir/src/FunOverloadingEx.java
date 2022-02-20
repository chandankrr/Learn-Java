class A {
    public void f1() {
        System.out.println("Class A");
    }
}

class B extends A {
    public void f1(int a, int b) {
        System.out.println("Class B");
    }
}

public class FunOverloadingEx {
    public static void main(String[] args) {
        B obj = new B();

        obj.f1();
        obj.f1(4, 5);
    }

}
