
package progettoing;

public class CreatorLength implements CreatorOperation{
    
    private String text;
    
    public CreatorLength(String s){
        text=s;
    }

    @Override
    public Operation getOperation() {
        return new Length(text);
    }
    
}
