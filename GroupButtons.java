package EX12_04;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
public class GroupButtons extends JPanel{
    public JPanel getJpanal(){
        FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT,5,10);
        GridLayout gridLayout = new GridLayout(2, 3);        
        JPanel JP = new JPanel();
        JP.setLayout(gridLayout);        
        
        JPanel jp1 = new JPanel();
        jp1.setLayout(flowLayout);
        
        JPanel jp2 = new JPanel();
        jp2.setLayout(flowLayout);        
        
        jp1.add(new JButton("Button 1"));
        jp1.add(new JButton("Button 2"));
        jp1.add(new JButton("Button 3"));
        
        jp2.add(new JButton("Button 4"));
        jp2.add(new JButton("Button 5"));
        jp2.add(new JButton("Button 6"));        
        
        JP.add(jp1);
        JP.add(jp2);
        return JP;
    }
}
