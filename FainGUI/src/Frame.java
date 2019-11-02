import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {

    public void coverNew() {

        JPanel windowContent = new JPanel();
        windowContent.setLayout(new FlowLayout());


        JLabel label1 = new JLabel("num 1");
        JTextField text1 = new JTextField(10);
        JLabel label2 = new JLabel("num 2");
        JTextField text2 = new JTextField(10);
        JLabel label3 = new JLabel("sum");
        JTextField result = new JTextField(10);
        JButton go = new JButton("Add");
        JButton northButton = new JButton("CALCULATE");

        windowContent.add(text1);
        windowContent.add(label1);
        windowContent.add(text2);
        windowContent.add(label2);
        windowContent.add(label3);
        windowContent.add(result);
        windowContent.add(go);
        windowContent.add(northButton);

        JFrame window = new JFrame("SimpleCalculation");
        window.setContentPane(windowContent);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);

        window.setVisible(true);
        window.setResizable(false);
        window.setLocation(200, 100);
        window.setSize(200, 200);

    }

    public class eHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            String clickedButtonLabel = clickedButton.getText();
            JOptionPane.showConfirmDialog(null, "You pressed" + clickedButtonLabel);
        }
        }
}
