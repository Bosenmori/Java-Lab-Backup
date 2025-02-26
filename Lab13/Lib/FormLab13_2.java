package Lib;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FormLab13_2 extends JFrame {
    public FormLab13_2() {
        getContentPane().add(new Draw2());
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

class Draw2 extends JPanel implements ActionListener {
    int r = 100;
    boolean decrease_r = true;
    int start_ang = 0;

    public Draw2() {
        Timer t = new Timer(50, this);
        t.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval((getWidth() / 2 - r), (getHeight() / 2 - r), r * 2, r * 2);
        for (int i = 1; i <= 6; i++) {
            g.fillArc((getWidth() / 2 - r), (getHeight() / 2 - r), r * 2, r * 2, i * 60 + start_ang, 30);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (decrease_r) {
            r = r - 5;
            if (r == 0)
                decrease_r = false;
        } else {
            r = r + 5;
            if (r == 100)
                decrease_r = true;
        }
        start_ang += 2;
        if (start_ang == 360)
            start_ang = 0;
        repaint();
    }
}
