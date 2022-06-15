import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{

    public static final int Window_Width = 500;
    public static final int Window_Height = 500;

    public Main(String str) {
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(Window_Width,Window_Height);
        Panel panel = new Panel(str);
        this.add(panel);
        MyMouseListener myMouseListener = new MyMouseListener(panel);
        this.addMouseListener(myMouseListener);
        this.setVisible(true);


    }



    public static void main(String[] args) {
 Main window = new Main("download.png");
    }

}
