import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    public static final int Window_Width = 500;
    public static final int Window_Height = 500;

    private ImageIcon background;
    private Shapes rec;
    private ShapesBlack recBlack;

    public Panel() {
        this.setBounds(0, 0, Window_Width, Window_Height);
        this.setLayout(null);
        this.setVisible(true);
        this.setBackground(Color.RED);
        this.background = new ImageIcon("download.png");

    }

    protected  void paintComponent(Graphics g){
        super.paintComponent(g);
        this.background.paintIcon(this, g, 0, 0);
        if (this.rec != null) {
            this.rec.paint(g);
        }
        if (this.recBlack != null) {
            this.recBlack.paint(g);
        }
    }

    public void Black(double x, double y) {
        this.rec = new Shapes (x - 20,y - 20,20,20,Color.BLACK);

    }

    public void Blue(double x, double y) {
        this.recBlack = new ShapesBlack (x - 20,y - 20,20,40,Color.blue);

    }

    public void mainGameLoop() {
        Thread thred = new Thread(() -> {
        });
        thred.start();
    }


}
