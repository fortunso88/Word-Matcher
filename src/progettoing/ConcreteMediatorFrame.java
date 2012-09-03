
package progettoing;

import javax.swing.JMenuItem;

public class ConcreteMediatorFrame implements MediatorFrame {
    
    JMenuItem menu;
    AboutFrame about;
    ApriFrame apri;
    SalvaFrame salva;
    
  
    @Override
    public AboutFrame getAboutFrame() {
        about=new AboutFrame();
        return about;
    }

    @Override
    public ApriFrame getApriFrame() {
        apri=new ApriFrame();
        return apri;
    }
    
    @Override
    public SalvaFrame getSalvaFrame(String tf){
        salva= new SalvaFrame(tf);
        return salva;
    }
    
    
    
    
    
    
}
