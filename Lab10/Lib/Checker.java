package Lib;
import java.awt.*;
import javax.swing.*;
public class Checker{
    JFrame f;
    Container cp ;
    JPanel table;
    JPanel gamePanel;
    public Checker(){
        Initial();
        setComponent();
        Finally() ;
    }
    public void Initial(){
        f = new JFrame("Checker");
        ImageIcon cat = new ImageIcon("./Img/Wowa.jpg");
        f.setIconImage(cat.getImage());
        cp = f.getContentPane();
        cp.setLayout(new BorderLayout());
        table = new JPanel(new GridLayout(8, 8));
        gamePanel = new JPanel();
        gamePanel.setLayout(new BoxLayout(gamePanel, BoxLayout.Y_AXIS));
    }
    public void setComponent(){
        setTable();
        setGamePanel();
        cp.add(table,BorderLayout.WEST);
        cp.add(gamePanel,BorderLayout.CENTER);
    }
    public void setTable(){
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                JButton button = new JButton();
                if ((row + col) % 2 == 0) {
                    button.setBackground(Color.BLACK);
                } else {
                    button.setBackground(Color.WHITE);
                }
                table.add(button);
            }
        }
    }
    public void setGamePanel(){
        JLabel title = new JLabel("Game Panel.");
        JLabel timer = new JLabel("Time Passed 00.00");
        JButton s = new JButton("START");
        title.setFont(new Font("Arial", Font.BOLD,18));
        timer.setFont(new Font("Arial", Font.BOLD, 13));
        s.setFont(new Font("Arial", Font.BOLD, 15));
        s.setMaximumSize(new Dimension(100, 40));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        timer.setAlignmentX(Component.CENTER_ALIGNMENT);
        s.setAlignmentX(Component.CENTER_ALIGNMENT);
        gamePanel.setBorder(BorderFactory.createEmptyBorder(80, 0, 50, 0));
        gamePanel.add(title);
        gamePanel.add(Box.createVerticalStrut(20));
        gamePanel.add(timer);
        gamePanel.add(Box.createVerticalStrut(20));
        gamePanel.add(s);
    }
    public void Finally(){
        f.setSize(460,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}