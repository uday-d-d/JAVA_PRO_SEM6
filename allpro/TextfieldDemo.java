import java.awt.*;
import java.applet.*;

/*
<applet code = "TextfieldDemo" width = 300 height = 200>
</applet>
*/

public class TextfieldDemo extends Applet{
    TextField name, pass;
    String msg = "";

    public void init(){
        Label namep = new Label("Name", Label.RIGHT);
        Label passp = new Label("Pass", Label.RIGHT);

        name = new TextField("Uday",12);
        pass = new TextField(8);
        pass.setEchoChar('*');
        add(namep);
        add(name);
        add(passp);
        add(pass);
    }

    public void paint(Graphics g){
        msg = "Name:  "+ name.getText();
        msg += ", password : "+ pass.getText();
        g.drawString(msg,6,100);
    }
}
