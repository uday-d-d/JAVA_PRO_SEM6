import java.awt.*;
import java.applet.*;

/*
<applet code = "GridlDemo" width = 300 height = 200>
</applet>
*/

public class GridlDemo extends Applet{
    static final int n = 4;

    public void init(){
        GridLayout gl = new GridLayout(n,n);
        setLayout(gl);

        for(int i=0; i<n;i++){
            for(int j=0; j<n; j++){
                int k = i*n+j;
                if(k>n){
                    add(new Button("" + k));
                }
            }
        }
    }
}
