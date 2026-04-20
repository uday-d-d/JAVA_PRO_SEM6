import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code="Q2" width=400 height=300></applet> */

public class Q2 extends Applet implements ActionListener {
	Button b1, b2, b3;

	public void init(){
		b1 = new Button("Red");
		b2 =  new Button("Blue");
		b3 = new Button("Green");

		add(b1);
	    add(b2);
		add(b3);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == b1){
			setBackground(Color.red); 
		}
		else if(e.getSource() == b2){
		    setBackground(Color.blue);
		}
		else if(e.getSource() == b3){
			setBackground(Color.green);
		}
		else{
			setBackground(Color.white);
		}
	}

}
