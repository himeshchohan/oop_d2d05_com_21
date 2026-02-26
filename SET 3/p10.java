class BankAccount {

    String accountHolderName;
    double balance;

    static double interestRate;
    BankAccount(String name, double balance) {
        this.accountHolderName = name;
        this.balance = balance;
    }
    double calculateInterest() {
        return balance * interestRate / 100;
    }

    void displayDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Earned: " + calculateInterest());
        System.out.println();
    }

    static void updateInterestRate(double newRate) {
        interestRate = newRate;
        System.out.println("Interest Rate Updated to: " + interestRate + "%");
        System.out.println();
    }
}

public class p10 {
    public static void main(String[] args) {
        BankAccount.updateInterestRate(5);

        BankAccount acc1 = new BankAccount("abc", 2000);
        BankAccount acc2 = new BankAccount("pqr", 5000);

        acc1.displayDetails();
        acc2.displayDetails();
        BankAccount.updateInterestRate(7);

        acc1.displayDetails();
        acc2.displayDetails();
    }
}