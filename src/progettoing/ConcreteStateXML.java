
package progettoing;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ConcreteStateXML implements StateTesto{

    private String path;
    private String testo;
        
    
    public ConcreteStateXML(String path){
        testo="";
        this.path=path;
                    
    }
      
       public void printNodeInfo(Node currentNode) {
             short sNodeType = currentNode.getNodeType();
             //Se è di tipo Element ricavo le informazioni e le stampo
             if (sNodeType == Node.ELEMENT_NODE) {
                    String sNodeName = currentNode.getNodeName();
                    String sNodeValue = searchTextInElement(currentNode);
                    NamedNodeMap nnmAttributes = currentNode.getAttributes();
                    testo+="<b><i>Elemento</i></b>: " + sNodeName;
                    testo+="\n<b><i>Attributi</i></b>: " +printAttributes(nnmAttributes);
                    if (!sNodeValue.trim().equalsIgnoreCase("")) {
                           testo+="\n<i><b>Contenuto</i></b>: " + sNodeValue;
                    }
                    testo+=("\n");
             }
             int iChildNumber = currentNode.getChildNodes().getLength();
             //Se non si tratta di una foglia continua l'esplorazione 
             if (currentNode.hasChildNodes()) {
                    NodeList nlChilds = currentNode.getChildNodes();
                    for (int iChild = 0; iChild < iChildNumber; iChild++) {
                           printNodeInfo(nlChilds.item(iChild));
                    }
             }
       }
 
       
       private static String searchTextInElement(Node elementNode) {
             String sText = "";
             if (elementNode.hasChildNodes()) {
                    //Il child node di tipo testo è il primo
                    Node nTextChild = elementNode.getChildNodes().item(0);
                    sText = nTextChild.getNodeValue();
             }
             return sText;
       }
 
       private static String printAttributes(NamedNodeMap nnm) {
             String sAttrList = new String();
             if (nnm != null && nnm.getLength() > 0) {
                    for (int iAttr=0; iAttr < nnm.getLength(); iAttr++) {
                           sAttrList += nnm.item(iAttr).getNodeName();
                           sAttrList += "=";
                           sAttrList += nnm.item(iAttr).getNodeValue();
                           sAttrList += "; ";
                    }
                    return sAttrList;
             }
             else {
                    return "assenti";
             }
       }
   
    
    @Override
    public String getTesto() {
        return testo;
    }
    
}
