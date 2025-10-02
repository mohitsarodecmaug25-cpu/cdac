interface ShapeInterface { double calculateArea(); }

class Circle27 implements ShapeInterface {
    private double radius;
    public Circle27(double radius) { this.radius = radius; }
    public double calculateArea() { return Math.PI * radius * radius; }
}

class Rectangle27 implements ShapeInterface {
    private double length, breadth;
    public Rectangle27(double length, double breadth) { this.length = length; this.breadth = breadth; }
    public double calculateArea() { return length * breadth; }
}

class Square27 implements ShapeInterface {
    private double side;
    public Square27(double side) { this.side = side; }
    public double calculateArea() { return side * side; }
}

public class ShapeCalculator {
    public static void main(String[] args) {
        Circle27 c = new Circle27(5);
        Rectangle27 r = new Rectangle27(10, 5);
        Square27 s = new Square27(4);
        System.out.printf("Circle Area = %.1f%n", c.calculateArea());
        System.out.println("Rectangle Area = " + (int)r.calculateArea());
        System.out.println("Square Area = " + (int)s.calculateArea());
    }
}
