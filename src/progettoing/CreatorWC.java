/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package progettoing;

/**
 *
 * @author Fortunso88
 */
public class CreatorWC implements CreatorOperation{
    
    private String text;
    
    public CreatorWC(String s){
        text=s;
    }

    @Override
    public Operation getOperation() {
        return new WordCount(text);
    }
    
}
