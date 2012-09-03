
package progettoing;

import java.util.StringTokenizer;

public class FR implements Operation{
    
    private String testo;
    private String output;
    private String input;
    private String replace;
    
    
    public FR(String s){
        testo=s;
        replace="";
        output="<div align=center><font size=\"4\" face=\"Comic Sans MS\"><span style=\"color: #ff0000;\">Find & Replace</font></span></div><br><font size=\"4\" face=\"Comic Sans MS\"><span>";
        
        input="";
    }

    @Override
    public String operation() {
        boolean trovato=false;
        
        StringTokenizer tok= new StringTokenizer(testo);
        StringTokenizer tok2;
        
        while(tok.hasMoreTokens()){
            String tmp=tok.nextToken("\n");
            tok2=new StringTokenizer(tmp);
            
            while(tok2.hasMoreTokens()){
                String t=tok2.nextToken();
                if(t.equals(input)){
                    tmp=tmp.replace(t, replace);
                    trovato=true;
                }
                
            }
            //tmp=tmp.replaceAll("\t", "");
            output+=tmp+"</span><br><span>";
                       
        }
        
                
        if(trovato)return output+"</span><br>_________________________________________";
         return "<div align=center><font size=\"4\" face=\"Comic Sans MS\"><span style=\"color: #ff0000;\">Find & Replace</font></span></div><br><font size=\"4\" face=\"Comic Sans MS\"><span>Nessuna corrispondenza trovata... <span><br>_________________________________________</span>";
     }

    @Override
    public void setWord(String s) {
        input=s;
    }
    
    public void setReplaceW(String s){
        replace=s;
    }
    
    
}
