public class Box1 {
    private int l, b, h;

    public Box1() {
        l = 10;
        b = 20;
        h = 30;
    }

    public Box1(int L, int B, int H) {
        l = L;
        b = B;
        h = H;
    }

    public void display() {
        System.out.println("Length = " + l);
        System.out.println("Breadth = " + b);
        System.out.println("Height = " + h);
    }

    public static void main(String[] args) {
        Box1 b1 = new Box1();
        Box1 b2 = new Box1(12, 13, 14);
        
        System.out.println("Constructor Example");
        b1.display();
        System.out.println("\nConstructor Overloading");
        b2.display();
    }

    
}
