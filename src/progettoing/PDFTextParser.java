
package progettoing;

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;
import org.pdfbox.cos.COSDocument;
import org.pdfbox.pdfparser.PDFParser;
import org.pdfbox.pdmodel.PDDocument;
import org.pdfbox.pdmodel.PDDocumentInformation;
import org.pdfbox.util.PDFTextStripper;

public class PDFTextParser {
    
    private PDFParser parser;
    private String parsedText;
    private PDFTextStripper pdfStripper;
    private PDDocument pdDoc;
    private COSDocument cosDoc;
    private PDDocumentInformation pdDocInfo;
    private String fileName;
    
    // PDFTextParser Constructor 
    public PDFTextParser(String fileName) {
        this.fileName=fileName;
        pdftoText();
    }
    
    // Extract text from PDF Document
    private String pdftoText() {
        
        System.out.println("Parsing text from PDF file " + fileName + "....");
        File f = new File(fileName);
        
        if (!f.isFile()) {
            System.out.println("File " + fileName + " does not exist.");
            return null;
        }
        
        try {
            parser = new PDFParser(new FileInputStream(f));
        } catch (Exception e) {
            System.out.println("Unable to open PDF Parser.");
            return null;
        }
        
        try {
            parser.parse();
            cosDoc = parser.getDocument();
            pdfStripper = new PDFTextStripper();
            pdDoc = new PDDocument(cosDoc);
            parsedText = pdfStripper.getText(pdDoc); 
        } catch (Exception e) {
            System.out.println("An exception occured in parsing the PDF Document.");
            e.printStackTrace();
            try {
                   if (cosDoc != null) cosDoc.close();
                   if (pdDoc != null) pdDoc.close();
               } catch (Exception e1) {
               e.printStackTrace();
            }
            return null;
        }      
        System.out.println("Done.");
        return parsedText;
    }
    
    // Write the parsed text from PDF to a file
    private void writeTexttoFile(String pdfText, String fileName) {
    	
    	System.out.println("\nWriting PDF text to output text file " + fileName + "....");
    	try {
    		PrintWriter pw = new PrintWriter(fileName);
    		pw.print(pdfText);
    		pw.close();    	
    	} catch (Exception e) {
    		System.out.println("An exception occured in writing the pdf text to file.");
    		e.printStackTrace();
    	}
    	System.out.println("Done.");
    }
    
    public String getTesto(){
        return parsedText;
    }
}