import javax.swing.*;
import java.awt.*;

public class MainCircles extends JFrame {//Наследуемся от JFrame


    private static final int POS_X = 600;//Позиция окна
    private static final int POS_Y = 200;
    private static final int WINDOW_WIDTH = 800;//Разрешение окна
    private static final int WINDOW_HEIGHT = 600;
    Sprite[] sprites = new Sprite[10];

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainCircles();
            }
        });
    }

  private MainCircles() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//Задаем что случается при нажатии на крест
        setBounds(POS_X, POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);//Задаем границы окна
        setTitle("Circles");//Задаем тайтл окну
        GameCanvas gameCanvas = new GameCanvas(this);//Прикручиваем конву
        Background.setColor();
        add(gameCanvas);
        initGame();
        setVisible(true);//Задаем видимость
    }

    private void initGame() {
        for (int i = 0; i < sprites.length; i++) {
            sprites[i] = new Ball();
        }
    }

    void onDrawPanel(GameCanvas canvas, Graphics g, float deltaTime) {//Цикл обновления
        update(canvas, deltaTime);
        render(canvas, g);
    }

    private void update(GameCanvas canvas, float deltaTime) {
        for (int i = 0; i < sprites.length; i++) {
            sprites[i].update(canvas, deltaTime);
        }
    }

    private void render(GameCanvas canvas, Graphics g) {
        for (int i = 0; i < sprites.length; i++) {
            sprites[i].render(canvas, g);
        }

    }
}
