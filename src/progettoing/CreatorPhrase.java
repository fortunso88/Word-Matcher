
package progettoing;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreatorPhrase implements CreatorOperation{
      
    private String text;
    
    public CreatorPhrase(String s){
        text=s;
    }
    
    @Override
    public Operation getOperation() {
         Phrase p=null;
        try {
            p=new Phrase(text);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CreatorPhrase.class.getName()).log(Level.SEVERE, null, ex);
        }return p;
    }
    
}
