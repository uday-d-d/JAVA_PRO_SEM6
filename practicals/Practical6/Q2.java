import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code="Q2" width=400 height=400></applet> */

public class Q2 extends Applet implements ActionListener{
    Label l1, l2, l3;
    TextField t1,t2, t3;
    Button b1, b2, b3, b4;

    public void init(){
        l1 = new Label("Number 1: ");
        l2 = new Label("Number 1: ");
        l3 = new Label("Result: ");
        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);

        b1 = new Button("ADD");
        b2 = new Button("SUB");
        b3 = new Button("MUL");
        b4 = new Button("DIV");

        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(b1); add(b2);
        add(b3); add(b4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        String str = e.getActionCommand();

        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());

        if(str.equals("ADD"))
            t3.setText(""+ (a+b));
        else if(str.equals("SUB"))
            t3.setText(""+ (a-b));
        else if(str.equals("MUL"))
            t3.setText(""+ (a*b));
        else if(str.equals("DIV"))
            t3.setText(""+ (a/b));
    }
}