// 5. You are building an employee management system and need to create an Employee  class. The Employee class should have private instance variables for the employee name, employee ID, and salary. Implement getter and setter methods for the name and ID, but ensure that the salary can only be updated through a specific method that increases or decreases the amount while preventing negative values.

public class Employee {
    private String name;
    private String id;
    private double salary;

    public void setName(String name) { this.name = name; }
    public void setId(String id) { this.id = id; }

    public void updateSalary(double change) {
        if (salary + change >= 0) salary += change;
    }

    public double getSalary() {
        return salary;
    }
}
