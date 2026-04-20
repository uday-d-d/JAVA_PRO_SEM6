import java.awt.*;
import javax.swing.*;

/*<applet code="Q4" width=400 height=400></applet>*/

public class Q4 extends JApplet{
    public void init(){                                         
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 3, 4, 5));            

        ButtonGroup bg = new ButtonGroup();

        for(int i=1; i<=300; i++){
            JRadioButton rb = new JRadioButton("Button"+i);
            bg.add(rb);
            panel.add(rb);                                     
        }

        JScrollPane sp = new JScrollPane(panel, 
            JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
            JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        add(sp, BorderLayout.CENTER);
    }
}