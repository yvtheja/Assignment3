import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CompositeRectangle extends Shapes {

    private List<Shapes> shapesList;
    private Point p1, p2;
    private Graphics g;

    public CompositeRectangle(Graphics g, Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.shapesList = new ArrayList<>();
        this.g = g;

    }

    @Override
    public void display() {
        System.out.println("Draw a composite rectangle");
        System.out.println("Rectangle Coordinates: (" + p1.x + ", " + p1.y + "), " + "(" + p2.x + ", " + p2.y + ")");
        g.drawRect(p1.x, p1.y, Math.abs(p1.x - p2.x), Math.abs(p1.y - p2.y));
        shapesList.forEach(Shapes::display);
    }


    public void addShape(Shapes shape) {
        shapesList.add(shape);
    }

    public void removeShape(Shapes shape) {
        shapesList.remove(shape);
    }
}
