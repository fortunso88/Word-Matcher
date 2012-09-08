
package progettoing;

import java.awt.Graphics;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


class ImgPan extends JPanel {

    ImageIcon img1; 

    public ImgPan(URL url){
    Toolkit tk = Toolkit.getDefaultToolkit();
    img1=new ImageIcon(url);
    MediaTracker mt = new MediaTracker(this);
    mt.addImage(img1.getImage(), 1);
    try { mt.waitForAll(); }
    catch (InterruptedException e){}
    }
    @Override
    public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.drawImage(img1.getImage(), 0, 0, null);
    
    }
}