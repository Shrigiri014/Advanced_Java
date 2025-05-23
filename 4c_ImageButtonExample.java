/* 4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour
   Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is
   pressed by implementing the event handling mechanism with addActionListener( ).
*/


package Swings;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ImageButtonExample {
    JLabel l1;

    ImageButtonExample() {
        JFrame f = new JFrame("Image Button Example");

        l1 = new JLabel();
        l1.setBounds(50, 30, 400, 40);
        l1.setFont(new Font("Lucida Calligraphy", Font.BOLD, 20));

        ImageIcon icon1 = new ImageIcon("digital_clock.png");
        ImageIcon icon2 = new ImageIcon("hour_glass.png");

        JButton b1 = new JButton(icon1);
        b1.setBounds(50, 100, 150, 100);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setText("Digital Clock is pressed");
            }
        });

        JButton b2 = new JButton(icon2);
        b2.setBounds(250, 100, 150, 100);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setText("Hour Glass is pressed");
            }
        });

        f.add(b1);
        f.add(b2);
        f.add(l1);

        f.setSize(500, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ImageButtonExample();
    }
}
