package progettoing;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Stack;
import javax.swing.text.BadLocationException;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.html.HTML;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;

public class HTMLParser{
    
    static String testo;
    
    public HTMLParser(String s) throws IOException{
        testo="";
        HTMLEditorKit.ParserCallback callback = new CallBack();
        Reader reader = new StringReader(s);
        ParserDelegator delegator = new ParserDelegator();
        delegator.parse(reader, callback, false);
    }

    public String getTesto(){
        return testo;
    }
}
// Implement the call back class. Just like a SAX content handler
class CallBack extends HTMLEditorKit.ParserCallback{
    String testo="";
    Stack stack = new Stack();
    
    @Override
    public void flush() throws BadLocationException{}

    @Override
    public void handleComment(char[] data, int pos){}
    
    @Override
    public void handleStartTag(HTML.Tag tag, MutableAttributeSet a, int pos){
        // get a tag and push it into a stack
        //System.out.println("Tag: " + tag );
        //System.out.println( tag );
        stack.push(tag);
    }
    
    @Override
    public void handleEndTag(HTML.Tag t, int pos){}
    @Override
    public void handleSimpleTag(HTML.Tag t,MutableAttributeSet a, int pos){}
    @Override
    public void handleError(String errorMsg, int pos){}
    @Override
    public void handleEndOfLineString(String eol){}

    @Override
    public void handleText(char[] data, int pos){
        // pop the stack to get the latest tag processed. If you are interested
        // in parsing it and extracting the data continue. else return
        
        Object o = stack.pop();
        if ( ! ((HTML.Tag)o).toString().equals("span")){
            return;
        }
        
        String strData="";
        for (char ch : data){
            strData = strData + ch;
        }
        //System.out.println("Text: " + strData );
        //System.out.println(strData );
        HTMLParser.testo+=strData+"\n";
        }
}