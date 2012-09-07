/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package progettoing;

/**
 *
 * @author Fortunso88
 */
public class CreatorPrefix implements CreatorOperation{

    private String text;
    
    public CreatorPrefix(String s){
        text=s;
    }
    
    @Override
    public Operation getOperation() {
        return new Prefix(text);
    }
    
}
