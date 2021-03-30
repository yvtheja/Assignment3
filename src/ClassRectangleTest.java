import javax.swing.*;
import java.awt.*;

public class ClassRectangleTest extends JPanel {

    private Point p;
    private int numberOfMethods;
    private int[] ifPresent;
    private int[] loopPresent;
    private String name;
    private Color color;

    public ClassRectangleTest(Point p, int numberOfMethods, int[] ifPresent, int[] loopPresent, String name, Color color) {
        System.out.println("Constructor in ClassRectangleTest " + name);
        this.p = p;
        this.ifPresent = ifPresent;
        this.loopPresent = loopPresent;
        this.numberOfMethods = numberOfMethods;
        this.name = name;
        this.color = color;
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        int panelWidth = getWidth();
        int panelHeight = getHeight();

        System.out.println("Panel Height of class " + name + " : "  + panelHeight);
        System.out.println("Panel Width of class " + name + " : "  + panelWidth);

        int classRectHeight = (int) (0.8 * panelHeight);
        int classRectWidth = (int) (0.6 * panelWidth);

        int methodClassTopPadding = (int) (0.15 * classRectHeight);
        int methodClassLeftPadding = (int) (0.1 * classRectWidth);
        int methodClassRightPadding = (int) (0.1 * classRectWidth);

        int methodHeightPlusMethodMethodPadding = numberOfMethods > 0
                ? (int) ((0.85 * classRectHeight) / numberOfMethods)
                : 0;
        int methodMethodPadding = (int) (0.2 * methodHeightPlusMethodMethodPadding);
        int methodHeight = (int) (0.8 * methodHeightPlusMethodMethodPadding);

        int methodWidth = classRectWidth - methodClassLeftPadding - methodClassRightPadding;

        int methodLoopTopPadding = (int) (0.3 * methodHeight);
        int methodLoopLeftPadding = (int) (0.05 * methodWidth);
        int loopRadius = methodHeight > methodWidth ? (int) (0.45 * methodWidth) : (int) (0.45 * methodHeight);

        int methodIfTopPadding = (int) (0.3 * methodHeight);
        int methodIfBottomPadding = (int) (0.3 * methodHeight);
        int methodIfRightPadding = methodHeight > methodWidth ? (int) (0.3 * methodWidth) : (int) (0.18 * methodWidth);
        int methodIfBaseRightPadding = (int) (0.05 * methodWidth);
        int ifBaseLength = methodHeight > methodWidth ? (int) (0.45 * methodWidth) : (int) (0.25 * methodWidth);

        int classNameLeftPadding = (int) (0.25 * methodClassTopPadding);
        int classNameTopPadding = (int) (0.6 * methodClassTopPadding);
        int fontSize = (int) (0.3 * methodClassTopPadding);


//        int classRectHeight = methodClassTopPadding
//                + (methodHeight * numberOfMethods)
//                + (methodMethodPadding * numberOfMethods)
//                + methodClassBottomPadding;

        // Class Rectangle
        g.setColor(color);
        g.fillRect(0,0, panelWidth, panelHeight);
        g.setColor(new Color(171, 196, 247));
        g.fillRect(p.x, p.y, classRectWidth, classRectHeight);
        g.setColor(Color.black);
        g.setFont(new Font("Courier New", Font.PLAIN, fontSize));
        g.drawString(name, p.x + classNameLeftPadding, p.y + classNameTopPadding);
//
//
        for (int i = 0; i < numberOfMethods; i++) {

            // Method Rectangles
            g.setColor(new Color(233, 237, 245));
            g.fillRect(p.x + methodClassLeftPadding,
                    p.y + methodClassTopPadding + (i * (methodHeight + methodMethodPadding)),
                    methodWidth, methodHeight);
//
//            // If Triangles
            if (ifPresent[i] == 1) {
                int x1 = p.x + methodClassLeftPadding + methodWidth - methodIfRightPadding;
                int y1 = p.y + methodClassTopPadding + methodIfTopPadding;
                int x2 = p.x + methodClassLeftPadding + methodWidth - methodIfBaseRightPadding - ifBaseLength;
                int y2 = p.y + methodClassTopPadding + methodHeight - methodIfBottomPadding;
                int x3 = p.x + methodClassLeftPadding + methodWidth - methodIfBaseRightPadding;
                int y3 = p.y + methodClassTopPadding + methodHeight - methodIfBottomPadding;

                g.setColor(new Color(83, 163, 59));
                g.fillPolygon(new int[] {x1, x2, x3}, new int[] {y1 + (i * (methodMethodPadding + methodHeight)) ,
                        y2 + (i * (methodMethodPadding + methodHeight)) ,
                        y3 + (i * (methodMethodPadding + methodHeight))}, 3);
            }
//
            // Loop Circles
            if (loopPresent[i] == 1) {
                g.setColor(new Color(247, 196, 54));
                g.fillOval(p.x + methodClassLeftPadding + methodLoopLeftPadding,
                        p.y + methodClassTopPadding + (i * (methodMethodPadding + methodHeight)) + methodLoopTopPadding,
                        loopRadius, loopRadius);
            }
        }
        System.out.println("*********************************");

//        Point start = new Point(308, 60);
//        Point end = new Point(700, 30);
//        ClassEdgesTest edge = new ClassEdgesTest(start, end, 1);
//        edge.drawEdges(g);
    }

