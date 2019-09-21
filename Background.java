import javax.swing.*;
import java.awt.*;


public class Background extends JPanel {
    private MainCircles gameWindow;

    public static void setColor(GameCanvas canvas) {
        Color color = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
        canvas.setBackground(color);
    }
}

