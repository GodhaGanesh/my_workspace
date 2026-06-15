package exercise10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseAdapterExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Mouse Event Example");
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel text = new JLabel("Mouse Listener Practice");
        text.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(text);

        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                text.setText("Mouse clicked at: " + e.getX() + ", " + e.getY());
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                text.setText("Mouse entered the frame");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                text.setText("Mouse exited the frame");
            }
        });

        frame.setVisible(true);
    }
}