abstract class Shape2 {
    abstract void resize();
    abstract void rotate();
}

class Circle extends Shape2 {
    private final String name;

    public Circle(String name) {
        this.name = name;
    }

    @Override
    public void resize() {
        System.out.println("Resizing the circle: " + name);
    }

    @Override
    public void rotate() {
        System.out.println("Rotating the circle: " + name);
    }
}

class Square extends Shape2 {
    private final String name;

    public Square(String name) {
        this.name = name;
    }

    @Override
    public void resize() {
        System.out.println("Resizing the square: " + name);
    }

    @Override
    public void rotate() {
        System.out.println("Rotating the square: " + name);
    }
}

class Triangle extends Shape2 {
    private final String name;

    public Triangle(String name) {
        this.name = name;
    }

    @Override
    public void resize() {
        System.out.println("Resizing the triangle: " + name);
    }

    @Override
    public void rotate() {
        System.out.println("Rotating the triangle: " + name);
    }

    public static void main(String[] args) {
        Shape2 circle = new Circle("Circle A");
        Shape2 square = new Square("Square B");
        Shape2 triangle = new Triangle("Triangle C");

        circle.resize();
        circle.rotate();

        square.resize();
        square.rotate();

        triangle.resize();
        triangle.rotate();
    }
}
