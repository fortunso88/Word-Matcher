
package progettoing;

import java.util.StringTokenizer;


public class Suffix implements Operation{

    private String testo;
    private String input;
    private String output;
    public int length;
        
    public Suffix(String testo){
        this.testo=testo;
        input="";
        output="<div align=center><font size=\"4\" face=\"Comic Sans MS\"><span style=\"color: #ff0000;\">Suffix</font></span></div><br><font size=\"4\" face=\"Comic Sans MS\"><div>";
        length=0;
    }
    
    
    @Override
    public String operation() {
        boolean trovato=false;
        
        StringTokenizer tok;
        StringTokenizer tok2;
        
        length=input.length();
        String line="";
        tok=new StringTokenizer(testo);
        
        output+="<div align=center><font size=\"4\" face=\"Comic Sans MS\"><b><i>Parole</b></i></font></div><br><font size=\"4\" face=\"Comic Sans MS\"><span>";
       
        while(tok.hasMoreTokens()){
            String tmp=tok.nextToken("\n");
            
            tok2=new StringTokenizer(tmp);
            
            
            while(tok2.hasMoreTokens()){
                String t=tok2.nextToken();
                if(t.length()>= length && t.substring(t.length()-length, t.length()).equals(input)){
                    trovato=true;
                    output+= t + "   ";
                    //tmp=tmp.replaceAll("\t", "");
                    line+=tmp + "</span><br><span>";
                    break;
                }
             } 
                        
          }
        output+="\n";
        output+="<div align=center><font size=\"4\" face=\"Comic Sans MS\"><b><i>Frase</b></i></font></div><br><font size=\"4\" face=\"Comic Sans MS\">";
       
        output+=line;
         
         if(trovato)return output+"<br>_________________________________________";
         return "<div align=center><font size=\"4\" face=\"Comic Sans MS\"><span style=\"color: #ff0000;\">Suffix</font></span></div><br><font size=\"4\" face=\"Comic Sans MS\"><span>Nessuna corrispondenza trovata...</span> <BR> <span>_________________________________________<span>";
               
    }

    @Override
    public void setWord(String s) {
        input=s;
    }
    
}
