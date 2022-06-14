import java.awt.*;

public class Shapes {
    private double x;
    private double y;
    private int width;
    private int height;
    private Color color;
    public Shapes(double x, double y, int width, int height,Color color){
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
            this.color = color;
    }

    public void paint(Graphics graphics) {
        graphics.setColor(this.color.black);
        graphics.fillRect((int)this.x, (int)this.y, this.width, this.height);
    }

}
