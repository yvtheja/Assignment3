import java.awt.*;

public class Triangle extends Shapes {

    private Point p1, p2, p3;
    private Graphics g;

    public Triangle(Graphics g, Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.g = g;
    }
    @Override
    public void display() {
        System.out.println("Draw a triangle");
        System.out.println("Triangle Coordinates: (" + p1.x + ", " + p1.y + "), (" + p2.x + ", " + p2.y + "), (" + p3.x + ", " + p3.y + ")");
        g.fillPolygon(new int[] {p1.x, p2.x, p3.x}, new int[] {p1.y, p2.y, p3.y}, 3);
    }
}
