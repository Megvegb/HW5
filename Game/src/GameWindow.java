import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class GameWindow extends JFrame {
// private GameWindow game_window;
    private static Image drop;
    private static Image background;
    private static Image gameOver;
    private static Object ImageIO;

    public static void main (String [] args) throws IOException {
        background = ImageIO.read(GameWindow.class.getResourceAsStream("background.png"));
        gameOver = ImageIO.read(GameWindow.class.getResourceAsStream("gameOver.jpeg"));
        drop = ImageIO.read(GameWindow.class.getResourceAsStream("drop.png"));

        JFrame game_window = new JFrame("Catch the drop");
        game_window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        game_window.setSize(1200,760);
        game_window.setLocation(200,100);
        game_window.setResizable(false);
        GameField game_field = new GameField();
        game_window.add(game_field);
        game_window.setVisible(true);
    }

    private static void onRepaint(Graphics g){
    g.fillOval(10,10,200,100);
    g.drawLine(200,100,500,200);
    }

    private static class GameField extends JPanel{

        @Override
        protected void paintComponent (Graphics g){
            super.paintComponent(g);
            onRepaint(g);

        }

    }
}
