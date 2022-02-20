class Parent {
    public static void f1() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    public static void f1() { // function overhidding
        System.out.println("Child");
    }
}


public class StaticMemberMethod {
    public static void main(String[] args) {
        Child.f1();
    }
}
