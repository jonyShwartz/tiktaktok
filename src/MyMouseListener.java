import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouseListener implements MouseListener {
private int counter = 0;

    private Panel panel;

    public MyMouseListener(Panel panel) {
        this.panel = panel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.counter++;
        System.out.println("mouseClicked" + e.getX());
        Shapes shape = new Shapes(e.getX(),e.getY(),50,50,Color.BLACK);
        if (counter == 1) {
            panel.Black(e.getX(), e.getY());
           // panel.Blue(e.getX(), e.getY());
        }

        if (counter == 2) {
           // panel.Black2(e.getX(), e.getY());
            panel.Blue2(e.getX(), e.getY());
        }

        if (counter == 3) {
            panel.Black3(e.getX(), e.getY());
           // panel.Blue3(e.getX(), e.getY());
        }

        if (counter == 4) {
            panel.Blue4(e.getX(), e.getY());
          //  panel.Blue4(e.getX(), e.getY());
        }

        if (counter == 5) {
            panel.Black5(e.getX(), e.getY());
          //  panel.Blue5(e.getX(), e.getY());
        }

        if (counter == 6) {
            panel.Blue6(e.getX(), e.getY());
        //    panel.Blue6(e.getX(), e.getY());
        }

        if (counter == 7) {
            panel.Black7(e.getX(), e.getY());
          //  panel.Blue7(e.getX(), e.getY());
        }

        if (counter == 8) {
            panel.Blue8(e.getX(), e.getY());
         //   panel.Blue8(e.getX(), e.getY());
        }

        if (counter == 9) {
            panel.Black9(e.getX(), e.getY());
         //   panel.Blue9(e.getX(), e.getY());
        }

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
