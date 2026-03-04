import java.awt.*;
import java.applet.*;

/*
<applet code="ButtonDemo.class" width="300" height="200">
</applet>
*/

public class ButtonDemo extends Applet{
    String msg = "";

    Button yes, no, maybe;
    public void init(){
        yes = new Button("Yes");
        no = new Button("No");
        maybe = new Button("Maybe");
        add(yes);
        add(no);
        add(maybe);
    }
    public void paint(Graphics g){
        g.drawString(msg, 6, 100);
    }
}

// javac ButtonDemo.java
// appletviewer ButtonDemo.java