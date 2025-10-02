class ShapeArea {
    public int calculateArea(int side) { // square
        return side * side;
    }
    public int calculateArea(int length, int breadth) { // rectangle
        return length * breadth;
    }
    public double calculateArea(double radius) { // circle
        return Math.PI * radius * radius;
    }
}

public class Assignment15_ShapeAreaOverloaded {
    public static void main(String[] args) {
        ShapeArea s = new ShapeArea();
        System.out.println("Square Area = " + s.calculateArea(5));
        System.out.println("Rectangle Area = " + s.calculateArea(4, 6));
        System.out.printf("Circle Area = %.2f%n", s.calculateArea(3.0));
    }
}
