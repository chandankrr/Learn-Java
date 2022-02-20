package Patterns;

public class Pattern_31 {
    public static void main(String[] args) {
        int n = 5;

        pattern(n);
    }

    static void pattern(int n) {
        n = n - 1;
        int originalN = n;
        n = 2 * n;

        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                // int atEveryIndex = Math.min(Math.min(row, col), Math.min(n - row, n - col));
                // int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                int atEveryIndex = originalN - Math.min(Math.min(row-1, col-1),
                        Math.min(n - row-1, n - col-1));

                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
