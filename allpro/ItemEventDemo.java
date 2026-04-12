import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code = "ItemEventDemo.class" width = "300" height = "200">
</applet>
*/

public class ItemEventDemo extends Applet implements ItemListener{
    String msg = " ";
    Checkbox win98, winnt, solaris, mac;

    public void init(){
        win98 = new Checkbox("Windows 98/XP", null, true);
        winnt = new Checkbox("Windows NT/2000");
        solaris = new Checkbox("Solaris");
        mac = new Checkbox("MacOS");

        add(win98);
        add(winnt);
        add(solaris);
        add(mac);

        win98.addItemListener(this);
        winnt.addItemListener(this);
        solaris.addItemListener(this);
        mac.addItemListener(this);

    }

    public void itemStateChanged(ItemEvent ie){
        repaint();
    }

    public void paint(Graphics g){
        msg = "Cureent State : ";
        g.drawString(msg, 6, 80);
        
        msg = "Windows 98/XP : " + win98.getState();
        g.drawString(msg, 6,100);

        msg = "Windows NT/2000: " + winnt.getState();
        g.drawString(msg, 6,120);

        msg = "Solaris: " + solaris.getState();
        g.drawString(msg, 6, 140);

        msg = "MacOS: " + mac.getState();
        g.drawString(msg, 6, 160);
    }
}
