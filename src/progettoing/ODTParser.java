
package progettoing;

public class ODTParser {
    
    private String path;
    private String output;
    
    public ODTParser(String path){
        this.path=path;
        output="";
    }
    
    public String getTesto(){
        return output;
    }
    
}
