
package progettoing;

public class CreatorFR implements CreatorOperation{

    private String text;
    
    
    public CreatorFR(String s){
        text=s;
     }
    
    @Override
    public Operation getOperation() {
        return new FR(text);
    }
    
}
