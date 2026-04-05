import java.util.*;
class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    Scanner sc = new Scanner(System.in);

    void openAccount() {
        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter Account Holder Name: ");
        accountHolderName = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
    }

    void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        balance += amount;
        System.out.println("Amount Deposited Successfully.");
    }

    void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful.");
        } 
        else {
            System.out.println("Insufficient Balance!");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance = " + balance);
    }
}

class SavingAccount extends BankAccount {
    double rate = 4.0; 

    void calculateInterest() {
        double interest = (balance * rate) / 100;
        System.out.println("Interest = " + interest);
    }
}

class FixedDepositAccount extends BankAccount {
    int years;
    double rate = 6.5;
    void maturityAmount() {
        System.out.print("Enter number of years: ");
        years = sc.nextInt();
        double maturity = balance * Math.pow((1 + rate / 100), years);
        System.out.println("Maturity Amount = " + maturity);
    }
}

public class p14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Saving Account");
        System.out.println("2. Fixed Deposit Account");
        System.out.print("Choose Account Type: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            SavingAccount sa = new SavingAccount();
            sa.openAccount();
            sa.deposit();
            sa.withdraw();
            sa.checkBalance();
            sa.calculateInterest();

        } 
        else if (choice == 2){
            FixedDepositAccount fd = new FixedDepositAccount();
            fd.openAccount();
            fd.deposit();
            fd.checkBalance();
            fd.maturityAmount();
        }
        else {
            System.out.println("Invalid Choice!");
        }
    }
}
