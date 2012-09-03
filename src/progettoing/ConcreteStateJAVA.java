
package progettoing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConcreteStateJAVA {
    
    private String path;
    private String output;
    private String output2;
    
    public ConcreteStateJAVA(String s){
        path=s;
        output="";
        String line2="";
        StringTokenizer tok;
        StringTokenizer tok2;
        int count=0;
        
         BufferedReader in=null;
        
                try {
                    in = new BufferedReader(new FileReader(path));
                }catch (FileNotFoundException ex) {
                    //Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
             
                try {
                    while((line2=in.readLine())!=null){
                       output+=line2+"\n";
                    }
                    in.close();
                    JOptionPane.showMessageDialog(null,"Load Successfull!");
                }catch (IOException ex) {
                    JOptionPane.showMessageDialog(null,"Reading Failure");
                    Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                 
                
                
                       
   }
                        
    
    
    public String getTesto(){
        return output;
    }
    
}
