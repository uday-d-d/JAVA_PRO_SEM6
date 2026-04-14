import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code = "AdapterDemo.class" width = "300" height = "200">
</applet>
*/

public class AdapterDemo extends Applet{
    public void init(){
        addMouseListener(new MyMouseAdapter(this));
    }
    class MyMouseAdapter extends MouseAdapter{
        AdapterDemo adapterDemo;
        public MyMouseAdapter(AdapterDemo adapterDemo){
            this.adapterDemo = adapterDemo;
        }
        public void mouseClicked(MouseEvent me){
            adapterDemo.showStatus("Mouse Clicked");
        }
    }
}
