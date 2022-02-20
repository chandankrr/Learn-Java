public class SumOfNumberUsingRecursion {

    static int sumRec(int n) {
        if (n == 1)
            return 1;
        return n + sumRec(n - 1);
    }

    public static void main(String[] args) {
        // sum of n natural number using recursion
        int sum = sumRec(10);
        System.out.println(sum);
    }
}
