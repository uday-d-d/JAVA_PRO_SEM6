import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="Q3" width=400 height=400></applet> */

public class Q3 extends Applet{
    String msg = "";

    public void init(){
        addKeyListener(new MyAdapter());
        requestFocus();
    }

    class MyAdapter extends KeyAdapter{
        public void keyPressed(KeyEvent e){
            showStatus("Key Pressed");
            
            char key = e.getKeyChar();
            msg += key;
            repaint();
        }

        public void keyReleased(KeyEvent e){
            showStatus("Key Released");
        }
    }


    public void paint(Graphics g){
        g.drawString(msg, 20, 100);
    }
}