import javax.swing.*;

public class Gui extends JFrame {

    public Gui() {
        createPanels();
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void createPanels() {
        JPanel diagramPanel = new DiagramPanel();
        add(diagramPanel);

    }

    public static void main(String[] args) {
        JFrame main = new Gui();
    }
}
