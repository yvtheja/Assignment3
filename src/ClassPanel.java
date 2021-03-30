import javax.swing.*;
import java.awt.*;

public class ClassPanel extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        int[] ifPresent = new int[]{1, 0, 1, 0};
        int[] loopPresent = new int[]{1, 1, 0, 0};
        Point p1 = new Point(20, 20);
        ClassRectangle classA = new ClassRectangle(p1, 4, ifPresent, loopPresent, "Class A");
        classA.drawClassRectangle(g);

        int[] ifPresent2 = new int[]{1, 1, 1, 0, 0};
        int[] loopPresent2 = new int[]{1, 1, 0, 1, 0};
        Point p2 = new Point(300, 20);
        ClassRectangle classB = new ClassRectangle(p2, 5, ifPresent2, loopPresent2, "Class B");
        classB.drawClassRectangle(g);

//        int[] ifPresent3 = new int[]{1, 1, 1};
//        int[] loopPresent3 = new int[]{1, 1, 0};
//        Point p3 = new Point(580, 20);
//        ClassRectangle classC = new ClassRectangle(p2, 3, ifPresent3, loopPresent3);
//        classC.drawClassRectangle(g);

        Point end = new Point(190, 60);
        Point start = new Point(300, 30);
        ClassEdges edge = new ClassEdges(start, end, 1);
        edge.drawEdges(g);

        Point start2 = new Point(190, 100);
        Point end2 = new Point(300, 100);
        ClassEdges edge2 = new ClassEdges(start2, end2, 1);
        edge2.drawEdges(g);

        Point start3 = new Point(190, 150);
        Point end3 = new Point(300, 200);
        ClassEdges edge3 = new ClassEdges(start3, end3, 1);
        edge3.drawEdges(g);

        Point start4 = new Point(190, 270);
        Point end4 = new Point(300, 220);
        ClassEdges edge4 = new ClassEdges(start4, end4, 0);
        edge4.drawEdges(g);

        Point start5 = new Point(190, 290);
        Point end5 = new Point(300, 290);
        ClassEdges edge5 = new ClassEdges(start5, end5, 0);
        edge5.drawEdges(g);

//        Point start6 = new Point(190, 300);
//        Point end6 = new Point(300, 340);
//        ClassEdges edge6 = new ClassEdges(start6, end6, 0);
//        edge6.drawEdges(g);

        Point end6 = new Point(190, 300);
        Point start6 = new Point(300, 340);
        ClassEdges edge6 = new ClassEdges(start6, end6, 1);
        edge6.drawEdges(g);

    }
    public static void main(String[] args) {

        JFrame frame = new JFrame("Class Rectangle");
        JPanel panel = new ClassPanel();
        frame.add(panel);
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
