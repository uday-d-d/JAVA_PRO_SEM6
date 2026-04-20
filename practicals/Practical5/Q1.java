import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="Q1" width=400 height=400></applet>*/

public class Q1 extends Applet implements ActionListener{
    TextField t1, t2, t3;
    Button add;

    public void init(){
        add(new Label("NO. 1: "));
        t1 = new TextField(10);
        add(t1);

        add(new Label("No. 2: "));
        t2 = new TextField(10);
        add(t2);

        add(new Label("Result: "));
        t3 = new TextField(10);
        add(t3);
        
        add = new Button("Add");
        add(add);

        add.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());

        int result = num1 + num2 ;
        t3.setText(String.valueOf(result));
        repaint();
    }
}