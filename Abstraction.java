abstract class Furniture{
    // cannot create object, cannot be instantiated.
    public Furniture(){
        System.out.println("Furniture called");
    }
    void greet(){
        System.out.println("hello");
    }
    abstract void printName();

    
}
class Closet extends Furniture{
    public Closet(){
        System.out.println("constructor in a closet");
    }

    @Override
    void printName() {
        // TODO Auto-generated method stub
        
    }

}
interface Furniture1{
    // final attribute
    // abstract methods - all methods are abstract by default so no need for abstrac keyword
    // interface ma constructor hudaina 
    void printLength();

}
interface Box extends Furniture1{
    void printVolume();
}

class MyCloset implements Box{

    @Override
    public void printLength() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printLength'");
    }

    @Override
    public void printVolume() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printVolume'");
    }

}

public class Abstraction{
    public static void main(String[] args) {
        Closet closet = new Closet();
        closet.greet();
        closet.printName();
    }
}
