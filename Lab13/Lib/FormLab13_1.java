package Lib;

import java.awt.*;
import javax.swing.*;

public class FormLab13_1 extends JFrame {
    public FormLab13_1() {
        getContentPane().add(new Draw1());
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

class Draw1 extends JPanel {
    public void paintComponent(Graphics g) {
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Just Keep Smiling", getWidth() / 2 - 80, (getHeight() / 2 - 100));
        g.fillOval((getWidth() / 2 - 77), (getHeight() / 2 - 77), 155, 155);
        g.setColor(Color.YELLOW);
        g.fillOval((getWidth() / 2 - 75), (getHeight() / 2 - 75), 150, 150);
        g.setColor(Color.BLACK);
        g.fillOval((getWidth() / 2 - 75) + 40, (getHeight() / 2 - 75) + 30, 30, 30);
        g.fillOval((getWidth() / 2 - 75) + 80, (getHeight() / 2 - 75) + 30, 30, 30);
        g.drawArc((getWidth() / 2 - 75) + 30, (getHeight() / 2 - 75) + 100, 90, 15, 180, 180);
        Polygon left = new Polygon();
        left.addPoint((getWidth() / 2 - 75), (getHeight() / 2 - 75) + 170);
        left.addPoint((getWidth() / 2 - 75), (getHeight() / 2 - 75) + 140);
        left.addPoint((getWidth() / 2 - 75) + 70, (getHeight() / 2 - 75) + 150);
        Polygon right = new Polygon();
        right.addPoint((getWidth() / 2 - 75) + 140, (getHeight() / 2 - 75) + 170);
        right.addPoint((getWidth() / 2 - 75) + 140, (getHeight() / 2 - 75) + 140);
        right.addPoint((getWidth() / 2 - 75) + 70, (getHeight() / 2 - 75) + 150);
        g.setColor(Color.red);
        g.fillPolygon(left);
        g.fillPolygon(right);
    }
}
