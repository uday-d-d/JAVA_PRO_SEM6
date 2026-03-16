import java.awt.*;
import java.awt.event.*;

class CardlDemo extends Frame implements ActionListener{
    CardLayout card = new CardLayout(20,20);
    CardlDemo(){
        setLayout(card);
        Button b1 = new Button("First");
        b1.setBackground(Color.red);

        Button b2 = new Button("second");
        b2.setBackground(Color.green);

        Button b3 = new Button("Third");
        b3.setBackground(Color.yellow);

        add(b1, "Card 1");
        add(b2, "Card 2");
        add(b3, "Card 3");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        card.next(this);
    }
}

class CardLayoutExample{
    public static void main(String args[]){
        CardlDemo frame = new CardlDemo();
        frame.setTitle("Card Layout");
        frame.setSize(300,200);
        frame.setVisible(true);
    }
}