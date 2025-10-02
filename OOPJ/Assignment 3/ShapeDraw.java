abstract class ShapeDraw {
    abstract void draw();
}

class CircleDraw extends ShapeDraw {
    private int radius;
    public CircleDraw(int radius) { this.radius = radius; }
    @Override void draw() { System.out.println("Drawing Circle of radius " + radius); }
}

class RectangleDraw extends ShapeDraw {
    private int length, breadth;
    public RectangleDraw(int l, int b) { this.length = l; this.breadth = b; }
    @Override void draw() { System.out.println("Drawing Rectangle of length " + length + " and breadth " + breadth); }
}

public class Assignment13_ShapeDrawing {
    public static void main(String[] args) {
        CircleDraw c = new CircleDraw(7);
        RectangleDraw r = new RectangleDraw(5, 10);
        c.draw();
        r.draw();
    }
}
