package EX12_03;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
public class TestGridLayout {
    public static void main(String[] args) {
//        كده انا عملت الواجهة بتاعتي
        JFrame frame = new JFrame("Exercise 12_3");
        GridLayout gridLayout = new GridLayout(2, 3);
       
        frame.setLayout(gridLayout);
//        كده انا عملت البانال
        FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT,5,10); 
        JPanel jp1 = new JPanel();
        jp1.setLayout(flowLayout);
        JPanel jp2 = new JPanel();
        jp2.setLayout(flowLayout);
//        هحط الازرار هنا 
        JButton Jb1 = new JButton("Button 1");
        JButton Jb2 = new JButton("Button 2");
        JButton Jb3 = new JButton("Button 3");
        JButton Jb4 = new JButton("Button 4");
        JButton Jb5 = new JButton("Button 5");
        JButton Jb6 = new JButton("Button 6");
//        ضيفتهم في البانال 
        jp1.add(Jb1);
        jp1.add(Jb2);
        jp1.add(Jb3);
        jp2.add(Jb4);
        jp2.add(Jb5);
        jp2.add(Jb6);
//        ضيفت البانال في الواجهه
        frame.add(jp1);
        frame.add(jp2);
        
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        عشان اقوله انه يضغط عليها يقفل الران
        frame.setVisible(true);        
//        عشان يظهر اللي انا عملته 
    }
}
