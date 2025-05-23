/* 5b. Develop a Swing program in Java to create a Tabbed Pan of RED, BLUE and GREEN and
   display the concerned color whenever the specific tab is selected in the Pan.
*/


package Swings;

import java.awt.Color;
import javax.swing.*;

public class TabbedPaneExample {

    JFrame f;

    TabbedPaneExample() {
        f = new JFrame();

        // Create panels
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        // Set background colors
        p1.setBackground(Color.BLUE);
        p2.setBackground(Color.RED);
        p3.setBackground(Color.GREEN);

        // Create tabbed pane and add panels
        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(50, 50, 200, 200);
        tp.add("BLUE", p1);
        tp.add("RED", p2);
        tp.add("GREEN", p3);

        // Add tabbed pane to frame
        f.add(tp);

        // Frame settings
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new TabbedPaneExample();
    }
}
