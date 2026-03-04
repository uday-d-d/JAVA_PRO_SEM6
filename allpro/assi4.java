import java.awt.*;

public class assi4 extends Frame {
    public void paint(Graphics g){
        g.drawLine(100,50,200,50);
        g.drawOval(50,80,120,150);
    }

    public static void main(String args[]){
        assi4 f = new assi4();
        f.setTitle("This is Assignment 4");
        f.setSize(400,300);
        f.setVisible(true);
    }
}
