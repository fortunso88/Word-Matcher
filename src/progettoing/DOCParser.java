

package progettoing;

import java.io.FileInputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.swing.text.Document;
import javax.xml.xpath.XPath;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class DOCParser {
    
    private StringBuffer TextBuffer;
    private String path;
    private String testo;
    private Document inputDocument;
    private XPath inputXPath;
    private String ext;
            
    public DOCParser(String path) throws Exception {
        this.path=path;
        testo="";
        parseDOC();
        }
    
    
    //Process text elements recursively
    private void parseDOC() {
         
        String filesname = path;
		POIFSFileSystem fs = null;
		try
		{
                  fs = new POIFSFileSystem(new FileInputStream(filesname));
                  //Couldn't close the braces at the end as my site did not allow it to close
 
                  HWPFDocument doc = new HWPFDocument(fs);
 
		  WordExtractor we = new WordExtractor(doc);
                  
		  String[] paragraphs = we.getParagraphText();
 
		  //System.out.println( "Word Document has " + paragraphs.length + " paragraphs" );
		  for( int i=0; i<paragraphs .length; i++ ) {
			paragraphs[i] = paragraphs[i].replaceAll("\\cM?\r?\n","");
                	testo+=paragraphs[ i ]+"\n";
		  }
                }
                catch(Exception e) {
                    e.printStackTrace();
                }      
    } 
    
        
    public String getTesto(){
        return testo;
    }
    
   
}
