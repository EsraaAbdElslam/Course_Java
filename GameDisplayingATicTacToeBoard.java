package EX12_07;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class GameDisplayingATicTacToeBoard {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercise 12_6");
        GridLayout gridLayout = new GridLayout(3, 3);
        frame.setLayout(gridLayout);
        LineBorder lineBorder = new LineBorder(Color.black, 2);
        ImageIcon Im1 = new ImageIcon("C:\\Users\\USER\\OneDrive\\المستندات\\NetBeansProjects\\Esoo\\src\\EX12_07\\0.jpg");
        ImageIcon Im2 = new ImageIcon("C:\\Users\\USER\\OneDrive\\المستندات\\NetBeansProjects\\Esoo\\src\\EX12_07\\1.jpg");
        ImageIcon Im3 = new ImageIcon("C:\\Users\\USER\\OneDrive\\المستندات\\NetBeansProjects\\Esoo\\src\\EX12_07\\2.jpg");
        JLabel label = new JLabel();
        for (int i = 0; i < 9; i++) {
            int n = (int) (Math.random() * 3);
            if(n == 0)
                label = new JLabel(Im1);
            else if (n == 1)
                label = new JLabel(Im2);
            else
                label = new JLabel(Im3);
            label.setBorder(lineBorder);
            frame.add(label);
        }
        
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        عشان اقوله انه يضغط عليها يقفل الران
        frame.setVisible(true);        
//        عشان يظهر اللي انا عملته 
  
    }
}
