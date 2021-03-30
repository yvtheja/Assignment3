import javax.swing.*;
import java.awt.*;
import java.security.cert.PolicyNode;

public class DiagramPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Point p1 = new Point(40, 60);
        Point p2 = new Point(150, 120);
        double r = 1.23;
        int outerRectX1 = 10, outerRectY1 = 20, outerRectX2 = 180, outerRectY2 = 230;
        Point p3 = new Point(outerRectX1, outerRectY1);
        Point p4 = new Point(outerRectX2, outerRectY2);

        CompositeRectangle rectangle = new CompositeRectangle(g, p1, p2);

        Point pc = new Point(p1.x + 20, p1.y + 15);
        Shapes circle = new Circle(g, pc);

        CompositeRectangle compRectangle = new CompositeRectangle(g, p3, p4);


        compRectangle.addShape(circle);

        rectangle.addShape(compRectangle);


        // Rectangle 2

        double r2 = 1.23;
        int dist = 110;



        int outerRectX3 = outerRectX1 + outerRectX2 + dist;
        int outerRectY3 = outerRectY1;
        int outerRectX4 = outerRectX1 + outerRectX2 + dist + Math.abs(outerRectX2 - outerRectX1);
        int outerRectY4 = outerRectY2;
        Point p7 = new Point(outerRectX3, outerRectY3);
        Point p8 = new Point(outerRectX4, outerRectY4);

        Point p5 = new Point(outerRectX3 + 30, outerRectY3 + 40);
        Point p6 = new Point(outerRectX4 - 30, outerRectY3 + 40 + Math.abs(p2.y - p1.y));

        Point pc2 = new Point(p5.x + 20, p5.y + 15);
        Shapes circle2 = new Circle(g, pc2);

        Point pt1 = new Point(p6.x - 30, p5.y + 15);
        Point pt2 = new Point(p6.x - 45, p6.y - 15);
        Point pt3 = new Point(p6.x - 15, p6.y - 15);
        Shapes tr = new Triangle(g, pt1, pt2, pt3);

        CompositeRectangle rectangle2 = new CompositeRectangle(g, p5, p6);

        CompositeRectangle compRectangle2 = new CompositeRectangle(g, p7, p8);
        compRectangle2.addShape(circle2);
        compRectangle2.addShape(tr);

        rectangle2.addShape(compRectangle2);

        rectangle2.display();

//         Diamond Symbol
        Point pe1 = new Point(p4.x, p3.y + Math.abs(p4.y - p3.y) / 2);
        Point pe2 = new Point(p7.x, p7.y + Math.abs(p8.y - p7.y) / 2);
        Shapes edge = new Edge(g, pe1, pe2);


//         Association
//        Point pe3 = new Point(p4.x, p3.y + Math.abs(p4.y - p3.y) / 2);
//        Point pe4 = new Point(p7.x, p7.y + Math.abs(p8.y - p7.y) / 2);
//        Shapes edge = new Edge(g, pe3, pe4);

        rectangle.addShape(edge);
        rectangle.display();



    }
}
