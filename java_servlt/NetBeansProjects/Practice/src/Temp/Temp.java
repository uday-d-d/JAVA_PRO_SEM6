
package Temp;

/**
 *
 * @author sivya
 */
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="Temp.class" width="600" height="700"></applet>*/
public class Temp extends Applet implements ActionListener {
    
    TextField t1 , t2 , t3;
    public void init()
    {
       t1 = new TextField();
         t2 = new TextField();
        t3 = new TextField();
        add(t1);
        add(t2);
        add(t3);
        Button b1 = new Button("add");
        Button b2 = new Button("sub");
        b1.addActionListener(this);
          b2.addActionListener(this);
        add(b1);
        add(b2);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        int a = Integer.parseInt(t1.getText());
        int b= Integer.parseInt(t2.getText());
       String ms = ae.getActionCommand();
       if(ms.equals("add"))
       {t3.setText(" " +(a+b));
       
       }
       
       else if (ms.equals("sub"))
       {
           t3.setText(" "+ (a-b));
    }
}}