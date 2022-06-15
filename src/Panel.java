import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    public static final int Window_Width = 500;
    public static final int Window_Height = 500;

    public ImageIcon background;
    private Shapes rec;
    private ShapesBlack recBlack;
    private Shapes rec2;
    private ShapesBlack recBlack2;
    private Shapes rec3;
    private ShapesBlack recBlack3;
    private Shapes rec4;
    private ShapesBlack recBlack4;
    private Shapes rec5;
    private ShapesBlack recBlack5;
    private Shapes rec6;
    private ShapesBlack recBlack6;
    private Shapes rec7;
    private ShapesBlack recBlack7;
    private Shapes rec8;
    private ShapesBlack recBlack8;
    private Shapes rec9;
    private ShapesBlack recBlack9;


    public Panel(String strImage) {
        this.setBounds(0, 0, Window_Width, Window_Height);
        this.setLayout(null);
        this.setVisible(true);
        this.setBackground(Color.blue);
        this.background = new ImageIcon(strImage);

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
        if (this.rec2 != null) {
            this.rec2.paint(g);
        }
        if (this.recBlack2 != null) {
            this.recBlack2.paint(g);
        }
        if (this.rec3 != null) {
            this.rec3.paint(g);
        }
        if (this.recBlack3 != null) {
            this.recBlack3.paint(g);
        }
        if (this.rec4 != null) {
            this.rec4.paint(g);
        }
        if (this.recBlack4 != null) {
            this.recBlack4.paint(g);
        }
        if (this.rec5 != null) {
            this.rec5.paint(g);
        }
        if (this.recBlack5 != null) {
            this.recBlack5.paint(g);
        }
        if (this.rec6 != null) {
            this.rec6.paint(g);
        }
        if (this.recBlack6 != null) {
            this.recBlack6.paint(g);
        }
        if (this.rec7 != null) {
            this.rec7.paint(g);
        }
        if (this.recBlack7 != null) {
            this.recBlack7.paint(g);
        }
        if (this.rec8 != null) {
            this.rec8.paint(g);
        }
        if (this.recBlack8 != null) {
            this.recBlack8.paint(g);
        }
        if (this.rec9 != null) {
            this.rec9.paint(g);
        }
        if (this.recBlack9 != null) {
            this.recBlack9.paint(g);
        }
    }

    public void Black(double x, double y) {
        this.rec = new Shapes (132 - 20,148 - 20,20,20,Color.BLACK);

    }

    public void Blue(double x, double y) {
        this.recBlack = new ShapesBlack (132 - 20,148 - 20,20,20,Color.blue);

    }

    public void Black2(double x, double y) {
        this.rec2 = new Shapes (253 - 20,146 - 20,20,20,Color.BLACK);

    }

    public void Blue2(double x, double y) {
        this.recBlack2 = new ShapesBlack (253 - 20,146 - 20,20,20,Color.blue);

    }

    public void Black3(double x, double y) {
        this.rec3 = new Shapes (371 - 20,155 - 20,20,20,Color.BLACK);

    }

    public void Blue3(double x, double y) {
        this.recBlack3 = new ShapesBlack (371 - 20,155 - 20,20,20,Color.blue);

    }

    public void Black4(double x, double y) {
        this.rec4 = new Shapes (134 - 20,274 - 20,20,20,Color.BLACK);

    }

    public void Blue4(double x, double y) {
        this.recBlack4 = new ShapesBlack (134 - 20,274 - 20,20,20,Color.blue);

    }

    public void Black5(double x, double y) {
        this.rec5 = new Shapes (254 - 20,275 - 20,20,20,Color.BLACK);

    }

    public void Blue5(double x, double y) {
        this.recBlack5 = new ShapesBlack (254 - 20,275 - 20,20,20,Color.blue);

    }

    public void Black6(double x, double y) {
        this.rec6 = new Shapes (370 - 20,278 - 20,20,20,Color.BLACK);

    }

    public void Blue6(double x, double y) {
        this.recBlack6 = new ShapesBlack (370 - 20,278 - 20,20,20,Color.blue);

    }

    public void Black7(double x, double y) {
        this.rec7 = new Shapes (132 - 20,397 - 20,20,20,Color.BLACK);

    }

    public void Blue7(double x, double y) {
        this.recBlack7 = new ShapesBlack (132 - 20,397 - 20,20,20,Color.blue);

    }

    public void Black8(double x, double y) {
        this.rec8 = new Shapes (257 - 20,400 - 20,20,20,Color.BLACK);

    }

    public void Blue8(double x, double y) {
        this.recBlack8 = new ShapesBlack (257 - 20,400 - 20,20,20,Color.blue);

    }

    public void Black9(double x, double y) {
        this.rec9 = new Shapes (376 - 20,403 - 20,20,20,Color.BLACK);

    }

    public void Blue9(double x, double y) {
        this.recBlack9 = new ShapesBlack (376 - 20,403 - 20,20,20,Color.blue);

    }




    public void mainGameLoop() {
        Thread thred = new Thread(() -> {
        });
        thred.start();
    }


}
