import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;

/*
<applet code = "Pyq" height = 300 width = 400> </applet>
*/
public class Pyq extends JApplet{
    public void init(){
        Container ContentPane = getContentPane();
        ContentPane.setLayout(new BorderLayout());
        
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode veg = new DefaultMutableTreeNode("Vegetables");
        DefaultMutableTreeNode fr = new DefaultMutableTreeNode("Fruits");
        root.add(veg);
        root.add(fr);

        DefaultMutableTreeNode caps = new DefaultMutableTreeNode("Capsicum");
        DefaultMutableTreeNode carr = new DefaultMutableTreeNode("Carrot");
        DefaultMutableTreeNode to = new DefaultMutableTreeNode("Tomato");
        DefaultMutableTreeNode po = new DefaultMutableTreeNode("Potato");
        veg.add(caps);
        veg.add(carr);
        veg.add(to);
        veg.add(po);

        DefaultMutableTreeNode app = new DefaultMutableTreeNode("Apple");
        DefaultMutableTreeNode man = new DefaultMutableTreeNode("Mango");
        DefaultMutableTreeNode ban = new DefaultMutableTreeNode("Banana");
        DefaultMutableTreeNode grp = new DefaultMutableTreeNode("Graphes");
        DefaultMutableTreeNode org = new DefaultMutableTreeNode("Orange");
        fr.add(app);
        fr.add(man);
        fr.add(ban);
        fr.add(grp);
        fr.add(org);

        JTree tree = new JTree(root);
        JScrollPane jsp = new JScrollPane(tree);
        ContentPane.add(jsp, BorderLayout.CENTER);
    }
    
}
