import javax.swing.JOptionPane;

public class Reader {
    int i, k;
    String n1, n2;

    public void scan() {
        n1 = JOptionPane.showInputDialog("Enter the first number");
        n2 = JOptionPane.showInputDialog("Enter the second number");

        i = Integer.parseInt(n1);
        k = Integer.parseInt(n2);
        int result = i + k;

        JOptionPane.showMessageDialog(null, "You first number is " + result);

    }
}
