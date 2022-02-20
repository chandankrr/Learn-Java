class Example {
    int x; // instance variable
    private static int y; // static member variable

    public void func1() { // instance member function
        x = 10;
        System.out.println(x);
    }

    public static void func2() { // static member function
        y = 4;
        System.out.println(y);
    }

    // inner class (class inside a class)
    static class Test { // static class
        public static String country = "INDIA";
    }
}

public class StaticVaraibleAndMethod {
    public static void main(String[] args) {
        Example ex1 = new Example();
        Example ex2 = new Example();

        ex1.func1();
        ex2.func1();

        Example.func2();

        System.out.println(Example.Test.country);
    }
}

// static function can access only static variable not instance variable
