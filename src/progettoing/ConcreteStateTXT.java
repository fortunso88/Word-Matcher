
package progettoing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ConcreteStateTXT implements StateTesto{
    
    private String path;
    private String line;
    private String line2;
    
    public ConcreteStateTXT(String pathh){
        line="";
        line2="";
        
        this.path=pathh;
        BufferedReader in=null;
        
                try {
                    in = new BufferedReader(new FileReader(path));
                }catch (FileNotFoundException ex) {
                    //Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
             
                try {
                    while((line2=in.readLine())!=null){
                        line+=line2+"\n";
                    }
                    in.close();
                    JOptionPane.showMessageDialog(null,"Load Successfull!");
                }catch (IOException ex) {
                    JOptionPane.showMessageDialog(null,"Reading Failure");
//                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
    }

    @Override
    public String getTesto() {
        return line;
    }
    
}
