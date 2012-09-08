
package progettoing;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Text;
import org.jdom.input.SAXBuilder;




public class ODTParser {
    
    private String path;
    private String output;
    StringBuffer TextBuffer;
       
    public ODTParser(String path){
        this.path=path;
        output="";
    }
    
  //Process text elements recursively
    public void processElement(Object o) {
         
        if (o instanceof Element) {
            
            Element e =(Element) o;
            String elementName = e.getQualifiedName();
            
            if (elementName.startsWith("text")) {
                
                if (elementName.equals("text:tab")) // add tab for text:tab
                    TextBuffer.append("&nbsp;");
                else if (elementName.equals("text:s"))  // add space for text:s
                    TextBuffer.append(" ");
                else {
                    List children = e.getContent();
                    Iterator iterator = children.iterator();
                    
                    while (iterator.hasNext()) {
                        
                        Object child = iterator.next();
                        //If Child is a Text Node, then append the text
                        if (child instanceof Text) {  
                            Text t = (Text) child;
                            TextBuffer.append(t.getValue()+"<br>");
                        }
                        else
                        processElement(child); // Recursively process the child element                    
                    }                    
                }
                if (elementName.equals("text:p"))
                    TextBuffer.append("");                    
            }
            else {
                List non_text_list = e.getContent();
                Iterator it = non_text_list.iterator();
                while (it.hasNext()) {
                    Object non_text_child = it.next();
                    processElement(non_text_child);                    
                }
            }                
        }
    } 
    
    public String getText(String fileName) throws Exception {
        TextBuffer = new StringBuffer();
        
        //Unzip the openOffice Document
        ZipFile zipFile = new ZipFile(fileName);
        Enumeration entries = zipFile.entries();
        ZipEntry entry;
        
        while(entries.hasMoreElements()) {
            entry = (ZipEntry) entries.nextElement();
                                   
            if (entry.getName().equals("content.xml")) {
                
                TextBuffer = new StringBuffer();                
                SAXBuilder sax = new SAXBuilder();
                Document doc = (Document) sax.build(zipFile.getInputStream(entry));
                Element rootElement = doc.getRootElement();
                processElement(rootElement);
                break;
            }
        }                  
        //System.out.println("The text extracted from the OpenOffice document = " + TextBuffer.toString());
        return TextBuffer.toString();        
    }      
  
    public String getTesto() throws Exception{
        
        return getText(path);
    }
    
}
