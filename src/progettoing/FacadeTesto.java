
package progettoing;

import javax.swing.JOptionPane;

public class FacadeTesto {
    
    private String path;
    private String testo;
    private String ext;
    private Testo t;
    
    public FacadeTesto(String path) throws Exception{
        testo="";
        this.path=path;
        t=new Testo(path);
        ext();
        testPath();
    }
    
    private void testPath() throws Exception{
        if(ext.toLowerCase().equals("txt")){
            testo=t.getTXT();
        }
        else if(ext.toLowerCase().equals("java")){
            testo=t.getJAVA();
        }        
        else if(ext.toLowerCase().equals("pdf")){
            testo=t.getPDF();
        }
        
        else if(ext.toLowerCase().equals("doc")||ext.toLowerCase().equals("docx")){
            testo=t.getDOC();
        }
        else if(ext.toLowerCase().equals("xml")){
            testo=t.getXML();
        }
        else if(ext.toLowerCase().equals("odt")){
            testo=t.getODT();
        }
        else JOptionPane.showMessageDialog(null, "Formato testo non supportato...");
    }
    
    private void ext(){
        int indexP=0;
        for(int i=0; i<path.length();i++){
            if (path.charAt(i)=='.'){
                indexP=i;
                
            }
        }
        ext=path.substring(indexP+1, path.length());
    }
    
    public String getTesto(){
        return testo;
    }
    
}
