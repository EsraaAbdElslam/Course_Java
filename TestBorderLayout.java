package EX12_02;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
public class TestBorderLayout {
    public static void main(String[] args) {
//        كده انا عملت الواجهة بتاعتي
        JFrame frame = new JFrame("Exercise 12_2");
        BorderLayout borderLayout = new BorderLayout();
       
        frame.setLayout(borderLayout);
//        كده انا عملت البانال
        FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT, 5, 10); 
        JPanel jp = new JPanel();
        jp.setLayout(flowLayout);
        JPanel JP = new JPanel();
        JP.setLayout(flowLayout);
//        هحط الازرار هنا 
        JButton Jb1 = new JButton("Button 1");
        JButton Jb2 = new JButton("Button 2");
        JButton Jb3 = new JButton("Button 3");
        JButton Jb4 = new JButton("Button 4");
        JButton Jb5 = new JButton("Button 5");
        JButton Jb6 = new JButton("Button 6");
//        ضيفتهم في البانال 
        jp.add(Jb1);
        jp.add(Jb2);
        jp.add(Jb3);
        JP.add(Jb4);
        JP.add(Jb5);
        JP.add(Jb6);
//        ضيفت البانال في الواجهه
        frame.add(jp,BorderLayout.NORTH);
        frame.add(JP,BorderLayout.CENTER);
        
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        عشان اقوله انه يضغط عليها يقفل الران
        frame.setVisible(true);        
//        عشان يظهر اللي انا عملته 
    }
}
