class Parent1 {
    static int y = 5;
}

class Child1 extends Parent1{
    static {
        y = 10;
    }
}


public class StaticMemberVariable {
    public static void main(String[] args) {
        System.out.println("Value of y = " + Child1.y);
    }
}
