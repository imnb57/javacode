package Task;
// 2. Create an abstract class called Shape with an abstract method called calculateArea(). Implement two subclasses called Rectangle and Circle that inherit from Shape. Override the calculateArea() method in both subclasses to calculate and return the area of a rectangle and a circle, respectively. Write the Java code to implement this scenario with Scanner Input.

import java.util.Scanner;

abstract class Shape {

    abstract void calculateArea();

}
class Rectangle extends Shape{
    private final int length;
    private final int breadth;
    public Rectangle(int length , int breadth){
        this.length = length;
        this.breadth = breadth;

    }
    @Override
    void calculateArea(){
        int area = length*breadth;
        System.out.println("The area of rectangle of length "+length+" and breadth "+breadth+" is : "+area+" square meters\n");

    }

}
class Circle extends Shape{
    private final int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    @Override
    void calculateArea(){
        int area = (int) (Math.PI*(radius*radius));
        System.out.println("The area of circle of radius "+radius+" is : "+area+" square meters\n");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of rectangle:\n");
        int rlength = sc.nextInt();
        System.out.println("Please enter the breadth of rectangle:\n");
        int rbreadth = sc.nextInt();
        Rectangle r1 = new Rectangle(rlength,rbreadth);
        r1.calculateArea();
        System.out.println("Please enter the radius of the circle:\n");
        int radius = sc.nextInt();
        Circle c1 = new Circle(radius);
        c1.calculateArea();
        System.out.println("Thank you for your patience");
        sc.close();

    }

}

