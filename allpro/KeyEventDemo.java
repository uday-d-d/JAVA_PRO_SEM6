import java.awt.*;
import java.awt.event.*;
import java.applet.*; 

/*
<applet code = "KeyEventDemo.class" width = "300" height = "200">
</applet>
*/

public class KeyEventDemo extends Applet implements KeyListener {
    String msg = " ";
    int X = 10, Y = 20;

    public void init(){
        addKeyListener(this);
        requestFocus();
    }

    public void keyPressed(KeyEvent ke){
        showStatus("Key Pressed");
    }

    public void keyReleased(KeyEvent ke){
        showStatus("Key Released");
    }

    public void keyTyped(KeyEvent ke){
        msg += ke.getKeyChar();
        showStatus("Key Typed");
    }

    public void paint(Graphics g){
        g.drawString(msg, X, Y);
    }
}
