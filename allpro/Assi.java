import java.awt.*;

public class Assi extends Frame {
    public void paint(Graphics g){
        setForeground(Color.red);
        setBackground(Color.cyan);
        g.drawString("Welcome to Java AWT", 30, 70);
    }
    public static void main(String args[]) throws Exception{
        Assi a = new Assi();
        a.setSize(300,700);
        a.setTitle("Welcome");
        a.setVisible(true);
    }
}