class Encapsulate {

    private String name;
    private int roll;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setRoll(int newRoll) {
        roll = newRoll;
    }
}

public class STQuestion3 {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();

        obj.setName("Chandan Kumar");
        obj.setAge(19);
        obj.setRoll(56);

        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
        System.out.println("Roll no.: " + obj.getRoll());

    }
}
