package classwork;
// Define a class Device with private fields brand and price. Provide appropriate getter and setter methods. Extend this class into a Smartphone class that adds fields like operatingSystem and cameraResolution. Demonstrate how encapsulation and inheritance work together in your design.

public class Device {
    private String brand;
    private double price;
    public Device(String brand, double price){
        this.brand = brand;
        this.price = price;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return this.brand;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return this.price;
    }
}
class Smartphone extends Device{
    private String operatingSystem;
    private double cameraResolution;
    public Smartphone(String brand,double price,String operatingSystem,double cameraResolution){
        this.operatingSystem = operatingSystem;
        this.cameraResolution = cameraResolution;
        super(brand,price);
    }
    public void smartphoneDetails(){
        System.out.println("Model: "+this.getBrand()+"\nPrice: $"+this.getPrice()+"\nOperatingSystem: "+this.operatingSystem+"\nCamera Resolution: "+this.cameraResolution);
    }
    public static void main(String[] args) {
        Smartphone phone1 = new Smartphone("Apple", 999, "iOS", 42);
        phone1.smartphoneDetails();
        
    }


}
