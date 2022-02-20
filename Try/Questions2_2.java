import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

class Employee2 implements Serializable {
    private String name;
    private String dob;
    private String department;
    private String designation;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee2 [name=" + name + ", dob=" + dob + ", department=" + department + ", designation=" + designation
                + ", salary=" + salary + "]";
    }

}

public class Questions2_2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        Employee2 emp = new Employee2();

        System.out.print("Enter name: ");
        emp.setName(sc.nextLine());
        System.out.print("Enter D.O.B.: ");
        emp.setDob(sc.nextLine());
        System.out.print("Enter department: ");
        emp.setDepartment(sc.nextLine());
        System.out.print("Enter designation: ");
        emp.setDesignation(sc.nextLine());
        System.out.print("Enter salary: ");
        emp.setSalary(sc.nextDouble());
        sc.nextLine();

        FileOutputStream fos = new FileOutputStream("OutObject.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(emp);

        FileInputStream fis = new FileInputStream("OutObject.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Employee2 emp2 = (Employee2) ois.readObject();

        System.out.println("\nName: " + emp2.getName());
        System.out.println("D.O.B.: " + emp2.getDob());
        System.out.println("Department: " + emp2.getDepartment());
        System.out.println("Designation: " + emp2.getDesignation());
        System.out.println("Salary: " + emp2.getSalary());

        fos.close();
        oos.close();
        fis.close();
        ois.close();
        sc.close();
    }
}
