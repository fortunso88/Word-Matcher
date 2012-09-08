
package progettoing;

import java.io.FileNotFoundException;
import java.util.StringTokenizer;

public class Phrase implements Operation{
    
    private String testo;
    private String frase;
    private StringTokenizer tok;
    private StringTokenizer tok2;
    private int riga;
    private String out;
    private int count;
    private String input;
    
    public Phrase(String s) throws FileNotFoundException{
        input="";
        testo=s;
        riga=1;
        out="<div align=center><font size=\"4\" face=\"Comic Sans MS\"><span style=\"color: #ff0000;\">Phrase</font></span></div><br><font size=\"4\" face=\"Comic Sans MS\"><span>";
        
        count=0;
    }

    @Override
    public String operation() {
                 
     tok=new StringTokenizer(testo);
                while (tok.hasMoreTokens()){
                    frase=tok.nextToken("\n");
                    
                    tok2=new StringTokenizer(frase);
                    
                    while (tok2.hasMoreTokens()){
                        if(tok2.nextToken().equals(input)){

                            out+="<br><span>Frase contenente la parola nella riga <b><span>"+riga+"</span></b></span><br>&nbsp;&nbsp;&nbsp;&nbsp;"+"<u><i><span>"+frase+"</span></i></u>";
                            count++;
                            break;
                        }
                    }
                
                riga++;
                }
     if(count==0)return "<div align=center><font size=\"4\" face=\"Comic Sans MS\"><span style=\"color: #ff0000;\">Phrase</font></span></div><br><font size=\"4\" face=\"Comic Sans MS\"><span>Nessuna corrispondenza trovata...</span> <br><span>_________________________________________</span>";
     
        return out+"</font><br><span> _________________________________________</span>";
    }

      @Override
    public void setWord(String s) {
        input=s;
    }

}