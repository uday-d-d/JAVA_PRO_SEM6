import java.awt.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

/*<applet code="Q1" width=400 height=400></applet>*/

public class Q1 extends JApplet {
    public void init(){
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        DefaultMutableTreeNode top = new DefaultMutableTreeNode("Branch");

        DefaultMutableTreeNode a = new DefaultMutableTreeNode("CSE");
        top.add(a);

        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("Cm");
        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("IT");
        DefaultMutableTreeNode a3 = new DefaultMutableTreeNode("AIML");
        a.add(a1); a.add(a2); a.add(a3);

        DefaultMutableTreeNode b = new DefaultMutableTreeNode("ME");
        top.add(b);

        DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("AE");
        DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("Production");
        b.add(b1); b.add(b2);

        JTree t = new JTree(top);
        JScrollPane js = new JScrollPane(t);
        cp.add(js, BorderLayout.CENTER);
        
    }
}