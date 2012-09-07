
package progettoing;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenuItem;

public class GetFrame  {
    
    JMenuItem menu;
    AboutFrame about;
    ApriFrame apri;
    SalvaFrame salva;
    
  
    public AboutFrame getAboutFrame() {
        about=new AboutFrame();
        return about;
    }

   public ApriFrame getApriFrame() {
        apri=new ApriFrame();
        return apri;
    }
    
    public SalvaFrame getSalvaFrame(String tf){
        try {
            salva= new SalvaFrame(tf);
        } catch (IOException ex) {
            Logger.getLogger(GetFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return salva;
    }
    
 }
