import java.util.Scanner;

// synchronizing multiple theread
class Account {
    private int bal;

    public Account(int bal) {
        this.bal = bal;
    }

    public boolean isSufficientBalance(int withdrawAmt) {
        if (bal > withdrawAmt)
            return true;
        else
            return false;
    }

    public void withdraw(int amt) {
        bal = bal - amt;
        System.out.println("Withdrawal money: " + amt);
        System.out.println("Your current balance: " + bal);
    }
}

class Customer implements Runnable {
    private Account account;
    private String name;

    public Customer(Account account, String name) {
        this.account = account;
        this.name = name;
    }

    public void run() {
        Scanner input = new Scanner(System.in);
        synchronized (account) {
            System.out.print(name + ", Enter amount to withdraw: ");
            int amt = input.nextInt();

            if (account.isSufficientBalance(amt)) {
                System.out.println("\n" + name);
                account.withdraw(amt);
            }
            else
                System.out.println("Insufficient Balance");

        }
            input.close();
    }
}

public class Threading4 {
    public static void main(String[] args) {
        Account a1 = new Account(1000);
        Customer c1 = new Customer(a1, "Chandan"), c2 = new Customer(a1, "Ravi");
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t1.start();
        t2.start();
    }
}
