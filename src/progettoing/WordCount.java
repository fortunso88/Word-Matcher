
package progettoing;

import java.util.StringTokenizer;

public class WordCount implements Operation{
        
    private StringTokenizer tok;
    private int nParola;
    private String input;
    
    public WordCount(String s){
    nParola=0;
    tok =new StringTokenizer(s);
    }
    
    @Override
    public String operation() {
        while (tok.hasMoreTokens()){
            if(tok.nextToken().equals(input)){
                nParola++;
            }
        }
        if (nParola==1)
            return "<div align=center><font size=\"4\" face=\"Comic Sans MS\"><span style=\"color: #ff0000;\">Word Count</font></span></div><font size=\"4\" face=\"Comic Sans MS\"><br><br><span>La parola: "+input+" e' stata conteggiata "+nParola+" volta </span><br><span>_________________________________________</span>";
        else
            return "<div align=center><font size=\"4\" face=\"Comic Sans MS\"><span style=\"color: #ff0000;\">Word Count</font></span></div><font size=\"4\" face=\"Comic Sans MS\"><br><br><span>La parola: "+input+" e' stata conteggiata "+nParola+" volte </span><br><span>_________________________________________</span>";
       }
    
    @Override
    public void setWord(String p){
        input=p;
    }
}
