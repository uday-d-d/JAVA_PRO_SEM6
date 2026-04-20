import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<Applet code="Q3.class" width=400 height=400></Applet> */

public class Q3 extends Applet implements ActionListener{
    Label name, pass, gender, lang, programLan;
    TextField nameText, passText;
    Checkbox male, female;
    CheckboxGroup cbg;
    Checkbox c, cpp, java, python;
    List pkList;
    Button submit, reset;
    String n="", g="", l="", plang="";
    public void init(){
        name = new Label("Name: ");
        nameText = new TextField(20);
        add(name);
        add(nameText);

        pass = new Label("Password: ");
        passText = new TextField(20);
        passText.setEchoChar('$');
        add(pass);
        add(passText);

        gender = new Label("Gender: ");
        male = new Checkbox("Male", cbg, true);
        female = new Checkbox("Female", cbg, false);
        add(gender);
        add(male);
        add(female);

        lang = new Label("Language known: ");
        c = new Checkbox("C");
        cpp = new Checkbox("C++");
        java = new Checkbox("Java");
        python = new Checkbox("Python");
        add(lang);
        add(c);
        add(cpp);
        add(java);
        add(python);

        programLan = new Label("Programming Language Known: ");
        pkList = new List(2, true);
        pkList.add("Java");
        pkList.add("Advance Java");
        pkList.add("Rubby");
        pkList.add("PHP");
        pkList.add("JavaScript");
        add(programLan);
        add(pkList);

        submit = new Button("Submit");
        reset = new Button("Reset");
        add(submit);
        add(reset);

        submit.addActionListener(this);
        reset.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == reset) {
            removeAll();
            init();
            repaint();
        }
    }
}

