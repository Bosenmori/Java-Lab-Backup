package Lib;
import java.awt.*;
import javax.swing.*;
import java.io.*;
public class form2 {
    public form2(){
        JFrame f = new JFrame("Vehicle registration");
        Container cp = f.getContentPane();
        cp.setLayout(null);
        JLabel N = new JLabel("Name : ");
        JLabel C = new JLabel("Car license : ");
        JTextField tf = new JTextField(20);
        JTextField tf2 = new JTextField(20);
        JButton ok = new JButton("OK");
        JRadioButton c1 = new JRadioButton("Car",true);
        JRadioButton c2 = new JRadioButton("Bike",false);
        JLabel CT = new JLabel("Car Type : ");
        JLabel Pr = new JLabel("Province : ");
        JComboBox<String> Box = PTC();

        c1.setBounds(100, 120, 100, 30);
        N.setBounds(43, 15, 100, 30);
        tf.setBounds(90, 15,185, 30);
        C.setBounds(12, 50, 100, 30);
        tf2.setBounds(90, 50, 100, 30);
        ok.setBounds(100, 160, 100, 30);
        CT.setBounds(24, 120, 100, 30);
        Pr.setBounds(25, 85, 100, 30);
        c2.setBounds(180, 120, 100, 30);
        Box.setBounds(90, 85, 100, 30);
        ButtonGroup g = new ButtonGroup(); g.add(c1); g.add(c2);
        
        cp.add(N);
        cp.add(C);
        cp.add(tf);
        cp.add(tf2);
        cp.add(ok);
        cp.add(CT);
        cp.add(Pr);
        cp.add(c1);
        cp.add(c2);
        cp.add(ok);
        cp.add(Box);

        f.setSize(300,245);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public JComboBox<String> PTC(){
        JComboBox<String> temp = new JComboBox<>();
        File f = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            f = new File("./file/Thailand_PRV.csv");
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            String s;
            br.readLine();
            while ((s=br.readLine())!=null) {
                String arr[] = s.split(",");
                temp.addItem(arr[1]);
            }
            temp.setSelectedItem("Bangkok");
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            try {
                br.close(); fr.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return temp;
    }
}

