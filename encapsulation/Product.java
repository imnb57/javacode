// 1. You are developing an e-commerce application and need to implement a Product class. The Product class should have private instance variables for the product name, product ID, and price. Implement getter and setter methods for these variables, ensuring that the price cannot be negative. Additionally, include a private variable to track the stock quantity and provide public methods to update the stock when a product is purchased or restocked.


public class Product {
    private String name;
    private String productId;
    private double price;
    private int stock;

    public void setName(String name) { this.name = name; }
    public void setProductId(String productId) { this.productId = productId; }

    public void setPrice(double price) {
        if (price >= 0) this.price = price;
    }

    public double getPrice() { return price; }

    public void restock(int quantity) {
        if (quantity > 0) stock += quantity;
    }

    public void purchase(int quantity) {
        if (quantity > 0 && stock >= quantity) stock -= quantity;
    }

    public int getStock() { return stock; }
}
