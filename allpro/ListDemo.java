import java.awt.*;
import java.applet.*;

/*
<applet code = "ListDemo" width=300 height=300>
</applet>*/

public class ListDemo extends Applet{
    String msg = "";
    List os, browser;

    public void init(){
        os = new List(4,true);
        browser = new List(4,false);

        os.add("win98");
        os.add("winNT/2000");

        browser.add("Chrome");
        browser.add("Brave");

        add(os);
        add(browser);
    }
    public void paint(Graphics g){
        msg = "Current Selected";
        int idx[];
        idx = os.getSelectedIndexes();
        for(int i=0; i < idx.length; i++){
            msg += os.getItem(idx[i])+" ";
            g.drawString(msg, 6,100);
        }
        msg = "Current Browser";
        msg += browser.getSelectedItem();
        g.drawString(msg, 6, 100);
    }
}
