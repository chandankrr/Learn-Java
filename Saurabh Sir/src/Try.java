public class Try {
    static int a; // static instance variable initialize with zero
    int b; // instance variable initialize with zero

    public void display() {
        System.out.println(b);
    }

    public static void main(String[] args) {
        System.out.println(a);
        Try obj = new Try();
        obj.display();

        // int c;
        // System.out.println(c); // error bcz local varaible intialization is blank it not going to print any garabage values like c and c++
    }

}