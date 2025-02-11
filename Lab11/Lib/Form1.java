package Lib;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class Form1 extends JFrame implements ActionListener {

    Container cp;
    JLabel name, id;
    JTextField t1, t2, t3;
    JButton b1, b2;

    public Form1() {
        Initial();
        setComponent();
        Finally();
    }

    public void Initial() {
        cp = this.getContentPane();
        cp.setLayout(null);
    }

    public void setComponent() {
        id = new JLabel("ID : ");
        name = new JLabel("Name : ");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        b1 = new JButton("Add");
        b2 = new JButton("Clear");
        b1.addActionListener(this);
        b2.addActionListener(this);

        id.setBounds(32, 10, 60, 25);
        name.setBounds(10, 40, 60, 25);
        t1.setBounds(60, 10, 120, 25);
        t2.setBounds(60, 40, 180, 25);
        b1.setBounds(30, 80, 70, 25);
        b2.setBounds(120, 80, 70, 25);

        cp.add(id);
        cp.add(t1);
        cp.add(name);
        cp.add(t2);
        cp.add(b1);
        cp.add(b2);
    }

    public void Finally() {
        this.setSize(270, 160);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    boolean error;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String tmp = t1.getText();
            error = false;
            String errorString = "";
            for (int i = 0; i < tmp.length(); i++) {
                if (!Character.isDigit(tmp.charAt(i))) {
                    error = true;
                    errorString += "ID must be a number.\n";
                    break;
                }
            }
            tmp = t2.getText();
            for (int i = 0; i < tmp.length(); i++) {
                if (!(Character.isAlphabetic(tmp.charAt(i)) || tmp.charAt(i) == ' '))
                    error = true;
                errorString += "ID must contain English or space.\n";
                break;
            }
            if (error) {
                popup(errorString);
            } else {
                write_csv(t1.getText(), t2.getText());
                popup("Complete");
            }
        }
        if (e.getSource() == b2) {
            t1.setText("");
            t2.setText("");

        }
    }

    public void write_csv(String id, String name) {
        File f = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            f = new File("./File/STD.csv");
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);
            bw.write(id + " " + name + "\n");

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void popup(String S) {
        this.setVisible(false);
        JDialog d = new JDialog();
        JLabel l = new JLabel(S);
        d.getContentPane().add(l);
        d.pack();
        d.setVisible(true);
        d.setLocationRelativeTo(this);
        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
