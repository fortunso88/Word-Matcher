
package progettoing;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

public class Frame1 extends JFrame {
    String DocumentoScelto;
    String testoFinale;
    Lista operationList=new Lista();
    String inputWord;
    static Frame1 frame=new Frame1();
    
    CreatorOperation createOp;
    MediatorFrame medFrame;
            
    ImageIcon icon;
    URL urlB =getClass().getResource("/progettoing/img/sfondo.png");
    

    private Frame1() {
        ImgPan pannello = new ImgPan(urlB); 
        setContentPane(pannello);
        repaint();
        initComponents();
        
               
    }
    
    static Frame1 getIstance(){
        return frame;
        
    }
                    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        search = new javax.swing.JButton();
        newSearch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        wordCount = new javax.swing.JCheckBox();
        phrase = new javax.swing.JCheckBox();
        prefix = new javax.swing.JCheckBox();
        suffix = new javax.swing.JCheckBox();
        subString = new javax.swing.JCheckBox();
        length = new javax.swing.JCheckBox();
        anagram = new javax.swing.JCheckBox();
        caseSensitive = new javax.swing.JCheckBox();
        highlights = new javax.swing.JCheckBox();
        FR = new javax.swing.JCheckBox();
        searchBack = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        inputWords = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        outputText = new javax.swing.JTextArea();
        inputTextP = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        inputText = new javax.swing.JEditorPane();
        jMenuBar1 =jMenuBar1 =  new JMenuBar(){
        @Override
        protected void paintComponent(Graphics g){

            Image photo = getToolkit().getImage("C:\\Users\\Fortunso88\\Desktop\\about.png");
            super.paintComponent(g) ; 
            int x=0;//(this.getWidth()-200), 
            int y=0 ; 
            g.drawImage (photo, 300, 10, this);
        }
    };
        fileMenu = new javax.swing.JMenu();
        apri = new javax.swing.JMenuItem();
        salva = new javax.swing.JMenuItem();
        esci = new javax.swing.JMenuItem();
        help = new javax.swing.JMenu();
        about = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Word Matcher");
        setBackground(new java.awt.Color(255, 255, 255));

        search.setBackground(new java.awt.Color(254, 254, 254));
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progettoing/img/images.jpg"))); // NOI18N
        search.setEnabled(false);
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        newSearch.setBackground(new java.awt.Color(255, 255, 255));
        newSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progettoing/img/search_add.png"))); // NOI18N
        newSearch.setEnabled(false);
        newSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newSearchActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/progettoing/img/b.jpg")))); // NOI18N
        jPanel2.setFocusable(false);

