import java.io.Serializable;

public class Employee1 implements Serializable {
    private static final long serialVersionUID = 1l;
    int id;
    String name;

    public Employee1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("ID = " + id + "\nName = " + name);
    }
    
    public static void main(String[] args) {
        Employee1 e1 = new Employee1(1001, "Rahul");
        e1.display();
    }
}