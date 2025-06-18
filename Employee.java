class Emp {
    protected double baseSalary;

    public Emp(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }
}

class Manager extends Emp {
    private double performanceBonus;

    public Manager(double baseSalary, double performanceBonus) {
        super(baseSalary);
        this.performanceBonus = performanceBonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + performanceBonus;
    }

   
}
public class Employee{
     public static void main(String[] args) {
        Emp emp = new Emp(40000);
        Manager mgr = new Manager(60000, 15000);

        System.out.println("Employee Salary: " + emp.calculateSalary());
        System.out.println("Manager Salary: " + mgr.calculateSalary());
    }

}
