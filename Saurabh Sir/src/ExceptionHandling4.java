public class ExceptionHandling4 {
    public static void main(String[] args) {
        int balance = 5000;
        int withdrawlAmount = 6000;

        try{
            if(balance < withdrawlAmount){
                throw new ArithmeticException("Insufficent Balance");
            }
            balance = balance - withdrawlAmount;
            System.out.println("Transcation Successfully Completed");
        }
        catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("Program continue");
    }
    
}
