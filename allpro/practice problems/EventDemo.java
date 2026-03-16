import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code = "EventDemo" width = 300 height = 300></applet> */

public class EventDemo extends Applet implements ActionListener {
    Button b1, b2, b3;
    
    public void init(){
        Button b1 = new Button("Blue");
        Button b2 = new Button("Red");
        Button b3 = new Button("Green");
        add(b1);
        add(b2);
        add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        String str = e.getActionCommand();
        if(str.equals ("Blue")){
            setBackground(Color.blue);
        }
        else if(str.equals("Red")){
            setBackground(Color.red);
        }
        else if(str.equals("Green")){
            setBackground(Color.green);
        }
    }
    
}
