public class CallingMethod {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Chandan Kumar");
        s1.setAge(18);
        s1.setRollno(56);

        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
        System.out.println("Name: " + s1.getRollno());
    }
    
}
