package EX12_04;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JFrame;

public class UsingJPanelToGroupButtons  {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercise 12_4");
        GridLayout gridLayout = new GridLayout(2, 3);
        frame.setLayout(gridLayout);
        GroupButtons jp = new GroupButtons();
        
        frame.add(jp.getJpanal());
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
