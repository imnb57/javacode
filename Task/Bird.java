package Task;
// 1. Create an abstract class called Bird with an abstract method called fly(). Implement two subclasses called Eagle and Penguin that inherit from Bird. Override the fly() method in both subclasses, ensuring Eagle can fly while Penguin cannot. Implement the Java code for this scenario.


abstract class Bird {
    
    abstract void fly();
    
}
class Eagle extends Bird{
    @Override
    void fly(){
        System.out.println("Eagle is high in the sky");
    }
}
class Penguin extends Bird{
    @Override
    void fly(){
        System.out.println("Penguin no fly , sorry Penguin");
    }
}
