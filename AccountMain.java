class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double calculateInterest() {
        return balance * 0.03; 
    }
}

class SavingsAccount extends Account {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.04;
    }
}

class FixedDepositAccount extends Account {

    public FixedDepositAccount(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.07; 
    }

   
}
public class AccountMain{
     public static void main(String[] args) {
        Account base = new Account(10000);
        SavingsAccount savings = new SavingsAccount(10000);
        FixedDepositAccount fd = new FixedDepositAccount(10000);

        System.out.println("Base Account Interest: " + base.calculateInterest());
        System.out.println("Savings Account Interest: " + savings.calculateInterest());
        System.out.println("Fixed Deposit Account Interest: " + fd.calculateInterest());
    }
    
}

