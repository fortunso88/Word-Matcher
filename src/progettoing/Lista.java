
package progettoing;

import java.util.LinkedList;

public class Lista<CreatorOperation> {
    
   private LinkedList list;
        
    public Lista(){
       list=new LinkedList();
    }
    
    public void add(CreatorOperation n){
       list.add(n);
    }
           
    public void remove(CreatorOperation n){
        
        for(int z=0;z<list.size();z++){
            if(list.get(z).getClass()==n.getClass()){
                list.remove(z);
            }
        }
    }
    
    public LinkedList getList(){
        return list;
    }
    
}
