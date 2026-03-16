import java.awt.*;
import java.applet.*;

/*
<applet code="ButtonDemo.class" width="300" height="200">
</applet>
*/

public class ButtonDemo extends Applet{
    public void paint(Graphics g){
        g.drawString("Buttons are here", 6, 100);
    }

    Button yes, no, maybe;
    public void init(){
        yes = new Button("Yes");
        no = new Button("No");
        maybe = new Button("Maybe");
        add(yes);
        add(no);
        add(maybe);
    }
    
}

// javac ButtonDemo.java
// appletviewer ButtonDemo.java