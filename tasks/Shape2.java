package tasks;
//  Implement a class hierarchy for various shapes. Create a base class 'Shape' with a method 'calculateArea()'. Derive two classes 'Rectangle' and 'Circle' from 'Shape'. Add additional methods 'calculatePerimeter()' in 'Rectangle' and 'calculateCircumference()' in 'Circle'. Write a Java program to demonstrate hierarchical inheritance and compute the area and perimeter/circumference for a rectangle and a circle object.
public class Shape2 {
    public void calculateArea() {
        System.out.println("Calculating area of shape.");
    }
}

class Rectangle extends Shape2 {
    private int length;
    private int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void calculateArea() {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    public void calculatePerimeter() {
        int perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}

class Circle extends Shape2 {
    private int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    public void calculateCircumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of Circle: " + circumference);
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();

        System.out.println();

        Circle circle = new Circle(3);
        circle.calculateArea();
        circle.calculateCircumference();
    }
}


    

