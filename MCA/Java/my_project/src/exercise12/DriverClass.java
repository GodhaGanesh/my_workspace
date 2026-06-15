package exercise12;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class DriverClass {
    public static void main(String[] args){
        JFrame f = new JFrame("Hii");
        f.setSize(900, 700);

        JLabel colorCode = new JLabel("");

        JPanel colorPanel = new JPanel(new BorderLayout());
        colorPanel.setLayout(new GridLayout(4, 1));
        colorPanel.setBounds(100, 200, 100, 200);

        JSlider r = new JSlider(0,255);
        JSlider g = new JSlider(0,255);
        JSlider b = new JSlider(0,255);

        r.setBorder(BorderFactory.createTitledBorder("Red"));
        g.setBorder(BorderFactory.createTitledBorder("Green"));
        b.setBorder(BorderFactory.createTitledBorder("Blue"));

        ChangeListener cl = new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {

                int red = r.getValue();
                int green = g.getValue();
                int blue = b.getValue();

                f.getContentPane().setBackground(
                        new Color(red, green, blue)
                );
            }
        };

        r.addChangeListener(cl);
        g.addChangeListener(cl);
        b.addChangeListener(cl);

        colorPanel.add(r);
        colorPanel.add(g);
        colorPanel.add(b);
        f.add(colorPanel, BorderLayout.NORTH);

        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}