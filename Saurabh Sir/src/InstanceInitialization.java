public class InstanceInitialization {
    private int x;

    {
        System.out.println("Initialization Block: x = " + x);
        x = 5;
    }

    public InstanceInitialization() {
        System.out.println("Constructor: x = " + x);
    }

    public void dispaly() {
        System.out.println("Value of x = " + x);
    }

    public static void main(String[] args) {
        InstanceInitialization t1 = new InstanceInitialization();
        InstanceInitialization t2 = new InstanceInitialization();

        t1.dispaly();
        t2.dispaly();
    }
    
}
