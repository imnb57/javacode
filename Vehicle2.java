// Design a class hierarchy for different types of vehicles. Create a base class 'Vehicle' with methods 'startEngine()' and 'stopEngine()'. Derive two classes 'Car' and 'Motorcycle' from 'Vehicle'. Add methods 'drive()' in 'Car' and 'ride()' in 'Motorcycle'. Write a Java program to demonstrate hierarchical inheritance and invoke the relevant methods for a car and a motorcycle object.
public class Vehicle2 {

    public void startEngine() {
        System.out.println("Engine started.");
    }

    public void stopEngine() {
        System.out.println("Engine stopped.");
    }
}

class Car extends Vehicle2 {
    public void drive() {
        System.out.println("Car is driving.");
    }
}

class Motorcycle extends Vehicle2 {
    public void ride() {
        System.out.println("Motorcycle is riding.");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.drive();
        car.stopEngine();
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.startEngine();
        motorcycle.ride();
        motorcycle.stopEngine();
    }
}
