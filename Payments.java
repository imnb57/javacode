// 2. You are working on an e-commerce application where different payment methods are supported, including credit card, PayPal, and bank transfer. Each payment method has its own validation and transaction process. Implement a Java program using polymorphism to process payments using different payment methods.
abstract class Payment {
    abstract boolean valid();
    abstract void payType();
    abstract void payment();
}
class CreditCard extends Payment{
    private final int money;
    public CreditCard(int money){
        this.money = money;
    }
    @Override
    public void payType(){
        System.out.println("You are paying with card, balance = "+money);
    }
    @Override
    public boolean valid(){
        if(money>0){
            return true;
        }
        return false;
    }
    @Override
    public void payment(){
        if(valid()){
            payType();
            System.out.println("Payment done");
            System.out.println();
        }
    }
    
}
class PayPal extends Payment{
    private final String email;
    public PayPal(String email){
        this.email = email;
    }
    @Override
    public boolean valid(){
    if(email!=null){
        return true;
    }
    return false;
  }
    @Override
    public void payType(){
        System.out.println("you are paying with paypal\nuser: "+email);
    }
    @Override
    public void payment(){
        if(valid()){
            payType();
            System.out.println("Payment successfully done");
            System.out.println();
            
        }
    
    }
}
class BankTransfer extends Payment {
    private final String accountNumber;

    public BankTransfer(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public boolean valid() {
        return accountNumber != null && accountNumber.length() == 10;
    }

    @Override
    public void payType() {
        System.out.println("Payment Method: Bank Transfer");
    }

    @Override
    public void payment() {
        if (valid()) {
            payType();
            System.out.println("Processing bank transfer for account: " + accountNumber);
        } else {
            System.out.println("Invalid bank transfer.");
        }
    }
}

public class Payments{
    public static void main(String[] args) {
        Payment p1 = new CreditCard(1234);
        p1.payment();
        Payment paypal = new PayPal("example@gmail.com");
        paypal.payment();
        Payment bank = new BankTransfer("1234123412");
        bank.payment();
    }

}