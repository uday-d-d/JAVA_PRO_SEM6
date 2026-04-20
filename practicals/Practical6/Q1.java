import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="Q1" width=400 height=500></applet> */

public class Q1 extends Applet implements KeyListener{
    public void init(){
        addKeyListener(this);
        setFocusable(true);
        requestFocus();
    }

    public void keyPressed(KeyEvent e){
        setBackground(Color.cyan);
        showStatus("cyan");
    }

    public void keyTyped(KeyEvent e){
        setBackground(Color.red);
        showStatus("Red");
    }

    public void keyReleased(KeyEvent e){
        setBackground(Color.green);
        showStatus("Green");
    }
}