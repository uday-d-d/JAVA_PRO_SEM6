// Write a program to create a tabpane having 3 tabs Education tab has a combobox Branch tab has 4 radio button Language tab has 4 check box

import javax.swing.*;

/*
<applet code = "JTabbedDemo.class" width = 300 height = 200>
</applet>
*/
public class JTabbedDemo extends JApplet {
    public void init(){
        JTabbedPane jtp = new JTabbedPane();
        jtp.addTab("Education", new EduPanel());
        jtp.addTab("Branch", new BrPanel());
        jtp.addTab("Language", new LangPanel());
        getContentPane().add(jtp);
    }
}

class EduPanel extends JPanel{
    public EduPanel(){
        JComboBox jc = new JComboBox();
        jc.addItem("10th");
        jc.addItem("12th");
        jc.addItem("Diploma");
        jc.addItem("Graduation");
        add(jc);
    }
}

class BrPanel extends JPanel{
    public BrPanel(){
        JRadioButton r1 = new JRadioButton("IT");
        JRadioButton r2 = new JRadioButton("CME");
        JRadioButton r3 = new JRadioButton("ME");
        JRadioButton r4 = new JRadioButton("CE");
        add(r1);
        add(r2);
        add(r3);
        add(r4);
    }
}

class LangPanel extends JPanel{
    public LangPanel(){
        JCheckBox c1 = new JCheckBox("C",true);
        JCheckBox c2 = new JCheckBox("C++", false);
        JCheckBox c3 = new JCheckBox("Java", false);
        JCheckBox c4 = new JCheckBox("Go", false);
        add(c1);
        add(c2);
        add(c3);
        add(c4);
    }
}
