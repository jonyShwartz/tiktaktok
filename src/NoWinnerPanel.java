import javax.swing.*;
import java.awt.*;

public class NoWinnerPanel extends JPanel {

    public static final int Window_Width = 500;
    public static final int Window_Height = 500;
    private ImageIcon background;

    public NoWinnerPanel() {
        this.setBounds(0, 0, Window_Width, Window_Height);
        this.setLayout(null);
        this.setVisible(true);
        this.setBackground(Color.RED);
        this.background = new ImageIcon("download (8).jpg2.jpg");

    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.background.paintIcon(this, g, 0, 0);


    }
}
