import java.awt.*;
import java.applet.*;

/*
<applet code="CheckBoxDemo" width=500 height=200>
</applet>
*/

public class CheckBoxDemo extends Applet {
    String msg = "";
    Checkbox win98, winNT, solaris, mac;

    public void init(){
        win98 = new Checkbox("Windows 98/XP", null, true);
        winNT = new Checkbox("Windows NT/2000");
        solaris = new Checkbox("Solaris");
        mac = new Checkbox("MacOS");
        add(win98);
        add(winNT);
        add(solaris);
        add(mac);
    }

    public void paint(Graphics g){

    }
}
