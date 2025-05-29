// 4. Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.

public class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void updateSalary(double amount) {
        this.salary += amount;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Job Title: " + jobTitle + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Alice", "Developer", 50000);
        emp.updateSalary(5000);
        emp.displayInfo();
    }
}

