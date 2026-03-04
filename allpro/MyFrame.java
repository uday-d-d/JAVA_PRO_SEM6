import java.awt.*;

public class MyFrame extends Frame {
    public void paint(Graphics g){
        setForeground(Color.red);
        setBackground(Color.cyan);
        g.drawString("This is in Frame Window", 30,70);

    }
    public static void main(String args[]) throws Exception{
        MyFrame f = new MyFrame();
        f.setSize(300,200);
        f.setVisible(true);
        f.setTitle("A Frame window");
    }
}