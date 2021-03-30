import javax.swing.*;
import java.awt.*;

public class ClassRectangle {

    private Point p;
    private int numberOfMethods;
    private int[] ifPresent;
    private int[] loopPresent;
    private String name;

    public ClassRectangle(Point p, int numberOfMethods, int[] ifPresent, int[] loopPresent, String name ) {
        this.p = p;
        this.ifPresent = ifPresent;
        this.loopPresent = loopPresent;
        this.numberOfMethods = numberOfMethods;
        this.name = name;
    }

    public void drawClassRectangle(Graphics g) {

        int classRectWidth = 170;
        int methodClassTopPadding = 50;
        int methodClassLeftPadding = 10;
        int methodClassRightPadding = 10;
        int methodClassBottomPadding = 10;
        int methodMethodPadding = 10;
        int methodHeight = 60;
        int methodWidth = classRectWidth - methodClassLeftPadding - methodClassRightPadding;

        int methodLoopTopPadding = 15;
        int methodLoopLeftPadding = 20;
        int loopRadius = 30;

        int methodIfTopPadding = 15;
        int methodIfBottomPadding = 15;
        int methodIfRightPadding = 30;
        int methodIfBaseRightPadding = 15;
        int ifBaseLength = 30;

        int classNameLeftPadding = 15;
        int classNameTopPadding = 30;
        int fontSize = 18;


        int classRectHeight = methodClassTopPadding
                + (methodHeight * numberOfMethods)
                + (methodMethodPadding * numberOfMethods)
                + methodClassBottomPadding;

        // Class Rectangle
        g.setColor(new Color(171, 196, 247));
        g.fillRect(p.x, p.y, classRectWidth, classRectHeight);
        g.setColor(Color.black);
        g.setFont(new Font("Courier New", Font.PLAIN, fontSize));
        g.drawString(name, p.x + classNameLeftPadding, p.y + classNameTopPadding);


        for (int i = 0; i < numberOfMethods; i++) {

            // Method Rectangles
            g.setColor(new Color(233, 237, 245));
            g.fillRect(p.x + methodClassLeftPadding,
                    p.y + methodClassTopPadding + (i * (methodHeight + methodMethodPadding)),
                    methodWidth, methodHeight);

            // If Triangles
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

            // Loop Circles
            if (loopPresent[i] == 1) {
                g.setColor(new Color(247, 196, 54));
                g.fillOval(p.x + methodClassLeftPadding + methodLoopLeftPadding,
                        p.y + methodClassTopPadding + (i * (methodMethodPadding + methodHeight)) + methodLoopTopPadding,
                        loopRadius, loopRadius);
            }
        }
    }
}
