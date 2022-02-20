// example our throw and default throw

public class ExceptionHandling3 {
    public static void main(String[] args) {
        int balance = 5000;
        int withdrawlAmount = 7000;

        if(balance < withdrawlAmount)
            throw new ArithmeticException("Insufficent Balance");
        
        balance = balance - withdrawlAmount;
        System.out.println("Transaction Successfully completed");
        System.out.println("Program continue...");
    }
}
