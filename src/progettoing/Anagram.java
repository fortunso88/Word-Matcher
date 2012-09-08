
package progettoing;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Anagram implements Operation{
    
    private String testo;
    private String input;
    private String output;
    
    public Anagram(String s){
        testo=s;
        input="";
        output="<div align=center><font size=\"4\" face=\"Comic Sans MS\"><span style=\"color: #ff0000;\">Anagram</font></span></div><br><font size=\"4\" face=\"Comic Sans MS\"><span>";
        
    }

    @Override
    public String operation() {
              
        boolean trovato=false;
        StringTokenizer tok=new StringTokenizer(testo);
        char[] arrInp=input.toCharArray();
        Arrays.sort(arrInp);
        while(tok.hasMoreTokens()){
            String tmp=tok.nextToken();
            char[] arr=tmp.toCharArray();
            Arrays.sort(arr);
            
            if(arr.length==arrInp.length){
                String s1="";
                String s2="";
                for(int i=0;i<arrInp.length;i++){
                    s1+=arrInp[i];
                    s2+=arr[i];
                }
            
                if(s1.equals(s2)){
                    trovato=true;
                    output+=tmp+"   ";
                }
            }
        }
        
        if(trovato)return output+"<br><</span></font><br>_________________________________________";
         return "<div align=center><font size=\"4\" face=\"Comic Sans MS\"><span style=\"color: #ff0000;\">Anagram</font></span></div><br><font size=\"4\" face=\"Comic Sans MS\"><span>Nessuna corrispondenza trovata...</span> <br><span>_________________________________________</span>";
    }

    @Override
    public void setWord(String s) {
        input=s;
    }
    
}
