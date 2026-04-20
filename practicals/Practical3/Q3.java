import java.awt.*;
import javax.swing.*;

/*<applet code="Q3" width=400 height=400></applet> */

public class Q3 extends JApplet {
    public void init() {
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        JTabbedPane j = new JTabbedPane();
        j.addTab("Education", new EPanel());
        j.addTab("Branch", new BPanel());
        j.add("Language", new LPanel());

        cp.add(j, BorderLayout.CENTER);
    }
}

class EPanel extends JPanel {

    public EPanel() {
        JComboBox<String> jcb = new JComboBox<String>();
        jcb.addItem("B.Tech");
        jcb.addItem("Diploma");
        jcb.addItem("MBA");
        add(jcb);
    }
}

class BPanel extends JPanel {

    public BPanel() {
        JRadioButton r1 = new JRadioButton("AIML");
        JRadioButton r2 = new JRadioButton("IT");
        JRadioButton r3 = new JRadioButton("CM");
        JRadioButton r4 = new JRadioButton("ETX");

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);
    }
}

class LPanel extends JPanel {

    public LPanel() {
        JCheckBox c1 = new JCheckBox("Java");
        JCheckBox c2 = new JCheckBox("C");
        JCheckBox c3 = new JCheckBox("C++");
        JCheckBox c4 = new JCheckBox("Python");

        add(c1);
        add(c2);
        add(c3);
        add(c4);
    }
}