
package progettoing;

public class ConcreteStatePDF implements StateTesto{

    private String path;
    private PDFTextParser reader;
    
    public ConcreteStatePDF(String path){
        this.path=path;
        reader = new  PDFTextParser (path);
    }
    
    @Override
    public String getTesto() {
       return reader.getTesto();
    }
    
}
