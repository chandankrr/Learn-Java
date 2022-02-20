abstract class Person1 {
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

public class AbstractClass {
    public static void main(String[] args) {
        // Person1 obj = new Person1(); // error bcz Person1 is abstract class and we cannot create its object
    }
    
}
