class A2 {
    int z;

    public void func1() {
        System.out.println("Hello JAVA");
    }
}

class B2 extends A2 {
    int z;

    public void func1() {
        super.func1(); // calling fun1 of super class
    }

    public void func2() {
        int z = 10;
        this.z = 20;
        super.z = 30;

        System.out.println("Value of z of super class: " + super.z);
        System.out.println("Value of z of instance variabel of sub class: " + this.z);
        System.out.println("Value of z of local variable of func2: " + z);
    }
}

public class SuperKeyboard {
    public static void main(String[] args) {
        B2 obj = new B2();
        obj.func1();
        obj.func2();
    }
}
