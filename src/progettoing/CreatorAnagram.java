
package progettoing;

public class CreatorAnagram implements CreatorOperation{
    
    private String text;
    
    public CreatorAnagram(String s){
        text=s;
    }

    @Override
    public Operation getOperation() {
        return new Anagram(text);
    }
    
}
