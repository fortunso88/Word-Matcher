
package progettoing;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;



public class ContextTesto {
        
    private String path;
    
    public ContextTesto(String path){
       this.path=path;
    
    }
    
    public String getTXT(){
        ConcreteStateTXT txt=new ConcreteStateTXT(path);
        return txt.getTesto();
    }
    
    public String getJAVA(){
        ConcreteStateJAVA java=new ConcreteStateJAVA(path);
        return java.getTesto();
              
    }
    
    public String getPDF(){
        ConcreteStatePDF pdf=new ConcreteStatePDF(path);
        return pdf.getTesto();
    }
    
    public String getDOC() throws Exception{
        ConcreteStateDOC doc=new ConcreteStateDOC(path);
        return doc.getTesto();
    }
    
    public String getODT(){
        ConcreteStateODT odt=new ConcreteStateODT(path);
        return odt.getTesto();
    }
       
    public String getXML(){
        ConcreteStateXML xml=new ConcreteStateXML(path);
       
             DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
 
             try {
                    DocumentBuilder builder = dbf.newDocumentBuilder();
                    File xmlFile = new File(path);
                    Document document = builder.parse(xmlFile);
                    xml.printNodeInfo(document);
             } catch (SAXException sxe) {
                    Exception  x = sxe;
                    if (sxe.getException() != null)
                           x = sxe.getException();
                    x.printStackTrace();
             } catch (ParserConfigurationException pce) {
                    pce.printStackTrace();
             } catch (IOException ioe) {
                    ioe.printStackTrace();
             }
        return xml.getTesto();
    }

    
    
}
