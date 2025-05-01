package method_task;
// Write a method to calculate the compound interest given principal, rate, and time



public class q5 {
    public void compounder(double p, double r, double t) {
       double i = p * Math.pow(1.0 + t, r) - p;
       System.out.println("Compound Interest: " + i);
    }
 
    public static void main(String[] args) {
       q5 obj = new q5();
       obj.compounder(1000.0, 0.05, 3.0);
    }
 }