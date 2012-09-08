
package progettoing;

import java.io.File;
import javax.swing.JFileChooser;

public class ApriFrame{
  
    String pathDoc;
    FacadeTesto testo;
    
    public ApriFrame(){
        JFileChooser fc= new JFileChooser();
        fc.setFileFilter(new docFileFilter());
        fc.addChoosableFileFilter(new txtFileFilter());
        fc.addChoosableFileFilter(new javaFileFilter());
        fc.addChoosableFileFilter(new pdfFileFilter());
        fc.addChoosableFileFilter(new odtFileFilter());
        fc.addChoosableFileFilter(new xmlFileFilter());
                
        int returnVal = fc.showOpenDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            File file=fc.getSelectedFile();
            pathDoc=file.getAbsolutePath();
        }
    }
    
    public String getDoc() throws Exception{
        testo=new FacadeTesto(pathDoc);
        return testo.getTesto();
    }
}
