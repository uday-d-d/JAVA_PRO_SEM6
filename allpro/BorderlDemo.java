import java.awt.*;
import java.applet.*;

/*
<applet code = "BorderlDemo" width = 300 height = 200>
</applet>
*/

public class BorderlDemo extends Applet{
    public void init(){
        BorderLayout bl = new BorderLayout();
        setLayout(bl);
        Button b1 = new Button("This the North");
        add(b1, BorderLayout.NORTH);

        Label l1 = new Label("This is South");  
        add(l1, BorderLayout.SOUTH);

        Label l2 = new Label("This is WEST");
        add(l2, BorderLayout.WEST);

        Label l3 = new Label ("This is EAST");
        add(l3, BorderLayout.EAST);

        String msg = "lporem ipsum dolor sit amet consectetur adipisicing elit. Voluptas, voluptate.";
        TextArea ta = new TextArea(msg);
        add(ta, BorderLayout.CENTER);

    }
}
