import java.awt.*;
import java.applet.*;

/*<applet code="Q2" width=380 height=300></applet> */

public class Q2 extends Applet{
    Label name, branch;
    List nameList, branchList;
    String msg="";

    public void init(){
        name = new Label("Student Name: ");
        branch = new Label("Branch: ");
        nameList = new List(3, false);
        nameList.add("Balaji");
        nameList.add("Adi");
        nameList.add("Uday");
        nameList.add("Sham");
        nameList.add("Om");
        nameList.add("Parth");
        nameList.add("Harshal");
        nameList.add("Aniket");


        branchList = new List(2, true);
        branchList.add("IT");
        branchList.add("AIML");
        branchList.add("TR");
        branchList.add("ETX");
        branchList.add("CE");

        add(name);
        add(nameList);
        add(branch);
        add(branchList);
    }

    public void paint(Graphics g){
    int id[];

    if(nameList.getSelectedItem() != null){
        msg = "Name: " + nameList.getSelectedItem();
        g.drawString(msg, 10, 150);
    }

    id = branchList.getSelectedIndexes();

    if(id.length > 0){
        msg = "Branch: ";
        for(int i = 0; i < id.length; i++){
            msg += branchList.getItem(id[i]) + " ";
        }

        g.drawString(msg, 10, 170);
    }
}

}
