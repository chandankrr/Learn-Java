public class StaticInitialization {
    private static int k;

    static {
        System.out.println("Static Initialization Block: k = " + k);
        k = 10;
    }

    public static void dispaly() {
        System.out.println("Value of k = " + k);
    }

    public static void main(String[] args) {
        new StaticInitialization();
        StaticInitialization.dispaly();
    }
    
}