    public void drawRectangle(Graphics g) {
        System.out.println("I am being called");
//        int classRectWidth = 170;
//        int methodClassTopPadding = 50;
//        int methodClassLeftPadding = 10;
//        int methodClassRightPadding = 10;
//        int methodClassBottomPadding = 10;
//        int methodMethodPadding = 10;
//        int methodHeight = 60;
//        int methodWidth = classRectWidth - methodClassLeftPadding - methodClassRightPadding;
//
//        int methodLoopTopPadding = 15;
//        int methodLoopLeftPadding = 20;
//        int loopRadius = 30;
//
//        int methodIfTopPadding = 15;
//        int methodIfBottomPadding = 15;
//        int methodIfRightPadding = 30;
//        int methodIfBaseRightPadding = 15;
//        int ifBaseLength = 30;
//
//        int classNameLeftPadding = 15;
//        int classNameTopPadding = 30;
//        int fontSize = 18;
//
//
//        int classRectHeight = methodClassTopPadding
//                + (methodHeight * numberOfMethods)
//                + (methodMethodPadding * numberOfMethods)
//                + methodClassBottomPadding;
//
//        // Class Rectangle
//        g.setColor(new Color(171, 196, 247));
//        g.fillRect(p.x, p.y, classRectWidth, classRectHeight);
//        g.setColor(Color.black);
//        g.setFont(new Font("Courier New", Font.PLAIN, fontSize));
//        g.drawString(name, p.x + classNameLeftPadding, p.y + classNameTopPadding);
//
//
//        for (int i = 0; i < numberOfMethods; i++) {
//
//            // Method Rectangles
//            g.setColor(new Color(233, 237, 245));
//            g.fillRect(p.x + methodClassLeftPadding,
//                    p.y + methodClassTopPadding + (i * (methodHeight + methodMethodPadding)),
//                    methodWidth, methodHeight);
//
//            // If Triangles
//            if (ifPresent[i] == 1) {
//                int x1 = p.x + methodClassLeftPadding + methodWidth - methodIfRightPadding;
//                int y1 = p.y + methodClassTopPadding + methodIfTopPadding;
//                int x2 = p.x + methodClassLeftPadding + methodWidth - methodIfBaseRightPadding - ifBaseLength;
//                int y2 = p.y + methodClassTopPadding + methodHeight - methodIfBottomPadding;
//                int x3 = p.x + methodClassLeftPadding + methodWidth - methodIfBaseRightPadding;
//                int y3 = p.y + methodClassTopPadding + methodHeight - methodIfBottomPadding;
//
//                g.setColor(new Color(83, 163, 59));
//                g.fillPolygon(new int[] {x1, x2, x3}, new int[] {y1 + (i * (methodMethodPadding + methodHeight)) ,
//                        y2 + (i * (methodMethodPadding + methodHeight)) ,
//                        y3 + (i * (methodMethodPadding + methodHeight))}, 3);
//            }
//
//            // Loop Circles
//            if (loopPresent[i] == 1) {
//                g.setColor(new Color(247, 196, 54));
//                g.fillOval(p.x + methodClassLeftPadding + methodLoopLeftPadding,
//                        p.y + methodClassTopPadding + (i * (methodMethodPadding + methodHeight)) + methodLoopTopPadding,
//                        loopRadius, loopRadius);
//            }
//        }
    }
}
