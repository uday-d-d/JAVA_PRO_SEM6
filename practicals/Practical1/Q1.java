import java.awt.*;
import java.applet.*;

/*<applet code="Q1" width=400 height=500></applet> */

public class Q1 extends Applet{
    Label name, student_class, language, gender, country;
    TextField nameText, classText;
    Checkbox c, cpp, java, python;
    Checkbox male, female;
    CheckboxGroup cbg;
    Choice countryCh;
    Button submit, clear;

    public void init(){
        name =new  Label("My Name: ");
        nameText = new TextField(20);

        student_class = new Label("My class: ");
        classText = new TextField(20);

        language = new Label("Programming Language: ");
        c = new Checkbox("C");
        cpp = new Checkbox("C++");
        java = new Checkbox("Java");
        python = new Checkbox("Python");

        gender = new Label("Gender : ");
        cbg = new CheckboxGroup();
        male = new Checkbox("Male", cbg, true);
        female = new Checkbox("Female", cbg, true);

        country = new Label("Country: ");
        countryCh = new Choice();
        countryCh.add("India");
        countryCh.add("UK");
        countryCh.add("USA");
        countryCh.add("Russia");

        submit = new Button("Submit");
        clear = new Button("Clear");

        add(name);
        add(nameText);

        add(student_class);
        add(classText);

        add(language);
        add(c);
        add(cpp);
        add(java);
        add(python);

        add(gender);
        add(male);
        add(female);

        add(country);
        add(countryCh);

        add(submit);
        add(clear);
    }
}