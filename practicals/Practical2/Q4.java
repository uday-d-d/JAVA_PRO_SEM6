import java.awt.*;

class Q4 extends Frame{
    
    public Q4(){
        setSize(400, 500);
        setTitle("Menu Demo");

        MenuBar mb = new MenuBar();
        Menu m1 = new Menu("File");
        Menu m2 = new Menu("Edit");
        Menu m3 = new Menu("Tools");
        Menu m4 = new Menu("Others");

        MenuItem i1 = new MenuItem("Cut");
        MenuItem i2 = new MenuItem("Copy");
        MenuItem i3 = new MenuItem("Paste");
        m2.add(i1); m2.add(i2); m2.add(i3);

        CheckboxMenuItem c1 = new CheckboxMenuItem("Add");
        CheckboxMenuItem c2 = new CheckboxMenuItem("Remove");
        CheckboxMenuItem c3 = new CheckboxMenuItem("Move");
        m3.add(c1); m3.add(c2); m3.add(c3);

        mb.add(m1); mb.add(m2); mb.add(m3); mb.add(m4);
        setMenuBar(mb);
        setVisible(true);
    }

    public static void main(String[] args){
        new Q4();
    }
}