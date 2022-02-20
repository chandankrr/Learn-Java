package Recursion;

public class SumOfNumber {
    public static void main(String[] args) {
        int n = 10;

        int ans = sum(n);
        System.out.println("Sum of " + n + " numbers = " + ans);
    }

    static int sum(int n) {
        // base condition
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
}
