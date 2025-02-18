package Lib;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FormLab12_2 extends JFrame implements MouseListener {

    Container cp;
    JButton allBT[];
    JLabel L;

    public FormLab12_2() {
        Initial();
        setComponent();
        Finally();
    }

    public void Initial() {
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout());
        allBT = new JButton[400];
    }

    public void setComponent() {

        JPanel p = new JPanel();
        p.setLayout(new GridLayout(20, 20));

        for (int i = 0; i < 400; i++) {
            allBT[i] = new JButton();
            allBT[i].setBackground(Color.white);
            allBT[i].setPreferredSize(new Dimension(20, 20));
            p.add(allBT[i]);
            allBT[i].addMouseListener(this);
        }

        L = new JLabel("0");
        L.setPreferredSize(new Dimension(200, 40));
        L.setFont(new Font("Times New Roman", Font.BOLD, 20));
        L.setHorizontalAlignment(JLabel.CENTER);

        cp.add(L, BorderLayout.NORTH);
        cp.add(p, BorderLayout.CENTER);

    }

    public void Finally() {
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    Color tmp;
    int x = 0;

    @Override
    public void mouseClicked(MouseEvent e) {
        if (tmp == Color.WHITE) {
            e.getComponent().setBackground(Color.red);
            tmp = Color.red;
            x++;
            L.setText(x + "");
        } else if (tmp == Color.red) {
            e.getComponent().setBackground(Color.WHITE);
            tmp = Color.WHITE;
            x--;
            L.setText(x + "");
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        tmp = e.getComponent().getBackground();
        e.getComponent().setBackground(Color.BLACK);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        e.getComponent().setBackground(tmp);
    }

}
