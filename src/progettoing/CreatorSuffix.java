
package progettoing;

public class CreatorSuffix implements CreatorOperation{

    private String text;
    
    public CreatorSuffix(String s){
        text=s;
    }
    @Override
    public Operation getOperation() {
        return new Suffix(text);
    }
    
}
