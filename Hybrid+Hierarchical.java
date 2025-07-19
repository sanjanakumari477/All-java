import java.util.*;

// Interface (for Hybrid Inheritance)
interface Transaction {
    void deposit(double amount);
    void withdraw(double amount);
}

// Parent class (Hierarchical base)
class Account {
    String name;
    String accNo;
    double balance;

    void createAccount(String name, String accNo, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: ₹" + balance);
    }
}

// Child class 1
class SavingsAccount extends Account implements Transaction {
    public void deposit(double amount) {
        balance += amount;
        System.out.println("₹" + amount + " deposited to Savings. New balance: ₹" + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance)
            System.out.println("Insufficient balance in Savings!");
        else {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn from Savings. New balance: ₹" + balance);
        }
    }
}

// Child class 2
class CurrentAccount extends Account implements Transaction {
    public void deposit(double amount) {
        balance += amount;
        System.out.println("₹" + amount + " deposited to Current. New balance: ₹" + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance)
            System.out.println("Insufficient balance in Current!");
        else {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn from Current. New balance: ₹" + balance);
        }
    }
}

public class BankHybridDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Using SavingsAccount (Hierarchical + Hybrid)
        SavingsAccount sa = new SavingsAccount();
        sa.createAccount("Sanju", "SA123", 5000);
        sa.deposit(1000);
        sa.withdraw(2000);
        sa.display();

        System.out.println("\n-----------------------\n");

        // Using CurrentAccount (Hierarchical + Hybrid)
        CurrentAccount ca = new CurrentAccount();
        ca.createAccount("Karthik", "CA987", 10000);
        ca.deposit(2000);
        ca.withdraw(12000);  // Should show insufficient
        ca.display();
    }
}
