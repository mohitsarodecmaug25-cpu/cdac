abstract class Shape {
abstract class Shape {
    abstract double area();
}

class Rectangle extends Shape {
    private double length, breadth;
    public Rectangle(double l, double b) { length = l; breadth = b; }
    @Override double area() { return length * breadth; }
}

class Circle extends Shape {
    private double radius;
    public Circle(double r) { radius = r; }
    @Override double area() { return Math.PI * radius * radius; }
}

public class ShapeArea {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        Circle cir = new Circle(7);
        System.out.println("Rectangle Area = " + (int)rect.area());
        System.out.printf("Circle Area = %.2f%n", cir.area());
    }
}
