import java.awt.*;
import java.applet.*;

/*<applet code="Q2" width=400 height=400></applet>*/

public class Q2 extends Applet{
	static final int n = 5;
	public void init(){
		setLayout(new GridLayout(n, n));

		setFont(new Font("SansSerif", Font.BOLD, 24));

		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				int k = i * n + j + 1;
				add(new Button(""+ k));
			}
		}
	}
}
