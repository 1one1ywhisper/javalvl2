import javax.swing.*;
import java.awt.*;

public class GameCanvas extends JPanel {

    private MainCircles gameWindow;
    private long lastFrameTime;

    GameCanvas(MainCircles gameWindow) {
        this.gameWindow = gameWindow;
    }////Конструктор панели


    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        long currentTime = System.nanoTime();////current time
        float delta = (currentTime - lastFrameTime) * 0.000000001f;
        lastFrameTime = currentTime;////last frame time
        try {
            Thread.sleep(17);//Сон панели *как-бы фпс*
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        gameWindow.onDrawPanel(this, g, delta);
        repaint();
        Color color = new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
        super.setBackground(color);
    }


    public int getLeft() { return 0; }
    public int getRight() { return getWidth() - 1; }
    public int getTop() { return 0; }
    public int getBottom() { return getHeight() - 1; }

}
