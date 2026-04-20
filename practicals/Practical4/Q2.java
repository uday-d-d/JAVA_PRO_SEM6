import java.awt.*;
import javax.swing.*;

/*<applet code="Q2" width=400 height=400></applet> */

public class Q2 extends JApplet{
    public void init(){
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        final String[] ch = {"Name", "ID", "Ph. No.", "Address", "Marks"};

        final Object[][] data = {
            {"A", "1", "1234", "abcd", "92"},
            {"B", "2", "1234", "abcd", "92"},
            {"C", "3", "1234", "abcd", "92"},
            {"D", "4", "1234", "abcd", "92"},
            {"E", "5", "1234", "abcd", "92"},
            {"F", "6", "1234", "abcd", "92"},
            {"G", "7", "1234", "abcd", "92"},
            {"H", "8", "1234", "abcd", "92"},
            {"I", "9", "1234", "abcd", "92"},
            {"J", "10", "1234", "abcd", "92"},
        };

        JTable jt = new JTable(data, ch);
        JScrollPane js = new JScrollPane(jt);
        cp.add(js, BorderLayout.CENTER);

    }
}