import java.awt.*;
import javax.swing.*;

/* <applet code="Q2" width=400 height=400></applet> */

public class Q2 extends JApplet{
    public void init(){
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        JButton btn = new JButton("Click or Hover", new ImageIcon("1.png"));

        btn.setPressedIcon(new ImageIcon("2.png"));
        btn.setRolloverIcon(new ImageIcon("3.png"));

        cp.add(btn);
    }
}