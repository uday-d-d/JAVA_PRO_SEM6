import javax.swing.*;;
import java.awt.*;

/*<applet code="Q1" width=400 height=400></applet> */

public class Q1 extends JApplet{
    public void init(){
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        cp.add(new JLabel("My Info", new ImageIcon("1.png"), JLabel.CENTER));

        cp.add(new JLabel("Name"));
        cp.add(new JTextField("Enter Your Name ", 20));

        cp.add(new JCheckBox("IT", new ImageIcon("2.png")));

        cp.add(new JButton("Submit", new ImageIcon("3.png")));

        cp.add(new JButton("Cancel", new ImageIcon("1.png")));

    }
}