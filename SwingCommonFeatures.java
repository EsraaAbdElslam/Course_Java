package EX12_08;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class SwingCommonFeatures {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercise 12_5");
        GridLayout gridLayout = new GridLayout(2, 3, 1, 1);
        frame.setLayout(gridLayout);
        LineBorder lineBorder = new LineBorder(Color.YELLOW, 2);
        Font largeFont = new Font("TimesRoman", Font.BOLD, 20);
        JLabel label1 = new JLabel("black");
        JLabel label2 = new JLabel("blue");
        JLabel label3 = new JLabel("cyan");
        JLabel label4 = new JLabel("green");
        JLabel label5 = new JLabel("magenta");
        JLabel label6 = new JLabel("Orange");
        label1.setForeground(Color.BLACK);
        label2.setForeground(Color.BLUE);
        label3.setForeground(Color.CYAN);
        label4.setForeground(Color.GREEN);
        label5.setForeground(Color.MAGENTA);
        label6.setForeground(Color.ORANGE);
        label1.setFont(largeFont);
        label2.setFont(largeFont);
        label3.setFont(largeFont);
        label4.setFont(largeFont);
        label5.setFont(largeFont);
        label6.setFont(largeFont);
        label1.setBorder(lineBorder);
        label2.setBorder(lineBorder);
        label3.setBorder(lineBorder);
        label4.setBorder(lineBorder);
        label5.setBorder(lineBorder);
        label6.setBorder(lineBorder);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(label6);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        عشان اقوله انه يضغط عليها يقفل الران
        frame.setVisible(true);        
//        عشان يظهر اللي انا عملته 
  
    }
}

