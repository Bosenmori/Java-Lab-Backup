package Lib;
import java.awt.*;
import javax.swing.*;
public class form1 {
    public form1(){
        JFrame f = new JFrame("Login");
        Container cp = f.getContentPane();
        cp.setLayout(null);
        JLabel U = new JLabel("USER : ");
        JTextField tf = new JTextField(20);
        JButton b = new JButton("Login");
        JLabel p = new JLabel("Password : ");
        JPasswordField tf2 = new JPasswordField(20);

        U.setBounds(40, 15, 100, 30);
        tf.setBounds(90, 15,185, 30);
        p.setBounds(12, 50, 100, 30);
        b.setBounds(100, 90, 100, 30);
        tf2.setBounds(90, 50, 185, 30);
        cp.add(U);
        cp.add(tf);
        cp.add(b);
        cp.add(p);
        cp.add(tf2);
        f.setSize(300,170);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

