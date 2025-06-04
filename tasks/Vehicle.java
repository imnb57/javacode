package tasks;
// . Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car with method display() method to print details of the Car.
public class Vehicle {
    private String model;
    private double price;

    public Vehicle(String model, double price){
        this.model=model;
        this.price=price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return this.price;
    }
    public void setModel(String model){
        this.model=model;
    }
    public String getModel(){
        return this.model;
    }
    public void drive(){

    }
}
class Car extends Vehicle{
    public Car(String model,double price){
        super(model,price);
    }
    public void display(){
        System.out.println("Car details:\nModel: "+this.getModel()+"\nPrice: "+this.getPrice());

    }
    public static void main(String[] args) {
        Car Audi = new Car("Audi rs6", 1000000);
        Audi.display();
    }
}
