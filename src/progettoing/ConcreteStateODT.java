
package progettoing;

public class ConcreteStateODT implements StateTesto{
    
    private String path;
    private ODTParser odt;
    
    public ConcreteStateODT(String path){
        this.path=path;
        odt=new ODTParser(path);
    }
    
    @Override
    public String getTesto(){
        return odt.getTesto();
    }
    
}
