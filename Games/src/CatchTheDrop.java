import javax.swing.*;
import java.awt.*;

public class CatchTheDrop extends JFrame {
//    private static GameWindows game_window;

    public static void main(String[] args) {
        JFrame gameWindows = new JFrame("Catch the Drop");

//        game_window = new GameWindows();
        gameWindows.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameWindows.setLocation(200, 100);
        gameWindows.setSize(906, 478);
        gameWindows.setResizable(false);
        gameWindows.setVisible(true);
    }

    private static void onRepaint(Graphics g) {

    }

    private static class GameField extends JPanel {

    }
}
