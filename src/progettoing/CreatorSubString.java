
package progettoing;

public class CreatorSubString implements CreatorOperation{

    private String text;
    
    public CreatorSubString(String s){
        text=s;
    }
    
    
    @Override
    public Operation getOperation() {
        return new SubString(text);
    }
    
}
