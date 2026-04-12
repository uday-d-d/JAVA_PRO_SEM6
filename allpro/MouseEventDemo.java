import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code = "MouseEventDemo.class" width = "300" height = "200"> 
</applet>
*/

public class MouseEventDemo extends Applet implements MouseListener, MouseMotionListener {
    String msg = " ";
    int mouseX=0, mouseY=0;

    public void init(){
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void mouseClicked(MouseEvent me){
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Mouse Clicked";
        repaint();
    }

    public void mouseEntered(MouseEvent me){
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Mouse Entered";
        repaint();
    }

    public void mouseExited(MouseEvent me){
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Mouse Exited";
        repaint();
    }

    public void mousePressed(MouseEvent me){
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Mouse Pressed";
        repaint();
    }

    public void mouseReleased(MouseEvent me){
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Mouse Released";
        repaint();
    }

    public void mouseDragged(MouseEvent me){
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "*";
        showStatus("Dragging mouse at " + me.getX() + "," + me.getY());
        repaint();
    }

    public void mouseMoved(MouseEvent me){
        mouseX = me.getX();
        mouseY = me.getY();
        showStatus("Moving mouse at" + me.getX() + "," + me.getY());
    }

    public void paint(Graphics g){
        g.drawString(msg, mouseX, mouseY);
    }
}
