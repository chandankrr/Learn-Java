package Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 10;
        long ans = factorial(20);

        System.out.println("Factorial of " + n + ": " + ans);
    }

    static long factorial(int n) {
        // base condition
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
