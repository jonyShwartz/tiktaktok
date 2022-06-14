import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouseListener implements MouseListener {
private int counter = 0;
    private int counter1 = 0;
    private int counter2 = 0;
    private int counter3 = 0;
    private int counter4 = 0;
    private int counter5 = 0;
    private int counter6 = 0;
    private int counter7 = 0;
    private int counter8 = 0;
    private int counter9 = 0;
    private int place1x1 = 0;
    private int place1y1 = 0;
    private int place1x2 = 0;
    private int place1y2 = 0;
    private int place2x1 = 0;
    private int place2y1 = 0;
    private int place2x2 = 0;
    private int place2y2 = 0;
    private int place3x1 = 0;
    private int place3y1 = 0;
    private int place3x2 = 0;
    private int place3y2 = 0;
    private int place4x1 = 0;
    private int place4y1 = 0;
    private int place4x2 = 0;
    private int place4y2 = 0;
    private int place5x1 = 0;
    private int place5y1 = 0;
    private int place5x2 = 0;
    private int place5y2 = 0;
    private int place6x1 = 0;
    private int place6y1 = 0;
    private int place6x2 = 0;
    private int place6y2 = 0;
    private int place7x1 = 0;
    private int place7y1 = 0;
    private int place7x2 = 0;
    private int place7y2 = 0;
    private int place8x1 = 0;
    private int place8y1 = 0;
    private int place8x2 = 0;
    private int place8y2 = 0;
    private int place9x1 = 0;
    private int place9y1 = 0;
    private int place9x2 = 0;
    private int place9y2 = 0;



    private Panel panel;

    public MyMouseListener(Panel panel) {
        this.panel = panel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.counter++;
        System.out.println("mouseClicked" + e.getX() + " " + e.getY());
        Shapes shape = new Shapes(e.getX(),e.getY(),50,50,Color.BLACK);
        if (e.getX() > 75 && e.getX() < 192 && e.getY() >100 && e.getY() < 213 && counter %2 ==0 && counter1 == 0) {
            counter1++;
            panel.Black(e.getX(), e.getY());
           // panel.Blue(e.getX(), e.getY());
            place1x1 = 75;
            place1x2 = 192;
            place1y1 = 100;
            place1y2 = 213;
        }

        if (e.getX() > 75 && e.getX() < 192 && e.getY() >100 && e.getY() < 213 && counter %2 !=0 && counter1 ==0) {
            counter1++;
           // panel.Black(e.getX(), e.getY());
              panel.Blue(e.getX(), e.getY());
        }

        if (e.getX() > 207 && e.getX() < 304 && e.getY() >95 && e.getY() < 217 && counter %2 ==0 && counter2 == 0) {
            counter2 ++;
            panel.Black2(e.getX(), e.getY());
           // panel.Blue2(e.getX(), e.getY());
        }

        if (e.getX() > 207 && e.getX() < 304 && e.getY() >95 && e.getY() < 217 && counter %2 !=0 && counter2 == 0) {
            counter2++;
            // panel.Black2(e.getX(), e.getY());
            panel.Blue2(e.getX(), e.getY());
        }

        if (e.getX() > 319 && e.getX() < 434 && e.getY() >97 && e.getY() < 214 && counter %2 ==0 && counter3 == 0) {
            counter3++;
            panel.Black3(e.getX(), e.getY());
           // panel.Blue3(e.getX(), e.getY());
        }

        if (e.getX() > 319 && e.getX() < 434 && e.getY() >97 && e.getY() < 214 && counter %2 !=0 && counter3 == 0) {
            counter3++;
           // panel.Black3(e.getX(), e.getY());
              panel.Blue3(e.getX(), e.getY());
        }

        if (e.getX() > 74 && e.getX() < 190 && e.getY() >233 && e.getY() < 321 && counter %2 ==0 && counter4 == 0) {
           counter4++;
            panel.Black4(e.getX(), e.getY());
          //  panel.Blue4(e.getX(), e.getY());
        }

        if (e.getX() > 74 && e.getX() < 190 && e.getY() >233 && e.getY() < 321 && counter %2 !=0 && counter4 == 0) {
            counter4++;
            //panel.Blue4(e.getX(), e.getY());
              panel.Blue4(e.getX(), e.getY());
        }

        if (e.getX() > 209 && e.getX() < 303 && e.getY() >231 && e.getY() < 324 && counter %2 ==0 && counter5 == 0) {
            counter5++;
            panel.Black5(e.getX(), e.getY());
          //  panel.Blue5(e.getX(), e.getY());
        }

        if (e.getX() > 209 && e.getX() < 303 && e.getY() >231 && e.getY() < 324 && counter %2 !=0 && counter5 == 0) {
           counter5++;
            //panel.Black5(e.getX(), e.getY());
              panel.Blue5(e.getX(), e.getY());
        }

        if (e.getX() > 317 && e.getX() < 436 && e.getY() >231 && e.getY() < 326 && counter %2 ==0 && counter6 == 0) {
            counter6++;
            panel.Black6(e.getX(), e.getY());
        //    panel.Blue6(e.getX(), e.getY());
        }

        if (e.getX() > 317 && e.getX() < 436 && e.getY() >231 && e.getY() < 326 && counter %2 !=0 && counter6 == 0) {
           counter6++;
            // panel.Blue6(e.getX(), e.getY());
                panel.Blue6(e.getX(), e.getY());
        }

        if (e.getX() > 74 && e.getX() < 194 && e.getY() >342 && e.getY() < 462 && counter %2 ==0 && counter7 == 0) {
           counter7++;
            panel.Black7(e.getX(), e.getY());
          //  panel.Blue7(e.getX(), e.getY());
        }

        if (e.getX() > 74 && e.getX() < 194 && e.getY() >342 && e.getY() < 462 && counter %2 !=0 && counter7 == 0) {
          counter7++;
           // panel.Black7(e.getX(), e.getY());
              panel.Blue7(e.getX(), e.getY());
        }

        if (e.getX() > 208 && e.getX() < 303 && e.getY() >342 && e.getY() < 459 && counter %2 ==0 && counter8 == 0) {
           counter8++;
            panel.Black8(e.getX(), e.getY());
         //   panel.Blue8(e.getX(), e.getY());
        }

        if (e.getX() > 208 && e.getX() < 303 && e.getY() >342 && e.getY() < 459 && counter %2 !=0 && counter8 == 0) {
           counter8++;
            // panel.Blue8(e.getX(), e.getY());
               panel.Blue8(e.getX(), e.getY());
        }

        if (e.getX() > 318 && e.getX() < 430 && e.getY() >342 && e.getY() < 454 && counter %2 ==0&& counter9 == 0) {
            counter9++;
            panel.Black9(e.getX(), e.getY());
         //   panel.Blue9(e.getX(), e.getY());
        }

        if (e.getX() > 318 && e.getX() < 430 && e.getY() >342 && e.getY() < 454 && counter %2 !=0 && counter9 == 0) {
           counter9++;
            // panel.Black9(e.getX(), e.getY());
              panel.Blue9(e.getX(), e.getY());
        }

        panel.repaint();

        if(counter1 != 0 && counter2 != 0 && counter3 != 0 && counter4 != 0 && counter5 != 0 && counter6 != 0 && counter7 != 0 && counter8 != 0 && counter9 != 0){
       NoWinnerPanel panel = new NoWinnerPanel();
        }


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
