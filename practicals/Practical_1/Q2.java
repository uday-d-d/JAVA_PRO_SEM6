import java.awt.*;
import java.applet.*;

/*
<applet code = "Q2.class" width = 400 height = 300>
</applet>
*/

public class Q2 extends Applet {
    Label l, l1;
    List studentName, Branch;
    String msg = " ";

    public void init() {
        l = new Label("Student Name:");
        studentName = new List(3, false);

        studentName.add("Raj");
        studentName.add("Vinod");
        studentName.add("Priya");
        studentName.add("Om");

        l1 = new Label("Branch:");
        Branch = new List(2,true);
        Branch.add("IT");
        Branch.add("AIML");
        Branch.add("CM");
        Branch.add("AU");
        Branch.add("TX");

        add(l);
        add(studentName);
        add(l1);
        add(Branch);

    }

    public void paint(Graphics g){
        int id[];
        
        if(studentName.getSelectedItem() != null){
            msg = "Name: " + studentName.getSelectedItem();
            g.drawString(msg, 6, 120);
        }

        id = Branch.getSelectedIndexes();
        if(id.length > 0){
            msg = "Branch: ";
            for(int i=0; i<id.length; i++){
                msg += Branch.getItem(id[i]) + " ";
            }
            g.drawString(msg, 6, 140);
        }
    }
}
