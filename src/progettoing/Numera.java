
package progettoing;

import java.util.StringTokenizer;

public class Numera {
    
    private String testo;
    private String testoNum;
    
    public Numera(String testoIN){
        testo=testoIN;
        testoNum="<html><DIV ALIGN=JUSTIFY><font size=\"4\" face=\"Comic Sans MS\">";
    }
    
    public String numera(){
        
        StringTokenizer tok=new StringTokenizer(testo);
        int riga=0;
        
        while(tok.hasMoreTokens()){
            String tmp=tok.nextToken("\n");
                riga++;
                testoNum+="<span style=\"color: #ff0000;\">" + riga + "</span> &nbsp;" +tmp+ "<br>";
        }    
    return testoNum+"</font></div></html>";
    }
    
    
}
