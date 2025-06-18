
abstract class Vehicle {
    protected String name;

    public Vehicle(String name) {
        this.name = name;
    }
    public abstract double calculateRent(int days);

    public String getName() {
        return name;
    }
}

class Car extends Vehicle {
    private static final double rate = 50.0;

    public Car(String name) {
        super(name);
    }

    @Override
    public double calculateRent(int days) {
        return days * rate;
    }
}

class Motorcycle extends Vehicle {
    private static final double rate = 30.0;

    public Motorcycle(String name) {
        super(name);
    }

    @Override
    public double calculateRent(int days) {
        return days * rate;
    }
}
class Bicycle extends Vehicle {
    private static final double rate = 10.0;

    public Bicycle(String name) {
        super(name);
    }

    @Override
    public double calculateRent(int days) {
        return days * rate;
    }

    public static void main(String[] args) {
        Car v1 = new Car("honda");
        double rent = v1.calculateRent(23);
        System.out.println("The rent is : "+rent);
        Motorcycle m1 = new Motorcycle("Bullet");
        double brent = m1.calculateRent(34);
        System.out.println("the rent is : "+brent);
        Bicycle b1 = new Bicycle("Atlas");
        double crent = b1.calculateRent(12);
        System.out.println("the rent is : "+crent);

    }

}



