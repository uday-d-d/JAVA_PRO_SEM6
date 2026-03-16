import java.awt.*;

class MenuDemo {
    MenuDemo(){
        Frame f = new Frame("Menubar and Menu ");

        MenuBar mb = new MenuBar();

        Menu menu = new Menu("Menu");

        MenuItem i1 = new MenuItem("item 1");
        MenuItem i2 = new MenuItem("item 2");
        MenuItem i3 = new MenuItem("item 3");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);

        Menu submenu = new Menu("Sub Menu");

        MenuItem i4 = new MenuItem("item 4");
        MenuItem i5 = new MenuItem("item 5");
        submenu.add(i4);
        submenu.add(i5);

        menu.add(submenu);

        mb.add(menu);
        f.setMenuBar(mb);
        f.setSize(400,400);
        f.setVisible(true);
    }
    public static void main(String args[]){
        MenuDemo me = new MenuDemo();
    }
}
