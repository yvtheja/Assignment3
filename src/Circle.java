import java.awt.*;

public class Circle extends Shapes {

    private Point p;
    private Graphics g;

    public Circle(Graphics g, Point p) {
        this.p = p;
        this.g = g;
    }
    @Override
    public void display() {
        System.out.println("Draw a circle");
        int r = 30;
        g.fillOval(p.x, p.y, r, r);
    }
}
