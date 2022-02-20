public class CountObject {
    public static void main(String[] args) {
        new Obj();
        new Obj();
        new Obj();
        Obj o4 = new Obj();
        new Obj();
        
        o4.display(); // calling method with object
        Obj.display1(); // calling method with Class name bcz display1 is static method
    }
}

class Obj {
    static int count;

    public Obj() {
        count++;
    }

    public void display() {
        System.out.println("Total number of object = " + count);
    }

    static public void display1() {
        System.out.println("Total number of object = " + count);
    }
}
