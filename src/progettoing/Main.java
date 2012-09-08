
package progettoing;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Main {
    public static void main(String args[]) {
        Gui frame=Gui.getIstance();
        Toolkit toolkit=Toolkit.getDefaultToolkit();
        Dimension dim=toolkit.getScreenSize();
        frame.setSize((int)dim.getWidth()-100, (int)dim.getHeight()-100);
        frame.setVisible(true);
        
        
    }
}
