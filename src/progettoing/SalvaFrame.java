
package progettoing;

import java.io.*;
import java.text.MessageFormat;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.pdfbox.pdmodel.PDDocument;
import org.pdfbox.pdmodel.PDPage;
import org.pdfbox.pdmodel.edit.PDPageContentStream;
import org.pdfbox.pdmodel.font.PDSimpleFont;
import org.pdfbox.pdmodel.font.PDType1Font;

public class SalvaFrame {
    
    String testoFinale;
    PDDocument doc = null;
    StringTokenizer tok;
    String pathOUT;
    String ext;
    HTMLParser par;
        
    public SalvaFrame(String tf) throws IOException{
        testoFinale=tf;
        crea();
    }
    
    private void crea() throws IOException{
        
            JFileChooser fc= new JFileChooser();
            fc.setFileFilter(new docFileFilter());
            fc.addChoosableFileFilter(new txtFileFilter());
            fc.addChoosableFileFilter(new javaFileFilter());
            fc.addChoosableFileFilter(new pdfFileFilter());
            fc.addChoosableFileFilter(new odtFileFilter());
            
            
            
            int response = fc.showSaveDialog(null); 
            if(response==JFileChooser.APPROVE_OPTION) { 
                try {
                    File f = fc.getSelectedFile(); 
                    pathOUT=delExt(f.getAbsolutePath());
                    System.out.println(f.getAbsolutePath());
                    pathOUT+=""+fc.getFileFilter().getDescription();
                    System.out.println(pathOUT);
                    File exist=new File(pathOUT);
                    //se non è un pdf allora scrivi normalmente
                    if (exist.exists()) {
                        String msg = MessageFormat.format("Il File ''{0}'' esiste.\nVuoi davvero sostituirlo?", new Object[]{f});
                        int r = JOptionPane.showConfirmDialog(null, msg, "Confirm", JOptionPane.YES_NO_OPTION);
                        if (r == JOptionPane.NO_OPTION) {
                            // Returns without approve the selection.
                         return;
                        }
                    }
                    ext();
                    if(!ext.equals("doc")){
                        par=new HTMLParser(testoFinale);
                        testoFinale=par.getTesto();
                    }
                    if(!"pdf".equals(ext)){
                        BufferedWriter write=null;
                        StringTokenizer token=new StringTokenizer(testoFinale);
                                try {
                                    write = new BufferedWriter(new FileWriter(pathOUT));
                                }catch (FileNotFoundException ex) {
                                    //Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                                }

                                try {
                                    while(token.hasMoreTokens()){
                                        write.write(token.nextToken("\n"));
                                        write.write("\n");
                                    }
                                    write.close();
                                    
                                   
                                //setTitle(f.getName()); 
                                }catch(Exception ee) {} 
                            
                    }else if("pdf".equals(ext)){ 
                       
                        try{   
                            int fontSize = 12;
                            PDSimpleFont font = PDType1Font.HELVETICA;
                            doc = null;
                            int margin = 40;
                            float height =2; //font.getFontDescriptor().getFontBoundingBox().getHeight() / 1000;

                            //increase the height by 5 percent.
                            height = height * fontSize * 1.05f;
                            doc = new PDDocument();
                            PDPage page = new PDPage();
                            PDPageContentStream contentStream = null;
                            float y = -1;
                                
                            tok=new StringTokenizer(testoFinale);
                            
                            for (int i = 0;tok.hasMoreTokens(); ++i) {
                                String tmp= tok.nextToken("\n");    

                                if (y < margin) {
                                    page = new PDPage();
                                    doc.addPage(page);
                                    if (contentStream != null) {
                                        contentStream.endText();
                                        contentStream.close();
                                    }
                                    contentStream = new PDPageContentStream(doc,page);
                                    contentStream.setFont(font, fontSize);
                                    contentStream.beginText();
                                    y = page.getMediaBox().getHeight() - margin + height;
                                    contentStream.moveTextPositionByAmount(margin,y);

                                }
                                if (contentStream != null) {
                                    contentStream.moveTextPositionByAmount(0, -height);
                                    y -= height;
                                    contentStream.drawString(tmp);

                                } else {
                                    throw new IOException("Error: Expected non-null content stream.");
                                }


                            }
                            if (contentStream != null) {
                                    contentStream.endText();
                                    contentStream.close();
                                }

                                                     
                            doc.save(pathOUT);
                            doc.close();
                            } 
                        catch (IOException e) {
                            e.printStackTrace();
                            }
                    }
                    JOptionPane.showMessageDialog(null, "Salvataggio effettuato correttamente...");
                }catch(Exception ee) {
                JOptionPane.showMessageDialog(null, "Errore durante il salataggio :"+ee.toString());
                
                } 
            }
    }
    
    private void ext(){
        int indexP=0;
        for(int i=0; i<pathOUT.length();i++){
            if (pathOUT.charAt(i)=='.'){
                indexP=i;
                
            }
        }
        ext=pathOUT.substring(indexP+1, pathOUT.length());
    }
    
    private String delExt(String pat){
        
        int indexP=0;
                
        for(int i=0; i<pat.length();i++){
            if (pat.charAt(i)=='.'){
                indexP=i;
               System.out.println("qunidi non entro "+pat.substring(0,indexP));
            }
            
          
        }
        if(indexP==0)return pat;
        return pat.substring(0,indexP);
    
    }
}