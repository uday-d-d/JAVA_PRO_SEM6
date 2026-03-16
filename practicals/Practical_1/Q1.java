import java.applet.Applet;
import java.awt.*;

/*
<applet code="Q1.class" width=400 height=300>
</applet>
*/

public class Q1 extends Applet {

    Label lbName, lbClass, lbLang, lbGender;

    TextField txtName, txtClass;

    Checkbox c, cpp, java, python;
    Choice country;

    CheckboxGroup genderGroup;
    Checkbox cbMale, cbFemale;

    Button btnSubmit, btnCancel;

    public void init() {

        lbName = new Label("My Name:");
        lbClass = new Label("My Class:");
        lbLang = new Label("Programming Language Known:");
        lbGender = new Label("Gender:");

        txtName = new TextField();
        txtClass = new TextField();

        lbLang = new Label("Programming Language Known:");
        c = new Checkbox("C++");
        cpp = new Checkbox("C++");
        java = new Checkbox("Java");
        python = new Checkbox("Python");

        genderGroup = new CheckboxGroup();
        cbMale = new Checkbox("Male", genderGroup, false);
        cbFemale = new Checkbox("Female", genderGroup, false);

        country = new Choice();
        country.add("India");
        country.add("USA");
        country.add("UK");
        country.add("Australia");


        btnSubmit = new Button("Submit");
        btnCancel = new Button("Cancel");

        add(lbName);
        add(txtName);
        add(lbClass);
        add(txtClass);
        add(lbLang);
        add(c);
        add(cpp);
        add(java);
        add(python);
        add(lbGender);
        add(cbMale);
        add(cbFemale);
        add(btnSubmit);
        add(btnCancel);
    }
}