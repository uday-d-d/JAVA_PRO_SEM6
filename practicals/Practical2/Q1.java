import java.awt.*;
import java.applet.*;

/*<applet code="Q1" width=400 height=400></applet>*/

public class Q1 extends Applet{
	Button b1, b2;
	List list;
	Label l1, l2;

	public void init(){
		BorderLayout bl = new BorderLayout();
		setLayout(bl);

		b1 = new Button("IT");
		add(b1, BorderLayout.NORTH);

		b2 = new Button("Button");
		add(b2, BorderLayout.SOUTH);

		l1 = new Label("Hello");
		add(l1, BorderLayout.WEST);

		l2 = new Label("Sir");
		add(l2, BorderLayout.EAST);

		list = new List(2);
		list.add("IT");
		list.add("AIML");
		list.add("ME");
		add(list, BorderLayout.CENTER);

	}
}
