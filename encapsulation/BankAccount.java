// 2. You are building a banking application that has a BankAccount class. Implement the BankAccount class with encapsulation principles in mind. Include private instance variables for the account number, account holder name, and account balance. Provide public methods to allow clients to deposit and withdraw funds, as well as access the account balance. Ensure that the account balance cannot be accessed or modified directly.

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0;
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

