public class Question1 {
    public static void main(String[] args) {
        // use of System.out.printf() and System.out.format()
        int n = 7;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Table of %d: ", n);
            System.out.format("%d X %d = %d\n", n, i, n * i);
        }
    }
}
