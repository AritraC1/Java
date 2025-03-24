package Java8Features;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Window {
    public static void main(String[] args) {

        // Window: Object of JFrame
        JFrame frame = new JFrame("My Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        // Fix the height and width of the frame
        frame.setSize(400, 400); // width = 400, height = 300
        frame.setLayout(new FlowLayout());

        // Button
        JButton button = new JButton("Click Me");
        frame.add(button);

        /*
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked");
                JOptionPane.showMessageDialog(null, "This is a Message");
            }
        });
         */

        button.addActionListener((e) -> {
            System.out.println("Button Clicked");
            JOptionPane.showMessageDialog(null, "This is a Message");
        });

        button.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
            }
        });
    }
}
