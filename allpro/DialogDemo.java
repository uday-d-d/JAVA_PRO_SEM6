import java.awt.*;

public class DialogDemo {
    private static Dialog d;
    DialogDemo(){
        Frame f = new Frame();
        d = new Dialog(f,"Dialog Example", true);
        d.setLayout(new FlowLayout());
        Button b = new Button("Ok");
        d.add(new Label ("Click button to continue"));
        d.add(b);
        d.setSize(300,300);
        d.setVisible(true);
    }
    public static void main(String args[]){
        new DialogDemo();
    }
    
}
