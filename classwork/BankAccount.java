package classwork;
// Write a Java program to define a class BankAccount with private fields accountNumber and balance. Provide public getter and setter methods to access and update the balance. Create a subclass SavingsAccount that adds an interest rate and a method to calculate interest. Show encapsulation and inheritance in your implementation.

public class BankAccount {
    private int accountNumber;
    private double balance;

    // public void setAccountNumber(int accountNumber){
    //     this.accountNumber=accountNumber;
    // }
    // public int getAccountNumber(){
    //     return this.accountNumber;
    // }
    public BankAccount(int accountNumber,double balance){
        this.accountNumber = accountNumber;    
        this.balance = balance;
    }
    public void setbalance(double balance){
        this.balance=balance;
    }
    public double getbalance(){
        return this.balance;
    }
    
}
class SavingsAccount extends BankAccount{
    private int rate;
    private int time;
    public SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
        
    }
    public void calcInterest(int rate, int time){
       double balance = super.getbalance();
       double interest = (balance*time*rate)/100;
       System.out.println("the interest is : "+interest);

    }
    public static void main(String[] args) {
       SavingsAccount ac1 = new SavingsAccount(1234, 10500);
       ac1.calcInterest(9, 2);

    }
}
