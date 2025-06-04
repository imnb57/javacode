// 2. Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that overrides the work() method.
public class Employee {
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("Employee is working.");
    }

    public double getSalary() {
        return this.salary;
    }
}

class HRManager extends Employee {
    public HRManager(double salary) {
        super(salary);
    }

    @Override
    public void work() {
        System.out.println("HR Manager is managing HR activities.");
    }
}

class Main {
    public static void main(String[] args) {
        Employee e = new Employee(50000);
        e.work();
        System.out.println("Employee Salary: " + e.getSalary());

        HRManager hr = new HRManager(70000);
        hr.work();
        System.out.println("HR Manager Salary: " + hr.getSalary());
    }
}
