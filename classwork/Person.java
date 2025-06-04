package classwork;
// Create a class Person with private fields name and address. Provide public methods to access and update the fields. Create a subclass Employee with an additional private field employeeId and a method displayEmployeeDetails(). Demonstrate encapsulation and inheritance.

public class Person {
    private String name;
    private String address;

    public Person(String name, String address){
        this.name = name;
        this.address = address;

    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return this.address;
    }

}
class Employee extends Person{
    private int employeeId;
    public Employee(String name, String address,int employeeId){
        this.employeeId = employeeId;
        super(name,address);
    }
    public void displayEmployeeDetails(){
        
        System.out.println("The details of employee are: \nemployeeId: "+this.employeeId+"\nName: "+this.getName()+"\nAddress: "+this.getAddress());
    }
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice Smith", "Kathmandu",1);
        e1.displayEmployeeDetails();
    }

}
