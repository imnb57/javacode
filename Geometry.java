class Geometry {

    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double calculateArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        Geometry geo = new Geometry();

        double circleArea = geo.calculateArea(7);
        double rectangleArea = geo.calculateArea(5, 10);

        System.out.println("Area of the circle: " + circleArea);
        System.out.println("Area of the rectangle: " + rectangleArea);
    }
}
