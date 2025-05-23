/* 5d. Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and
   display the concerned color whenever the specific tab is selected in the Pan
*/


import javax.swing.*;
import java.awt.*;

public class ColorTabbedPane extends JFrame {

    public ColorTabbedPane() {
        setTitle("Color Tabbed Pane");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);  // Using absolute layout for demonstration

        // Create tabbed pane
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(50, 50, 300, 150);

        // Create color panels
        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);

        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);

        // Add panels to tabs
        tabbedPane.add("Cyan", cyanPanel);
        tabbedPane.add("Magenta", magentaPanel);
        tabbedPane.add("Yellow", yellowPanel);

        // Add tabbed pane to frame
        add(tabbedPane);

        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorTabbedPane();
    }
}
