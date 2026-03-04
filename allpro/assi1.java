//Assignment 1: Create a Frame window using AWT and display a message "Welcome to java AWT" in it.
import java.awt.*;

public class assi1 extends Frame {
    public void paint(Graphics g) {
        g.drawString("Welcome to Java AWT", 50, 100);
    }

    public static void main(String args[]) {
        assi1 f = new assi1();
        f.setTitle("This is Assignment 1 of Frame");
        f.setSize(300, 200);
        f.setVisible(true);
    }
}