// 2. Write a Java program to create a class called “Simple Interest” with a data fields principle, time and rate, using setter getter method and print the values.

public class SimpleInterest {
    private double principal;
    private double time;
    private double rate;

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double calculateInterest() {
        return (principal * time * rate) / 100;
    }

    public static void main(String[] args) {
        SimpleInterest si = new SimpleInterest();
        si.setPrincipal(1000);
        si.setTime(2);
        si.setRate(5);
        System.out.println("Simple Interest: " + si.calculateInterest());
    }
}

