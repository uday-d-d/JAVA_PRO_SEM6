import java.awt.*;

public class assi3 extends Frame {
    public void paint(Graphics g) {
        setForeground(Color.cyan);
        setBackground(Color.yellow);
        g.drawString("This is Rectangle", 70, 130);
        g.drawRect(50, 50, 150, 100);
    }

    public static void main(String args[]) {
        assi3 f = new assi3();
        f.setTitle("This is Assignment 3");
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
