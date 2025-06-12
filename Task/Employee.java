package Task;
// 7. You are developing a restaurant management system that handles different types of employees, such as chefs and waiters. Design an interface named "Employee" with the following methods:
// work(): This method should define the work responsibilities of the employee.
// getSalary(): This method should return the salary of the employee.

interface Employee {
    double getSalary();
    void work();
}

 class Chef implements Employee {
    private double salary;

    public Chef(double salary) {
        this.salary = salary;
    }

    @Override
    public void work() {
        System.out.println("The chef is preparing meals.");
    }

    @Override
    public double getSalary() {
        return salary;
    }
}


 class Waiter implements Employee {
    private double salary;

    public Waiter(double salary) {
        this.salary = salary;
    }

    @Override
    public void work() {
        System.out.println("The waiter is serving customers.");
    }

    @Override
    public double getSalary() {
        return salary;
    }
    public static void main(String[] args) {
        Employee chef = new Chef(50000);
        Employee waiter = new Waiter(30000);

        chef.work();
        System.out.println("Chef's salary: $" + chef.getSalary());

        waiter.work();
        System.out.println("Waiter's salary: $" + waiter.getSalary());
    }
}

