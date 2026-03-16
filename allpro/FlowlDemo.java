import java.awt.*;
import java.applet.*;

/*
<applet code = "FlowlDemo" width = 300 height = 200>
</applet>
*/

public class FlowlDemo extends Applet{
    Checkbox window,solaris,mac,kali,ubuntu;

    public void init(){
        window = new Checkbox("Windows",true);
        solaris = new Checkbox("solaris");
        mac = new Checkbox("mac");
        ubuntu = new Checkbox("ubuntu");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(window);
        add(solaris);
        add(mac);
        add(ubuntu);
    }
    
}
