abstract class Parent2 {
    abstract void show(); // abstract method: force to override the method in subclass and abstract method have no body just a declaration
}

class Student2 extends Parent2 {

    @Override
    void show() {
        System.out.println("Hello from method show");        
    }

}

public class AbstractMethod2 {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.show();
    }
    
}
