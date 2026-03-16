import java.awt.*;
import java.applet.*;

/*
<applet code = "ScrollbarDemo" width = 300 height = 200>
</applet>
*/

public class ScrollbarDemo extends Applet{
    String msg = "";
    Scrollbar vertSB, horSB;

    public void init(){
        vertSB = new Scrollbar(Scrollbar.VERTICAL,0,1,0,100);
        horSB = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 200);
        add(vertSB);
        add(horSB); 
    }
    public void paint(Graphics g){
        msg = "vertocal : " + vertSB.getValue();
        msg += ", Horizontal : " + horSB.getValue();
        g.drawString(msg, 6, 100);
    }
}
