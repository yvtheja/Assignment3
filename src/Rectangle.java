import java.awt.*;

public class Rectangle extends Shapes {

    private Point p1, p2;
    private Graphics g;

    public Rectangle(Graphics g, Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.g = g;
    }

    @Override
    public void display() {
        System.out.println("Draw a rectangle");
        System.out.println("Rectangle Coordinates: (" + p1.x + ", " + p1.y + "), " + "(" + p2.x + ", " + p2.y + ")");
        g.drawRect(p1.x, p1.y, Math.abs(p1.x - p2.x), Math.abs(p1.y - p2.y));
    }
}
