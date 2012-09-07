
package progettoing;

import java.util.StringTokenizer;

public class SubString implements Operation{

    private String testo;
    private String input;
    private String output;
    
    public SubString(String s){
        testo=s;
        output="<div align=center><font size=\"4\" face=\"Comic Sans MS\"><span style=\"color: #ff0000;\">SubString</font></span></div><br><font size=\"4\" face=\"Comic Sans MS\"><span>";
        
        input="";
    }
    
    @Override
    public String operation() {
        boolean trovato=false;
        StringTokenizer tok=new StringTokenizer(testo);
        while(tok.hasMoreTokens()){
            String tmp=tok.nextToken("\n");
            
            for(int i=0;i<tmp.length()+1;i++){
                for(int j=i;j<tmp.length()+1;j++){
                    
                    if(tmp.substring(i, j).equals(input)){
                        trovato=true;
                        //tmp=tmp.replaceAll("\t", "");
                        output+=tmp+"</span><br><span>";
                        }
                }
           }
            
        }
        if(trovato)return output+"</span><br><span>_________________________________________</span>";
         return "<div align=center><font size=\"4\" face=\"Comic Sans MS\"><span style=\"color: #ff0000;\">SubString</font></span></div><br><font size=\"4\" face=\"Comic Sans MS\"><span>Nessuna corrispondenza trovata... </span><br><span>_________________________________________</span>";
      }

    @Override
    public void setWord(String s) {
        input=s;
    }
    
}
