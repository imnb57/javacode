package Task;
// 3. Create an abstract class called Vehicle with abstract methods startEngine() and stopEngine(). Implement two subclasses called Car and Motorcycle that inherit from Vehicle. Implement the startEngine() and stopEngine() methods in both subclasses to start and stop the engines of a car and a motorcycle, respectively. 


abstract class Vehicle {
    abstract void startEngine();
    abstract void stopEngine();
}
class Car extends Vehicle{
   
    @Override
    void startEngine(){
        System.out.println("Engine please start");
    }
    @Override
    void stopEngine(){
        System.out.println("Engine please stop");
    }
}
class Motorcycle extends Vehicle{
    @Override
    void startEngine(){
        System.out.println("Engine please start");
    }
    @Override
    void stopEngine(){
        System.out.println("Engine please stop");
    }
}