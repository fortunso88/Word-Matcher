
package progettoing;

public class ConcreteStateDOC implements StateTesto{

    private String path;
    private DOCParser parser;
    
    public ConcreteStateDOC(String path) throws Exception{
        this.path=path;
        parser=new DOCParser(path);
    }
    
    @Override
    public String getTesto() {
        return parser.getTesto();
    }
    
}
