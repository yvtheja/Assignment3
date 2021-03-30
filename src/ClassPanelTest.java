import javax.swing.*;
import java.awt.*;
import java.time.zone.ZoneRules;
import java.util.List;

public class ClassPanelTest extends JPanel {

    private List<ClassNode> nodes;
    public ClassPanelTest (List<ClassNode> nodes) {
        this.nodes = nodes;
        int nodesSize = nodes.size();


        int m = nodesSize % 2 == 0 ? nodesSize / 2 : (nodesSize / 2 + 1);
        int size = nodesSize == 1 ? 1 : m;
        System.out.println(size);
        System.out.println("Layout size  = ( " + size + ", " + 2 + ")");
        setLayout(new GridLayout(m, 2));
        //setLayout(new FlowLayout());
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);



//        Point start = new Point(190, 60);
//        Point end = new Point(300, 30);
//        ClassEdgesTest edge = new ClassEdgesTest(start, end, 1);
//        edge.drawEdges(g);
//
//        Point start2 = new Point(190, 100);
//        Point end2 = new Point(300, 100);
//        ClassEdgesTest edge2 = new ClassEdgesTest(start2, end2, 1);
//        edge2.drawEdges(g);
//
//        Point start3 = new Point(190, 150);
//        Point end3 = new Point(300, 200);
//        ClassEdgesTest edge3 = new ClassEdgesTest(start3, end3, 1);
//        edge3.drawEdges(g);
//
//        Point start4 = new Point(190, 270);
//        Point end4 = new Point(300, 220);
//        ClassEdgesTest edge4 = new ClassEdgesTest(start4, end4, 0);
//        edge4.drawEdges(g);
//
//        Point start5 = new Point(190, 290);
//        Point end5 = new Point(300, 290);
//        ClassEdgesTest edge5 = new ClassEdgesTest(start5, end5, 0);
//        edge5.drawEdges(g);
//
//        Point start6 = new Point(190, 300);
//        Point end6 = new Point(300, 340);
//        ClassEdgesTest edge6 = new ClassEdgesTest(start6, end6, 0);
//        edge6.drawEdges(g);

    }
    }



