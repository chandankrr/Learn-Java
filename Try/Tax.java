import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {

        System.out.print("Enter amount: ");
        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();

        if (amount <= 50000) {
            System.out.println("amount to be paid is " + amount);
        } else if (amount <= 60000) {
            amount = amount + (amount / 100) * 10;
            System.out.println("amount to be paid is " + amount);
        }
        else if (amount <= 150000) {
            amount = amount + (amount / 100) * 20;
            System.out.println("amount to be paid is " + amount);
        }
        else {
            amount = amount + (amount / 100) * 30;
            System.out.println("amount to be paid is " + amount);
        }

        input.close();
    }

}
