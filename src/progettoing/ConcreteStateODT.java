
package progettoing;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ConcreteStateODT implements StateTesto{
    
    private String path;
    private ODTParser odt;
    
    public ConcreteStateODT(String path){
        this.path=path;
        odt=new ODTParser(path);
    }
    
    @Override
    public String getTesto(){
       
        try {
            return odt.getTesto();
        } catch (Exception ex) {
            Logger.getLogger(ConcreteStateODT.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
}
