import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

/*
<applet code = "Q3.class" width = 400 height = 300>
</applet>
*/

public class Q3 extends Applet implements ActionListener {
    Label l1, l2, l3, l4, l5;
    TextField t1, t2;
    Checkbox male, female;
    CheckboxGroup ch;

    Checkbox c, cpp, java, python;
    List programknown;
    Button submit, reset;

    String msg = "", name = " ", gender = "", languageKnown = "", program = "";

    public void init(){
        l1 = new Label("Name: ");
        t1 = new TextField(20);
        add(l1);
        add(t1);

        l2 = new Label("Password: ");
        t2 = new TextField(10);
        t2.setEchoChar('*');
        add(l2);
        add(t2);

        l3 = new Label("Gender: ");
        ch = new CheckboxGroup();
        male = new Checkbox("Male", ch, false);
        female = new Checkbox("Female", ch, false);
        add(l3);
        add(male);
        add(female);

        l4 = new Label("Language Known: ");
        c = new Checkbox("C");
        cpp = new Checkbox("C++");
        java = new Checkbox("Java");
        python = new Checkbox("Python");
        add(l4);
        add(c);
        add(cpp);
        add(java);
        add(python);

        l5 = new Label("Program Known: ");
        programknown = new List(4,true);
        programknown.add("Java");
        programknown.add("Adv Java");
        programknown.add("Golang");
        programknown.add("Kotlin");
        programknown.add("Rush");
        add(l5);
        add(programknown);

        submit = new Button("Submit");
        reset = new Button("Reset");
        add(submit);
        add(reset);
        submit.addActionListener(this);
        reset.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == submit){
            name = "Name : " + t1.getText();
            gender = "Gender : " + ch.getSelectedCheckbox().getLabel();
            languageKnown = "Language Known : ";

            if(c.getState()){
                languageKnown += c.getLabel() + " ";
            }
            if(cpp.getState()){
                languageKnown += cpp.getLabel() + " ";
            }
            if(java.getState()){
                languageKnown += java.getLabel() + " ";
            }
            if(python.getState()){
                languageKnown += python.getLabel() + " ";
            }
            program = "Program Known : " +  Arrays.toString(programknown.getSelectedItems());
            repaint();
        }

        if(e.getSource() == reset){
            msg = "Cleared!";
            t1.setText("");
            t2.setText("");
            ch.setSelectedCheckbox(null);
            c.setState(false);
            cpp.setState(false);
            java.setState(false);
            python.setState(false);
            int[] selectedPrograms = programknown.getSelectedIndexes();
            for (int index : selectedPrograms) {
                programknown.deselect(index);
            }
            name = gender = languageKnown = program = "";
            repaint();
        }
    }

    public void paint(Graphics g){
        g.drawString(name, 6, 120);
        g.drawString(gender, 6, 140);
        g.drawString(languageKnown, 6, 160);
        g.drawString(program, 6, 180);
    }
}