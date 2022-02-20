// interface: all variable and method are public and static, interface donot have constructor, a class is require to implement or we can override the method of interface, in interface all variable are final we can't change the value 

interface I1 { 
    void f1();
}

interface I2 {
    
    void f2();
}

class B6 {

}

class A6 extends B6 implements I1, I2 {

    @Override
    public void f1() {
        System.out.println("Hello World1");
        
    }
    
    @Override
    public void f2() {
        System.out.println("Hello World2");
    }

    public void f3() {
        System.out.println("Hello World3");
    }

}

public class Interface {
    public static void main(String[] args) {
        A6 obj = new A6();
        obj.f1();
        obj.f2();
        obj.f3();

        // ----------------------------

        I1 obj1 = new A6();
        obj1.f1();

        I2 obj2 = new A6();
        obj2.f2();
    }
    
}
