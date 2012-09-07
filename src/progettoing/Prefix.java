
package progettoing;

import java.util.StringTokenizer;

public class Prefix implements Operation {

    private String input;
    private String testo;
    private String output;
    private StringTokenizer tok;
    private StringTokenizer tok2;
    private int length;
    
    public Prefix(String testo){
        this.testo=testo;        
        input="";
        output="<div align=center><font size=\"4\" face=\"Comic Sans MS\"><span style=\"color: #ff0000;\">Prefix</font></span></div><br><font size=\"4\" face=\"Comic Sans MS\"><span>";
        
        length=0;
    }
    
    @Override
    public String operation() {
        boolean trovato=false;
        length=input.length();
        String line="";
        tok=new StringTokenizer(testo);
        
        output+="<div align=center><font size=\"4\" face=\"Comic Sans MS\"><b><i>Parole</b></i></font></div><br><font size=\"4\" face=\"Comic Sans MS\"><span>";
        while(tok.hasMoreTokens()){
            String tmp=tok.nextToken("\n");
            
            tok2=new StringTokenizer(tmp);
            
            
            while(tok2.hasMoreTokens()){
                String t=tok2.nextToken();
                if(t.length()>= length && t.substring(0, length).equals(input)){
                    trovato=true;
                    output+= t + "   ";
                    //tmp=tmp.replaceAll("\t", "");
                    line+=tmp + "</span><br><span>";
                    break;
                }
             } 
                        
          }
        output+="<br>";
        output+="</span><div align=center><font size=\"4\" face=\"Comic Sans MS\"><b><i>Frasi</b></i></font></div><br><font size=\"4\" face=\"Comic Sans MS\">";
        output+=line;
         
         if(trovato)return output+"<br>_________________________________________";
         return "<div align=center><font size=\"4\" face=\"Comic Sans MS\"><span style=\"color: #ff0000;\">Prefix</font></span></div><br><font size=\"4\" face=\"Comic Sans MS\"><span>Nessuna corrispondenza trovata...</span> <br><span>_________________________________________<span>";
     
    }
    @Override
    public void setWord(String s) {
        input=s;
    }
    
}