        wordCount.setBackground(new java.awt.Color(255, 255, 255));
        wordCount.setText("Word Count");
        wordCount.setEnabled(false);
        wordCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wordCountActionPerformed(evt);
            }
        });
        wordCount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wordCountMouseClicked(evt);
            }
        });

        phrase.setBackground(new java.awt.Color(255, 255, 255));
        phrase.setText("Phrase");
        phrase.setEnabled(false);
        phrase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phraseActionPerformed(evt);
            }
        });

        prefix.setBackground(new java.awt.Color(255, 255, 255));
        prefix.setText("Prefix");
        prefix.setEnabled(false);

        suffix.setBackground(new java.awt.Color(255, 255, 255));
        suffix.setText("Suffix");
        suffix.setEnabled(false);
        suffix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suffixActionPerformed(evt);
            }
        });

        subString.setBackground(new java.awt.Color(255, 255, 255));
        subString.setText("SubString");
        subString.setEnabled(false);
        subString.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subStringActionPerformed(evt);
            }
        });

        length.setBackground(new java.awt.Color(255, 255, 255));
        length.setText("Length");
        length.setEnabled(false);

        anagram.setBackground(new java.awt.Color(255, 255, 255));
        anagram.setText("Anagram");
        anagram.setEnabled(false);

        caseSensitive.setBackground(new java.awt.Color(255, 255, 255));
        caseSensitive.setText("Case Sensitive");
        caseSensitive.setEnabled(false);
        caseSensitive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caseSensitiveActionPerformed(evt);
            }
        });

        highlights.setBackground(new java.awt.Color(255, 255, 255));
        highlights.setText("Highlights");
        highlights.setEnabled(false);

        FR.setBackground(new java.awt.Color(255, 255, 255));
        FR.setText("Find & Replace");
        FR.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(wordCount)
                    .addComponent(prefix)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(suffix, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(phrase, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(highlights))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FR)
                    .addComponent(anagram)
                    .addComponent(length)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(subString, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                        .addGap(26, 26, 26))
                    .addComponent(caseSensitive))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wordCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(subString, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phrase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(length, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prefix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(anagram, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(suffix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(caseSensitive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(highlights, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        searchBack.setBackground(new java.awt.Color(153, 73, 56));
        searchBack.setBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/progettoing/img/b.jpg")))); // NOI18N

        inputWords.setColumns(20);
        inputWords.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        inputWords.setLineWrap(true);
        inputWords.setRows(5);
        inputWords.setText("Inserire qui la parola da ricercare...");
        inputWords.setEnabled(false);
        inputWords.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputWordsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(inputWords);

        javax.swing.GroupLayout searchBackLayout = new javax.swing.GroupLayout(searchBack);
        searchBack.setLayout(searchBackLayout);
        searchBackLayout.setHorizontalGroup(
            searchBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        searchBackLayout.setVerticalGroup(
            searchBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
        );

        jPanel1.setBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/progettoing/img/b.jpg")))); // NOI18N

        outputText.setColumns(20);
        outputText.setEditable(false);
        outputText.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        outputText.setLineWrap(true);
        outputText.setRows(5);
        jScrollPane3.setViewportView(outputText);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );

        inputTextP.setBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/progettoing/img/b.jpg")))); // NOI18N

        inputText.setEditable(false);
        inputText.setEditorKit(null);
        inputText.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jScrollPane4.setViewportView(inputText);

        javax.swing.GroupLayout inputTextPLayout = new javax.swing.GroupLayout(inputTextP);
        inputTextP.setLayout(inputTextPLayout);
        inputTextPLayout.setHorizontalGroup(
            inputTextPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );
        inputTextPLayout.setVerticalGroup(
            inputTextPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        fileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progettoing/img/filee.png"))); // NOI18N
        fileMenu.setText("File");

        apri.setBackground(new java.awt.Color(255, 255, 255));
        apri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progettoing/img/openn.png"))); // NOI18N
        apri.setText("Apri");
        apri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apriActionPerformed(evt);
            }
        });
        fileMenu.add(apri);

        salva.setBackground(new java.awt.Color(255, 255, 255));
        salva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progettoing/img/savee.png"))); // NOI18N
        salva.setText("Salva");
        salva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvaActionPerformed(evt);
            }
        });
        fileMenu.add(salva);

        esci.setBackground(new java.awt.Color(255, 255, 255));
        esci.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progettoing/img/exitt.png"))); // NOI18N
        esci.setText("Esci");
        esci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esciActionPerformed(evt);
            }
        });
        fileMenu.add(esci);

        jMenuBar1.add(fileMenu);

        help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progettoing/img/infoo.png"))); // NOI18N
        help.setText("Help");

        about.setBackground(new java.awt.Color(255, 255, 255));
        about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progettoing/img/about.png"))); // NOI18N
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        help.add(about);

        jMenuBar1.add(help);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(newSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(31, 31, 31)))
                .addComponent(inputTextP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputTextP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(newSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)))
                .addGap(53, 53, 53))
        );

        search.getAccessibleContext().setAccessibleName("searcj");

        pack();
    }// </editor-fold>

        
    private void searchActionPerformed(java.awt.event.ActionEvent evt) {                                       
         
        inputWord=inputWords.getText();
        //System.out.println(inputWord);
        JOptionPane.showMessageDialog(null,"Phrase gained");
        search.setEnabled(false);
        
       testoFinale="";
       LinkedList list=operationList.getList();
             
       while(!list.isEmpty()){
           createOp=(CreatorOperation)list.remove();
           
           
           Operation s = createOp.getOperation();
           s.setWord(inputWord);
           String ss=s.operation();
           testoFinale += ss;
          
       }outputText.setText(testoFinale);
       
       newSearch.setEnabled(true);
              
    }                                      

    private void salvaActionPerformed(java.awt.event.ActionEvent evt) {                                      
        medFrame=new ConcreteMediatorFrame();
        medFrame.getSalvaFrame(testoFinale);
        
    }                                     

    private void esciActionPerformed(java.awt.event.ActionEvent evt) {                                     
        System.exit(0);
    }                                    

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {                                      
        medFrame=new ConcreteMediatorFrame();
        medFrame.getAboutFrame();
    }                                     

    private void apriActionPerformed(java.awt.event.ActionEvent evt) {                                     
          medFrame=new ConcreteMediatorFrame();
          String line="";
        try {
            line = medFrame.getApriFrame().getDoc();
        } catch (Exception ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
          Numera numera=new Numera(line);
          inputText.setContentType("text/html");
          inputText.setText(numera.numera());
          DocumentoScelto=line;
          EnableCheck();
    }                                    

    private void EnableCheck(){
        FR.setEnabled(true);
                anagram.setEnabled(true);
                caseSensitive.setEnabled(true);
                highlights.setEnabled(true);
                length.setEnabled(true);
                phrase.setEnabled(true);
                prefix.setEnabled(true);
                subString.setEnabled(true);
                suffix.setEnabled(true);
                wordCount.setEnabled(true);
                search.setEnabled(true);
                inputWords.setEnabled(true);
    }
    
    private void phraseActionPerformed(java.awt.event.ActionEvent evt) {                                       
        if(phrase.isSelected()){
            createOp=new CreatorPhrase(DocumentoScelto);
            operationList.add(createOp);
        }
        else{
            operationList.remove(new CreatorPhrase(""));
        }
    }                                      

    private void suffixActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void wordCountActionPerformed(java.awt.event.ActionEvent evt) {                                          
         if(wordCount.isSelected()){   
            createOp=new CreatorWC(DocumentoScelto);
            operationList.add(createOp);  
         }
         else{
            operationList.remove(new CreatorWC(""));
        }
    }                                         

    private void newSearchActionPerformed(java.awt.event.ActionEvent evt) {                                          
        inputText.setText("");
        outputText.setText("");
        
        inputWords.setText("Inserire qui la parola da ricercare...");
        wordCount.setSelected(false);
        phrase.setSelected(false);
    }                                         

    private void subStringActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void caseSensitiveActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void inputWordsMouseClicked(java.awt.event.MouseEvent evt) {
        inputWords.setText("");
    }
    
    private void wordCountMouseClicked(java.awt.event.MouseEvent evt){
        wordCount.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/checked.png")));
    }

       
    // Variables declaration - do not modify
    private javax.swing.JCheckBox FR;
    private javax.swing.JMenuItem about;
    private javax.swing.JCheckBox anagram;
    private javax.swing.JMenuItem apri;
    private javax.swing.JCheckBox caseSensitive;
    private javax.swing.JMenuItem esci;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu help;
    private javax.swing.JCheckBox highlights;
    private javax.swing.JEditorPane inputText;
    private javax.swing.JPanel inputTextP;
    private javax.swing.JTextArea inputWords;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JCheckBox length;
    private javax.swing.JButton newSearch;
    private javax.swing.JTextArea outputText;
    private javax.swing.JCheckBox phrase;
    private javax.swing.JCheckBox prefix;
    private javax.swing.JMenuItem salva;
    private javax.swing.JButton search;
    private javax.swing.JPanel searchBack;
    private javax.swing.JCheckBox subString;
    private javax.swing.JCheckBox suffix;
    private javax.swing.JCheckBox wordCount;
    // End of variables declaration
}
