
package progettoing;

import java.util.StringTokenizer;

public class Length implements Operation {
    
    private String testo;
    private String input;
    private String output;
    
    public Length(String s){
        testo=s;
        input="";
        output="<div align=center><font size=\"4\" face=\"Comic Sans MS\"><span style=\"color: #ff0000;\">Length</font></span></div><br><font size=\"4\" face=\"Comic Sans MS\"><span>";
        
    }

    @Override
    public String operation() {
        boolean trovato=false;
        int length=0;
        
        if(isInt(input)==0){
            length=Integer.parseInt(input);


            StringTokenizer tok=new StringTokenizer(testo);

            while (tok.hasMoreTokens()){
                String tmp=tok.nextToken();

                if(tmp.length()==length){
                    output+=tmp+"&nbsp;&nbsp;";
                    trovato=true;
                }
            }

            if(trovato)return output+"</span><span><br>_________________________________________</span>";
            return "<div align=center><font size=\"4\" face=\"Comic Sans MS\"><span style=\"color: #ff0000;\">Length</font></span></div><br><font size=\"4\" face=\"Comic Sans MS\"><span>Nessuna corrispondenza trovata...<br><span>_________________________________________</span></span></font>";
        }
        else{
            return "<div align=center><font size=\"4\" face=\"Comic Sans MS\"><span style=\"color: #ff0000;\">Length</font></span></div><br><font size=\"4\" face=\"Comic Sans MS\"><span>Hai inserito una chiave di ricerca errata... <br><span>_________________________________________</span></span>";
        }
    }

    @Override
    public void setWord(String s) {
        input=s;
    }
    
    private static int isInt(String num){
        try{
            Integer.parseInt(num);
            return 0;
        }
        catch(Exception e){
            return -1;
        }
    }
}
