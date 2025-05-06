// 3. Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.
public class q3 {
    static void triangle(int length, int width){
        int area = 1/2*(length*width);
        System.out.println("The area of triangle is "+area+"square meters");
    }
    static void cube(int side){
        int volume = side*side*side;
        System.out.println("The volume of cube is "+volume+"cubic meters");
    }
    static void cuboid(int length, int width, int height){
        int cuboid = length*width*height;
        System.out.println("The volume of cuboid is "+cuboid+" cubic meters");
    }
    public static void main(String[] args) {
        triangle(12, 23);
        cube(20);
        cuboid(12, 21, 23);
    }
}
