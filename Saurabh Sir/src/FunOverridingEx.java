class A1 {
    public void f1() {
        System.out.println("Class A");
    }
}

class B1 extends A1 {
    @Override
    public void f1() {
        System.out.println("Class B");
    }
}

public class FunOverridingEx {
    public static void main(String[] args) {
        B1 obj = new B1();

        obj.f1();
    }

}
