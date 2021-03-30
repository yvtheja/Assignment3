import java.awt.*;

public class Edge extends Shapes{

    private Point p1, p2;
    private Graphics g;

    public Edge(Graphics g, Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.g = g;
    }
    @Override
    public void display() {

        // AGGREGATION

        // diamond
        // p1 = (x1, y1)
        // p2 = (x1 + 10, y1 - 10)
        // p3 = (x1 + 20, y1)
        // p4 = (x1 + 10, y1 + 10)
        g.drawLine(p1.x, p1.y, p1.x + 10, p1.y - 10);
        g.drawLine(p1.x + 10, p1.y - 10, p1.x + 20, p1.y);
        g.drawLine(p1.x + 20, p1.y, p1.x + 10, p1.y + 10);
        g.drawLine(p1.x + 10, p1.y + 10, p1.x, p1.y);

        // line
        g.drawLine(p1.x + 20, p1.y, p2.x, p2.y);

        // Arrow Head
        g.drawLine(p2.x, p2.y, p2.x -10, p1.y - 10);
        g.drawLine(p2.x, p2.y, p2.x -10, p1.y + 10);

        // ASSOCIATION
//        g.drawLine(p1.x , p1.y, p2.x, p2.y);
//        g.drawLine(p2.x, p2.y, p2.x -10, p1.y - 10);
//        g.drawLine(p2.x, p2.y, p2.x -10, p1.y + 10);

    }
}
