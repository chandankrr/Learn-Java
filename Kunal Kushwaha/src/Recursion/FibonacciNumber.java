package Recursion;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 4;

        int ans = fib(n);
        System.out.println("Fibonacci Number: " + ans);
    }

    static int fib(int n) {
        // base condition
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
