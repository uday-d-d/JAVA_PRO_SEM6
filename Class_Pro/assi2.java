//
import java.awt.*;

public class assi2 extends Frame{
    public void paint(Graphics g){
        setForeground(Color.blue);
        setBackground(Color.yellow);
        g.drawString("Colorful Frame", 50, 100);
    }

    public static void main(String args[]){
        assi2 f = new assi2();
        f.setTitle("This is Assignment 2");
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
