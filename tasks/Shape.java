package tasks;
// 3. Imagine that you are building a geometry calculator program. You need to implement the calculation of areas for different shapes, including rectangles, squares, and circles. To achieve this, you decide to use a multilevel inheritance hierarchy.
public class Shape {
    int length;
    int breadth;
    int radius;

    Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    Shape(int radius) {
        this.radius = radius;
    }
}

class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    void calculateArea() {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Square extends Rectangle {
    Square(int side) {
        super(side, side);
    }

    void calculateArea() {
        int area = length * length;
        System.out.println("Area of Square: " + area);
    }
}

class Circle extends Shape {
    Circle(int radius) {
        super(radius);
    }

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4);
        rectangle.calculateArea();

        Square square = new Square(5);
        square.calculateArea();

        Circle circle = new Circle(3);
        circle.calculateArea();
    }
}
