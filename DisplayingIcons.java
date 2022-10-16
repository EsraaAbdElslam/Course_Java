package EX12_06;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;
public class DisplayingIcons {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercise 12_6");
        GridLayout gridLayout = new GridLayout(2, 2);
        frame.setLayout(gridLayout);
        LineBorder lineBorder = new LineBorder(Color.black, 2);
        ImageIcon Im1 = new ImageIcon("C:\\Users\\USER\\OneDrive\\المستندات\\NetBeansProjects\\Esoo\\src\\EX12_06\\1.jpg");
        ImageIcon Im2 = new ImageIcon("C:\\Users\\USER\\OneDrive\\المستندات\\NetBeansProjects\\Esoo\\src\\EX12_06\\2.jpg");
        ImageIcon Im3 = new ImageIcon("C:\\Users\\USER\\OneDrive\\المستندات\\NetBeansProjects\\Esoo\\src\\EX12_06\\3.jpg");
        ImageIcon Im4 = new ImageIcon("C:\\Users\\USER\\OneDrive\\المستندات\\NetBeansProjects\\Esoo\\src\\EX12_06\\4.jpg");
        JLabel label1 = new JLabel(Im1);
        JLabel label2 = new JLabel(Im2);
        JLabel label3 = new JLabel(Im3);
        JLabel label4 = new JLabel(Im4);
        label1.setBorder(lineBorder);
        label2.setBorder(lineBorder);
        label3.setBorder(lineBorder);
        label4.setBorder(lineBorder);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.setSize(400, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        عشان اقوله انه يضغط عليها يقفل الران
        frame.setVisible(true);        
//        عشان يظهر اللي انا عملته 
  
    }
    
}
