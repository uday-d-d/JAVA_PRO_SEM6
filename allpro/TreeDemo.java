import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="TreeDemo.class" height = 300 width = 400> 
</applet>
*/

public class TreeDemo extends JApplet {
    public void init(){
        Container ContentPane = getContentPane();
        ContentPane.setLayout(new BorderLayout());

        DefaultMutableTreeNode top = new DefaultMutableTreeNode("Branch");
        DefaultMutableTreeNode cs = new DefaultMutableTreeNode("CS");
        DefaultMutableTreeNode me = new DefaultMutableTreeNode("ME");
        top.add(cs);
        top.add(me);

        DefaultMutableTreeNode cm = new DefaultMutableTreeNode("CM");
        DefaultMutableTreeNode it = new DefaultMutableTreeNode("IT");
        DefaultMutableTreeNode aiml = new DefaultMutableTreeNode("AIML");
        cs.add(cm);
        cs.add(it);
        cs.add(aiml);

        DefaultMutableTreeNode ae = new DefaultMutableTreeNode("AE");
        DefaultMutableTreeNode prod = new DefaultMutableTreeNode("Production");
        me.add(ae);
        me.add(prod);

        JTree tree = new JTree(top);
        JScrollPane jsp = new JScrollPane(tree);
        ContentPane.add(jsp, BorderLayout.CENTER);
    }
    
}
