import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import javax.imageio.ImageIO;

public class GameWindow extends JFrame {
    private GameWindow game_window;
    private static Image drop;
    private static Image background;
    private static Image gameOver;
    private static float dropLeft = 200;
    private static float dropTop = -100;
    private static long lastFrameTime;
    private static float dropSpeed = 100;

    public static void main (String [] args) throws IOException {

        background = ImageIO.read(GameWindow.class.getResourceAsStream("background.png"));
        gameOver = ImageIO.read(GameWindow.class.getResourceAsStream("gameOver.png"));
        drop = ImageIO.read(GameWindow.class.getResourceAsStream("drop.png"));

        game_window = new GameWindow();
        game_window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        game_window.setSize(1300,700);
        game_window.setLocation(0,0);
        game_window.setResizable(false);
        GameField game_field = new GameField();
        game_window.add(game_field);
        game_window.setVisible(true);
        lastFrameTime = System.nanoTime();
    }

    private static void onRepaint(Graphics g){
        long currentTime = System.nanoTime();
        float deltaTime = (currentTime - lastFrameTime) * 0.000000001f;
        lastFrameTime = currentTime;
        dropTop = dropTop + dropSpeed *deltaTime;
    g.drawImage(background,0,0,null);
    g.drawImage(drop,(int)dropLeft,(int)dropTop,null);
    if (dropTop > .) { g.drawImage(gameOver,380,220,null);
        }
    }

    private static class GameField extends JPanel{

        @Override
        protected void paintComponent (Graphics g){
            super.paintComponent(g);
            onRepaint(g);
            repaint();

        }

    }
}
