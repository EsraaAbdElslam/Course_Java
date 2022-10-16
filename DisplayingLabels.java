package EX12_05;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
public class DisplayingLabels {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercise 12_5");
        GridLayout gridLayout = new GridLayout(4, 1);
        frame.setLayout(gridLayout);
        LineBorder lineBorder = new LineBorder(Color.black, 2);
        Font largeFont = new Font("TimesRoman", Font.BOLD, 20);
        JLabel label1 = new JLabel("Department of Computer Science");
        JLabel label2 = new JLabel("School of Computing");
        JLabel label3 = new JLabel("Armstrong Atlantic State University");
        JLabel label4 = new JLabel("Tel:(912)921-6440");
        label1.setFont(largeFont);
        label2.setFont(largeFont);
        label3.setFont(largeFont);
        label4.setFont(largeFont);
        label1.setBorder(lineBorder);
        label2.setBorder(lineBorder);
        label3.setBorder(lineBorder);
        label4.setBorder(lineBorder);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        عشان اقوله انه يضغط عليها يقفل الران
        frame.setVisible(true);        
//        عشان يظهر اللي انا عملته 
  
    }
}
