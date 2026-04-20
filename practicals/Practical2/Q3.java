import java.awt.*;
import java.awt.event.*;

class Q3 extends Frame implements ActionListener{
	CardLayout cl;
	Panel mainPanel;
	Button b1, b2, b3;

	Q3(){
		cl = new CardLayout();
		mainPanel = new Panel();
		mainPanel.setLayout(cl);

		Panel card1 = new Panel ();
		card1.add(new Label("This is card 1"));
		card1.setBackground(Color.CYAN);

		Panel card2 = new Panel();
		card2.add(new Label("This is card 2"));
		card2.setBackground(Color.ORANGE);

		mainPanel.add(card1, "card1");
		mainPanel.add(card2, "card2");

		b1 = new Button("Show card 1");
		b2 = new Button("Show Card 2");

		b1.addActionListener(this);
		b2.addActionListener(this);

		add(mainPanel, BorderLayout.CENTER);

		Panel buttonPanel = new Panel();
		buttonPanel.add(b1);
		buttonPanel.add(b2);
		add(buttonPanel, BorderLayout.SOUTH);

		setVisible(true);
		setSize(500, 500);
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == b1)
			cl.show(mainPanel, "card1");
		else
			cl.show(mainPanel, "card2");
	}

	public static void main(String[] args){
		new Q3();
	}
}
