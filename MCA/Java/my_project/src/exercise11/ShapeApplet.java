package exercise11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ShapeApplet extends Applet implements MouseListener {

    CheckboxGroup cbg;
    Checkbox line, rect, oval;

    int x1, y1, x2, y2;

    public void init() {
        cbg = new CheckboxGroup();

        line = new Checkbox("Line", cbg, true);
        rect = new Checkbox("Rectangle", cbg, false);
        oval = new Checkbox("Oval", cbg, false);

        add(line);
        add(rect);
        add(oval);

        addMouseListener(this);
    }

    public void mousePressed(MouseEvent e) {
        x1 = e.getX();
        y1 = e.getY();
    }

    public void mouseReleased(MouseEvent e) {
        x2 = e.getX();
        y2 = e.getY();
        repaint();
    }

    public void paint(Graphics g) {
        String selected = cbg.getSelectedCheckbox().getLabel();

        int width = Math.abs(x2 - x1);
        int height = Math.abs(y2 - y1);

        int x = Math.min(x1, x2);
        int y = Math.min(y1, y2);

        if (selected.equals("Line")) {
            g.drawLine(x1, y1, x2, y2);
        }
        else if (selected.equals("Rectangle")) {
            g.drawRect(x, y, width, height);
        }
        else if (selected.equals("Oval")) {
            g.drawOval(x, y, width, height);
        }
    }

    // Unused MouseListener methods
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}