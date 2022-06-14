import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouseListener implements MouseListener {

    private Panel panel;

    public MyMouseListener(Panel panel) {
        this.panel = panel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("mouseClicked" + e.getX());
        Shapes shape = new Shapes(e.getX(),e.getY(),50,50,Color.BLACK);
        panel.Black(e.getX(),e.getY());
        panel.Blue(e.getX(),e.getY());

        panel.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("mousePressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
