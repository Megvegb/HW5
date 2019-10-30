import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public void coverNew() {

        JPanel windowContent = new JPanel();
        windowContent.setLayout(new BorderLayout());
        windowContent.setLayout(new FlowLayout());



        JLabel label1 = new JLabel ("num 1");
        JTextField text1 = new JTextField(10);
        JLabel label2 = new JLabel ("num 2");
        JTextField text2 = new JTextField(10);
        JLabel label3 = new JLabel ("sum");
        JTextField result = new JTextField(10);
        JButton go = new JButton("Add");
        JButton northButton = new JButton("NORTH (PAGE_START)");

        windowContent.add(northButton, BorderLayout.NORTH);
        windowContent.add(text1);
        windowContent.add(label1);
        windowContent.add(text2);
        windowContent.add(label2);
        windowContent.add(label3);
        windowContent.add(result);
        windowContent.add(go);

        JFrame window = new JFrame("SimpleCalculation");
        window.setContentPane(windowContent);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);

        window.setVisible(true);
        window.setResizable(false);
        window.setLocation(200, 100);
        window.setSize(200, 200);


    }
}
