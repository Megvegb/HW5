import javax.swing.*;
import java.awt.*;

public class SimpleCalculator extends JFrame {

    public static void main(String[] args) {

        JFrame window = new JFrame("SimpleCalculation");
        window.setVisible(true);
        window.setResizable(false);
        window.setLocation(200,100);
        window.setSize(906,400);


        JPanel windowContent = new JPanel();

        FlowLayout f1 = new FlowLayout();

        windowContent.setLayout(f1);


    }
}
