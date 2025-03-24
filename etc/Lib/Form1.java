package Lib;

import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class Form1 extends JFrame {

    public Form1() {
        Container cp = this.getContentPane();
        cp.setLayout(null);
        this.setTitle("Vehicle Registration");
        JLabel n = new JLabel("Name : ");
        JLabel cl = new JLabel("Car License : ");
        JLabel p = new JLabel("Privince : ");
        JLabel ct = new JLabel("Car Type : ");
        JTextField n1 = new JTextField(20);
        JTextField cl1 = new JTextField(10);
        JComboBox<String> Box = PTC();
        JRadioButton rb1 = new JRadioButton("Car");
        JRadioButton rb2 = new JRadioButton("Bike");
        JButton save = new JButton("Save");

        ButtonGroup g = new ButtonGroup();
        g.add(rb1);
        g.add(rb2);
        n.setBounds(50, 10, 100, 50);
        cl.setBounds(13, 40, 100, 50);
        p.setBounds(33, 70, 100, 50);
        ct.setBounds(29, 100, 100, 50);
        n1.setBounds(100, 27, 140, 20);
        cl1.setBounds(100, 54, 70, 20);
        Box.setBounds(100, 90, 130, 20);
        rb1.setBounds(90, 110, 50, 40);
        rb2.setBounds(150, 110, 50, 40);
        save.setBounds(100, 150, 100, 30);

        cp.add(n);
        cp.add(cl);
        cp.add(p);
        cp.add(ct);
        cp.add(n1);
        cp.add(cl1);
        cp.add(Box);
        cp.add(rb1);
        cp.add(rb2);
        cp.add(save);
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String province = "" + Box.getSelectedItem();
                String cartype = rb1.isSelected() ? "Car" : "Bike";
                write(n1.getText(), cl1.getText(), province, cartype);
                n1.setText("");
                cl1.setText("");
                Box.setSelectedItem("Krabi");
                g.clearSelection();
            }
        });
        this.setSize(300, 250);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public JComboBox<String> PTC() {
        JComboBox temp = new JComboBox<>();
        File f = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            f = new File("./File/Thailand_PRV.csv");
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            String s;
            br.readLine();
            while ((s = br.readLine()) != null) {
                String arr[] = s.split(",");
                temp.addItem(arr[1]);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                br.close();
                fr.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return temp;
    }

    public void write(String name, String cl, String p, String ct) {
        File f1 = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            f1 = new File("./File/Data.txt");
            fw = new FileWriter(f1, true);
            bw = new BufferedWriter(fw);
            String s = name + ',' + cl + ',' + p + ',' + ct + "\n";
            bw.write(s);
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
}