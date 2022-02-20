import java.util.Scanner;

public class FactorialRecursion {
    static double factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a postive integer: ");
        int x = input.nextInt();

        System.out.println("\nFactorial of " + x + " = " + factorial(x));
        input.close();
    }
}
