// 1. You are developing a shape drawing application. There are different types of shapes such as circles, rectangles, and triangles. Each shape has its own area calculation method. Implement a Java program using polymorphism to calculate and display the area of different shapes.
abstract class Shape2 {
    public abstract double calculateArea();
}
class Circle extends Shape2{
    private final double radius;
    public Circle(int radius){
        this.radius = radius;
    }
    @Override
    public double calculateArea(){
        double area = (int) Math.PI*(radius*radius);
        return area;
    }
}
class Rectangle extends Shape2{
    private final double length;
    private final double width;
    public Rectangle(double length, double width){
        this.length= length;
        this.width = width;
    }
    @Override
    public double calculateArea(){
        double area = length*width;
        return area;
    }
}
class Triangle extends Shape2{
    private final double base;
    private final double height;
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    @Override
    public double calculateArea(){
        double area = 0.5*(base*height);
        return area;
    }
    public static void main(String[] args) {
        Circle c1 = new Circle(12);
        double circleArea = c1.calculateArea();
        System.out.println("circle area : "+circleArea);
        Rectangle r1 = new Rectangle(12, 45);
        double rectangleArea = r1.calculateArea();
        System.out.println("rectangle area: "+rectangleArea);
        Triangle t1 = new Triangle(12, 56);
        double triangleArea = t1.calculateArea();
        System.out.println("triangle area :"+triangleArea);
        
    }
}
