class Member {
    String name;
    int age;
    String phone_no;
    String address;
    int salary;

    public void printSalary() {
        System.out.println(salary);
    }
}

class Employee extends Member{
    String specialization;
}

class Manager extends Member{
    String department;
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Nishant Rajput";
        e1.age = 19;
        e1.phone_no = "99969223XX";
        e1.address = "Baran road, Haryana";
        e1.salary = 85000;
        e1.specialization = "Artificial Intelligence";

        Manager m1 = new Manager();
        m1.name = "Ravi Kumar";
        m1.age = 23;
        m1.phone_no = "82107569XX";
        m1.address = "Nikunj Police Colony, Patna";
        m1.salary = 125000;
        m1.department = "CSE";

        // displaying information of Employee
        System.out.println("\n\t**** Information of Employee ****");
        System.out.println("Employee Name: " + e1.name);
        System.out.println(e1.name + "'s age: " + e1.age);
        System.out.println(e1.name + "'s phone number: " + e1.phone_no) ;
        System.out.println(e1.name + "'s address: " + e1.address);
        System.out.println(e1.name + "'s salary: " + e1.salary);
        System.out.println(e1.name + "'s specialization: " + e1.specialization);
        
        // displaying information of Manager
        System.out.println("\n\t**** Information of Manager ****");
        System.out.println("Manager Name: " + m1.name);
        System.out.println(m1.name + "'s age: " + m1.age);
        System.out.println(m1.name + "'s phone number: " + m1.phone_no) ;
        System.out.println(m1.name + "'s address: " + m1.address);
        System.out.println(m1.name + "'s salary: " + m1.salary);
        System.out.println(m1.name + "'s department: " + m1.department);
    }
}