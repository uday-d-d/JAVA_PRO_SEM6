import java.awt.*;
import java.applet.*;

/*
<applet code = "CheckboxgpDemo" width = 300 height = 200>
</applet>
*/

public class CheckboxgpDemo extends Applet{
    String msg = "";
    Checkbox win98, winNT, solaris, mac;
    CheckboxGroup cbg;

    public void init(){
        cbg = new CheckboxGroup();
        win98 = new Checkbox("Window 98",cbg,true);
        winNT = new Checkbox("Window NT", cbg, false);
        solaris = new Checkbox("Solaris", cbg, false);
        mac = new Checkbox("MacOS", cbg, false);

        add(win98);
        add(winNT);
        add(solaris);
        add(mac);
    }
    public void paint(Graphics g){
        msg = "Current selected: ";
        msg += cbg.getSelectedCheckbox().getLabel();
        g.drawString(msg, 6,100);
    }
}
