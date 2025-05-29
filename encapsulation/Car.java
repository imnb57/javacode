// 6. You are designing a car rental system, and you need to create a Car class. The Car class should have private instance variables for the car's make, model, and rental price per day. Implement appropriate getter and setter methods for these variables, ensuring that the make and model can only be set once during object creation. Additionally, include a private variable to track the availability of the car (e.g., true if available for rent, false if rented), and provide public methods to rent and return the car, updating its availability status.

public class Car {
    private final String make;
    private final String model;
    private double rentalPricePerDay;
    private boolean isAvailable = true;

    public Car(String make, String model, double rentalPricePerDay) {
        this.make = make;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public String getMake() { return make; }
    public String getModel() { return model; }

    public void setRentalPricePerDay(double price) {
        if (price > 0) rentalPricePerDay = price;
    }

    public void rent() {
        if (isAvailable) isAvailable = false;
    }

    public void returnCar() {
        if (!isAvailable) isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}

