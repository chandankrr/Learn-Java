abstract class A5 {
    private String name;
    private int age;

    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    public void getName() {
        System.out.println("Name = " + name);
    }

    public void getAge() {
        System.out.println("Age = " + age);
    }
}

class B5 extends A5 {
    
}


public class AbstractClass1 {
    public static void main(String[] args) {
        A5 obj = new B5();

        obj.setName("Chandan");
        obj.setAge(18);

        obj.getName();
        obj.getAge();

        // ----------------------------------

        A5 obj1 = new B5();

        obj1.setName("Abhijeet");
        obj1.setAge(20);

        obj1.getName();
        obj1.getAge();
    }
    
}
