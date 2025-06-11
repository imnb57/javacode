package Task;
// 5. You are building a shape hierarchy for a drawing application. Design an abstract class named "Draw" with the following abstract methods:
// calculateVolume(): This method should calculate and return the area of the shape
// calculateArea(): This method should calculate and return the area of the shape.
// calculatePerimeter(): This method should calculate and return the perimeter of the shape.
abstract class Draw {

    abstract void calculateVolume();
    abstract void calculateArea();
    abstract void calculatePerimeter();
    

   
}
class Cube extends Draw {
    private final int side;

    public Cube(int side) {
        this.side = side;
    }

    @Override
    void calculateVolume() {
        int volume = side * side * side;
        System.out.println("Cube Volume: " + volume);
    }

    @Override
    void calculateArea() {
        int area = 6 * (side * side);
        System.out.println("Cube Surface Area: " + area);
    }

    @Override
    void calculatePerimeter() {
        int perimeter = 12 * side;
        System.out.println("Cube Perimeter: " + perimeter);
    }
}
class Cuboid extends Draw {
    private final int length;
    private final int breadth;
    private final int height;

    public Cuboid(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    @Override
    void calculateVolume() {
        int volume = length * breadth * height;
        System.out.println("Cuboid Volume: " + volume);
    }

    @Override
    void calculateArea() {
        int area = 2 * (length * breadth + breadth * height + height * length);
        System.out.println("Cuboid Surface Area: " + area);
    }

    @Override
    void calculatePerimeter() {
        int perimeter = 4 * (length + breadth + height);
        System.out.println("Cuboid Perimeter: " + perimeter);
    }
}
class Cylinder extends Draw {
    private final double radius;
    private final double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    void calculateVolume() {
        double volume = Math.PI * radius * radius * height;
        System.out.printf("Cylinder Volume: %.2f\n", volume);
    }

    @Override
    void calculateArea() {
        double area = 2 * Math.PI * radius * (radius + height);
        System.out.printf("Cylinder Surface Area: %.2f\n", area);
    }

    @Override
    void calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.printf("Cylinder Perimeter (circumference of base): %.2f\n", perimeter);
    }
    public static void main(String[] args) {
        Cube cube = new Cube(5);
        cube.calculateArea();
        cube.calculatePerimeter();
        cube.calculateVolume();
        Cuboid cuboid = new Cuboid(4, 5, 6);
        cuboid.calculateArea();
        cuboid.calculatePerimeter();
        cuboid.calculateVolume();
        Cylinder cylinder = new Cylinder(3.5, 7);
        cylinder.calculateArea();
        cylinder.calculatePerimeter();
        cylinder.calculateVolume();
    }
}
