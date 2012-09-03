
package progettoing;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

public class Frame extends JFrame {
    String DocumentoScelto;
    String testoFinale;
    Lista operationList=new Lista();
    String inputWord;
    static Frame frame=new Frame();
    boolean isSelected=false;
    
    CreatorOperation createOp;
    MediatorFrame medFrame;
            
    ImageIcon icon;
    URL urlB =getClass().getResource("/progettoing/img/unnamed2.jpg");
    

    private Frame() {
        ImgPan pannello = new ImgPan(urlB); 
        setContentPane(pannello);
        repaint();
        initComponents();
        
               
    }
    
    private void coloraMenu(){
        jMenuBar1 = new JMenuBar(){
        @Override
        protected void paintComponent(Graphics g){

            Image photo = getToolkit().getImage("C:\\Users\\Fortunso88\\Desktop\\about.png");
            super.paintComponent(g) ; 
            int x=0;//(this.getWidth()-200), 
            int y=0 ; 
            g.drawImage (photo, 30, y, this);
        }
    };
    }
   
    
    static Frame getIstance(){
        return frame;
        
    }
                    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
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
        FR = new javax.swing.JCheckBox();
        FRText = new javax.swing.JTextField();
        searchBack = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        inputWords = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputText = new javax.swing.JEditorPane();
        inputTextP = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        inputText = new javax.swing.JEditorPane();
        jToolBar2 = new javax.swing.JToolBar();
        apriT = new javax.swing.JButton();
        saveT = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        apri = new javax.swing.JMenuItem();
        salva = new javax.swing.JMenuItem();
        esci = new javax.swing.JMenuItem();
        help = new javax.swing.JMenu();
        about = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Word Matcher");
        setBackground(new java.awt.Color(255, 255, 255));

        search.setBackground(new java.awt.Color(254, 254, 254));
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progettoing/img/searchh.png"))); // NOI18N
        search.setBorder(null);
        search.setEnabled(false);
        search.setOpaque(false);
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        newSearch.setBackground(new java.awt.Color(255, 255, 255));
        newSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progettoing/img/searchn.png"))); // NOI18N
        newSearch.setBorder(null);
        newSearch.setEnabled(false);
        newSearch.setOpaque(false);
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
        wordCount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progettoing/img/unchecked.png"))); // NOI18N
        wordCount.setOpaque(false);
        wordCount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                wordCountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                wordCountMouseExited(evt);
            }
        });
        wordCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wordCountActionPerformed(evt);
            }
        });

        phrase.setBackground(new java.awt.Color(255, 255, 255));
        phrase.setText("Phrase");
        phrase.setEnabled(false);
        phrase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progettoing/img/unchecked.png"))); // NOI18N
        phrase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                phraseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                phraseMouseExited(evt);
            }
        });
        phrase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phraseActionPerformed(evt);
            }
        });

        prefix.setBackground(new java.awt.Color(255, 255, 255));
        prefix.setText("Prefix");
        prefix.setEnabled(false);
        prefix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progettoing/img/unchecked.png"))); // NOI18N
        prefix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                prefixMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                prefixMouseExited(evt);
            }
        });
        prefix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prefixActionPerformed(evt);
            }
        });

        suffix.setBackground(new java.awt.Color(255, 255, 255));
        suffix.setText("Suffix");
        suffix.setEnabled(false);
        suffix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progettoing/img/unchecked.png"))); // NOI18N
        suffix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                suffixMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                suffixMouseExited(evt);
            }
        });
        suffix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suffixActionPerformed(evt);
            }
        });

        subString.setBackground(new java.awt.Color(255, 255, 255));
        subString.setText("SubString");
        subString.setEnabled(false);
        subString.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progettoing/img/unchecked.png"))); // NOI18N
        subString.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                subStringMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                subStringMouseExited(evt);
            }
        });
        subString.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subStringActionPerformed(evt);
            }
        });

        length.setBackground(new java.awt.Color(255, 255, 255));
        length.setText("Length");
        length.setEnabled(false);
        length.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progettoing/img/unchecked.png"))); // NOI18N
        length.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lengthMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lengthMouseExited(evt);
            }
        });
        length.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lengthActionPerformed(evt);
            }
        });

        anagram.setBackground(new java.awt.Color(255, 255, 255));
        anagram.setText("Anagram");
        anagram.setEnabled(false);
        anagram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progettoing/img/unchecked.png"))); // NOI18N
        anagram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                anagramMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                anagramMouseExited(evt);
            }
        });
        anagram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anagramActionPerformed(evt);
            }
        });

        caseSensitive.setBackground(new java.awt.Color(255, 255, 255));
        caseSensitive.setText("Case Sensitive");
        caseSensitive.setEnabled(false);
        caseSensitive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progettoing/img/unchecked.png"))); // NOI18N
        caseSensitive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                caseSensitiveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                caseSensitiveMouseExited(evt);
            }
        });
        caseSensitive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caseSensitiveActionPerformed(evt);
            }
        });

        FR.setBackground(new java.awt.Color(255, 255, 255));
        FR.setText("Find & Replace");
        FR.setEnabled(false);
        FR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progettoing/img/unchecked.png"))); // NOI18N
        FR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FRMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FRMouseExited(evt);
            }
        });
        FR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FRActionPerformed(evt);
            }
        });

        FRText.setEnabled(false);
        FRText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FRTextMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(wordCount)
                            .addComponent(prefix)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(suffix, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(phrase, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(subString, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                .addGap(26, 26, 26))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(anagram)
                                    .addComponent(length)
                                    .addComponent(caseSensitive))
                                .addContainerGap())))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(FR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FRText)
                        .addContainerGap())))
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
                    .addComponent(FR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FRText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
        );
        searchBackLayout.setVerticalGroup(
            searchBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
        );

        jPanel1.setBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/progettoing/img/b.jpg")))); // NOI18N

        jScrollPane1.setViewportView(outputText);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
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

        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);

        apriT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progettoing/img/openn.png"))); // NOI18N
        apriT.setBorder(null);
        apriT.setFocusable(false);
        apriT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        apriT.setOpaque(false);
        apriT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        apriT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apriTActionPerformed(evt);
            }
        });
        jToolBar2.add(apriT);

        saveT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progettoing/img/savee.png"))); // NOI18N
        saveT.setToolTipText("");
        saveT.setBorder(null);
        saveT.setEnabled(false);
        saveT.setFocusable(false);
        saveT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        saveT.setOpaque(false);
        saveT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        saveT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveTActionPerformed(evt);
            }
        });
        jToolBar2.add(saveT);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progettoing/img/How-to.png"))); // NOI18N
        jButton3.setActionCommand("howTT");
        jButton3.setBorder(null);
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setOpaque(false);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jButton3);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        fileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progettoing/img/fileeT.png"))); // NOI18N
        fileMenu.setText("File");

        apri.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        apri.setBackground(new java.awt.Color(255, 255, 255));
        apri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progettoing/img/opennT.png"))); // NOI18N
        apri.setText("Apri");
        apri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apriActionPerformed(evt);
            }
        });
        fileMenu.add(apri);

        salva.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        salva.setBackground(new java.awt.Color(255, 255, 255));
        salva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progettoing/img/saveeT.png"))); // NOI18N
        salva.setText("Salva");
        salva.setEnabled(false);
        salva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvaActionPerformed(evt);
            }
        });
        fileMenu.add(salva);

        esci.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        esci.setBackground(new java.awt.Color(255, 255, 255));
        esci.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progettoing/img/exittT.png"))); // NOI18N
        esci.setText("Esci");
        esci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esciActionPerformed(evt);
            }
        });
        fileMenu.add(esci);

        jMenuBar1.add(fileMenu);

        help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progettoing/img/infooT.png"))); // NOI18N
        help.setText("Help");

        about.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        about.setBackground(new java.awt.Color(255, 255, 255));
        about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progettoing/img/about.png"))); // NOI18N
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        help.add(about);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("How To..");
        help.add(jMenuItem1);

        jMenuBar1.add(help);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(search)
                                .addGap(57, 57, 57)
                                .addComponent(newSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(90, 90, 90))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(searchBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(inputTextP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputTextP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(search, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(newSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(58, 58, 58))
        );

        search.getAccessibleContext().setAccessibleName("searcj");

        pack();
    }// </editor-fold>//GEN-END:initComponents

        
    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
         
        inputWord=inputWords.getText();
        if(!inputWord.equals("") && !inputWord.equals("Inserire qui la parola da ricercare...")){
            if(!FR.isSelected() || !FRText.getText().equals("")){
                if(isSelected){
                    JOptionPane.showMessageDialog(null,"Phrase gained");
                    search.setEnabled(false);

                    testoFinale="<html><br>";
                    LinkedList list=operationList.getList();

                    while(!list.isEmpty()){
                        createOp=(CreatorOperation)list.remove();
                        Operation s = createOp.getOperation();
                        s.setWord(inputWord);
                        if(s instanceof FR)((FR)s).setReplaceW(FRText.getText());
                        String ss=s.operation();
                        testoFinale += ss;
                    }
                    testoFinale+="<br></html>";
                    outputText.setText(testoFinale);
                    newSearch.setEnabled(true);
                    salva.setEnabled(true);
                    saveT.setEnabled(true);
                    unselect();
                    resetIcon();
                    disableCheck();
                    
                }
                else JOptionPane.showMessageDialog(null, "Selezionare una caratteristica dalla Check-Box!!");
            }
            else if(FR.isSelected() && FRText.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Inserire una parola da sostituire Valida!!");
            }
       }
       else JOptionPane.showMessageDialog(null, "Inserire una parola da ricercare Valida!!");
        
    }//GEN-LAST:event_searchActionPerformed

    private void salvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvaActionPerformed
        medFrame=new ConcreteMediatorFrame();
        medFrame.getSalvaFrame(testoFinale);
        
    }//GEN-LAST:event_salvaActionPerformed

    private void esciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esciActionPerformed
        System.exit(0);
    }//GEN-LAST:event_esciActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        medFrame=new ConcreteMediatorFrame();
        medFrame.getAboutFrame();
    }//GEN-LAST:event_aboutActionPerformed

    private void apriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apriActionPerformed
        medFrame=new ConcreteMediatorFrame();
        String line="";
            try {
                line = medFrame.getApriFrame().getDoc();
            } 
            catch (Exception ex) {
                //Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                return;
            }
            Numera numera=new Numera(line);
            inputText.setContentType("text/html");
            outputText.setContentType("text/html");
            inputText.setText(numera.numera());
            DocumentoScelto=line;
            EnableCheck();
    }//GEN-LAST:event_apriActionPerformed
        
    private void phraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phraseActionPerformed
        if(phrase.isSelected()){
            createOp=new CreatorPhrase(DocumentoScelto);
            operationList.add(createOp);
            isSelected=true;
        }
        else{
            operationList.remove(new CreatorPhrase(""));
            isSelected=false;
        }
    }//GEN-LAST:event_phraseActionPerformed

    private void suffixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suffixActionPerformed
        if(suffix.isSelected()){
            createOp=new CreatorSuffix(DocumentoScelto);
            operationList.add(createOp);
            isSelected=true;
        }
        else{
            operationList.remove(new CreatorSuffix(""));
            isSelected=false;
        }
    }//GEN-LAST:event_suffixActionPerformed

    private void wordCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wordCountActionPerformed
         if(wordCount.isSelected()){   
            createOp=new CreatorWC(DocumentoScelto);
            operationList.add(createOp);
            wordCount.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/checked.png")));
            isSelected=true;
         }
         else{
            operationList.remove(new CreatorWC(""));
            wordCount.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/unchecked.png")));
            isSelected=false;
        }
    }//GEN-LAST:event_wordCountActionPerformed

    private void newSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newSearchActionPerformed
        salva.setEnabled(false);
        saveT.setEnabled(false);
                
        inputText.setText("");
        outputText.setText("");
        
        inputWords.setText("Inserire qui la parola da ricercare...");
        search.setEnabled(false);
        disableCheck();
        apriActionPerformed(evt);
        
    }//GEN-LAST:event_newSearchActionPerformed

    private void subStringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subStringActionPerformed
        if(subString.isSelected()){
            createOp=new CreatorSubString(DocumentoScelto);
            operationList.add(createOp);
            subString.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/checked.png")));
            isSelected=true;
        }
        else{
            operationList.remove(new CreatorSubString(""));
            subString.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/unchecked.png")));
            isSelected=false;
        }
    }//GEN-LAST:event_subStringActionPerformed

    private void caseSensitiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caseSensitiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caseSensitiveActionPerformed

    private void inputWordsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputWordsMouseClicked
        inputWords.setText("");
    }//GEN-LAST:event_inputWordsMouseClicked

    private void prefixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prefixActionPerformed
       if(prefix.isSelected()){
            createOp=new CreatorPrefix(DocumentoScelto);
            operationList.add(createOp);
            prefix.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/checked.png")));
            isSelected=true;
        }
        else{
            operationList.remove(new CreatorPrefix(""));
           prefix.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/unchecked.png")));
           isSelected=false;
        }
    }//GEN-LAST:event_prefixActionPerformed

    private void wordCountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wordCountMouseEntered
        if(wordCount.isEnabled() && !wordCount.isSelected())
            wordCount.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/checked.png")));
    }//GEN-LAST:event_wordCountMouseEntered

    private void wordCountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wordCountMouseExited
        if(wordCount.isEnabled()&& !wordCount.isSelected())
        wordCount.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/unchecked.png")));
    }//GEN-LAST:event_wordCountMouseExited

    private void phraseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phraseMouseEntered
        if(phrase.isEnabled()&& !phrase.isSelected())
            phrase.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/checked.png")));
    }//GEN-LAST:event_phraseMouseEntered

    private void phraseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phraseMouseExited
         if(phrase.isEnabled()&& !phrase.isSelected())
            phrase.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/unchecked.png")));
    }//GEN-LAST:event_phraseMouseExited

    private void apriTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apriTActionPerformed
        apriActionPerformed(evt);
    }//GEN-LAST:event_apriTActionPerformed

    private void saveTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveTActionPerformed
        salvaActionPerformed(evt);
    }//GEN-LAST:event_saveTActionPerformed

    private void prefixMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prefixMouseEntered
        if(!prefix.isSelected() && prefix.isEnabled())
            prefix.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/checked.png")));
        
    }//GEN-LAST:event_prefixMouseEntered

    private void prefixMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prefixMouseExited
         if(!prefix.isSelected() && prefix.isEnabled())
            prefix.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/unchecked.png")));
    }//GEN-LAST:event_prefixMouseExited

    private void suffixMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suffixMouseEntered
       
        if(!suffix.isSelected() && suffix.isEnabled())
            suffix.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/checked.png")));
    }//GEN-LAST:event_suffixMouseEntered

    private void suffixMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suffixMouseExited
        if(!suffix.isSelected() && suffix.isEnabled())
            suffix.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/unchecked.png")));
    }//GEN-LAST:event_suffixMouseExited

    private void FRMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FRMouseEntered
        if(!FR.isSelected() && FR.isEnabled())
            FR.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/checked.png")));
    }//GEN-LAST:event_FRMouseEntered

    private void FRMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FRMouseExited
       if(!FR.isSelected() && FR.isEnabled())
            FR.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/unchecked.png")));
    }//GEN-LAST:event_FRMouseExited

    private void subStringMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subStringMouseEntered
        if(!subString.isSelected() && subString.isEnabled())
            subString.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/checked.png")));
    }//GEN-LAST:event_subStringMouseEntered

    private void subStringMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subStringMouseExited
        if(!subString.isSelected() && subString.isEnabled())
            subString.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/unchecked.png")));
    }//GEN-LAST:event_subStringMouseExited

    private void lengthMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lengthMouseEntered
       if(!length.isSelected() && length.isEnabled())
            length.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/checked.png")));
    }//GEN-LAST:event_lengthMouseEntered

    private void lengthMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lengthMouseExited
        if(!length.isSelected() && length.isEnabled())
            length.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/unchecked.png")));
    }//GEN-LAST:event_lengthMouseExited

    private void anagramMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anagramMouseEntered
        if(!anagram.isSelected() && anagram.isEnabled())
            anagram.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/checked.png")));
    }//GEN-LAST:event_anagramMouseEntered

    private void anagramMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anagramMouseExited
        if(!anagram.isSelected() && anagram.isEnabled())
            anagram.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/unchecked.png")));
    }//GEN-LAST:event_anagramMouseExited

    private void caseSensitiveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caseSensitiveMouseEntered
        if(!caseSensitive.isSelected() && caseSensitive.isEnabled())
            caseSensitive.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/checked.png")));
    }//GEN-LAST:event_caseSensitiveMouseEntered

    private void caseSensitiveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caseSensitiveMouseExited
        if(!caseSensitive.isSelected() && caseSensitive.isEnabled())
            caseSensitive.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/unchecked.png")));
    }//GEN-LAST:event_caseSensitiveMouseExited

    private void anagramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anagramActionPerformed
        if(anagram.isSelected()){
            createOp=new CreatorAnagram(DocumentoScelto);
            operationList.add(createOp);
            anagram.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/checked.png")));
            isSelected=true;
        }
        else{
            anagram.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/unchecked.png")));
            operationList.remove(new CreatorAnagram(""));
            isSelected=false;
        }
    }//GEN-LAST:event_anagramActionPerformed

    private void FRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FRActionPerformed
        if(FR.isSelected()){
            createOp=new CreatorFR(DocumentoScelto);
            operationList.add(createOp);
            FRText.setEnabled(true);
            FR.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/checked.png")));
        }
        else{
            FR.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/unchecked.png")));
            operationList.remove(new CreatorFR(""));
            FRText.setText("");
            FRText.setEnabled(false);
        }
    }//GEN-LAST:event_FRActionPerformed

    private void lengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthActionPerformed
        if(length.isSelected()){
            createOp=new CreatorLength(DocumentoScelto);
            operationList.add(createOp);
            length.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/checked.png")));
            isSelected=true;
       }
        else{
            length.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/unchecked.png")));
            operationList.remove(new CreatorLength(""));
            isSelected=false;
       }
    }//GEN-LAST:event_lengthActionPerformed

    private void FRTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FRTextMouseClicked
        FRText.setText("");
    }//GEN-LAST:event_FRTextMouseClicked

    private void EnableCheck(){
        FR.setEnabled(true);
        anagram.setEnabled(true);
        caseSensitive.setEnabled(true);
        length.setEnabled(true);
        phrase.setEnabled(true);
        prefix.setEnabled(true);
        subString.setEnabled(true);
        suffix.setEnabled(true);
        wordCount.setEnabled(true);
        search.setEnabled(true);
        inputWords.setEnabled(true);
        FRText.setEnabled(true);
    }
    
    private void disableCheck(){
        FR.setEnabled(false);
        anagram.setEnabled(false);
        caseSensitive.setEnabled(false);
        length.setEnabled(false);
        phrase.setEnabled(false);
        prefix.setEnabled(false);
        subString.setEnabled(false);
        suffix.setEnabled(false);
        wordCount.setEnabled(false);
        search.setEnabled(false);
        inputWords.setEnabled(false);
        FRText.setText("");
        FRText.setEnabled(false);
    }
    
    private void unselect(){
        FR.setSelected(false);
        anagram.setSelected(false);
        caseSensitive.setSelected(false);
        length.setSelected(false);
        phrase.setSelected(false);
        prefix.setSelected(false);
        subString.setSelected(false);
        suffix.setSelected(false);
        wordCount.setSelected(false);
    }
    
    private void resetIcon(){
        wordCount.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/unchecked.png")));
        FR.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/unchecked.png")));
        anagram.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/unchecked.png")));
        caseSensitive.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/unchecked.png")));
        length.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/unchecked.png")));
        phrase.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/unchecked.png")));
        prefix.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/unchecked.png")));
        subString.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/unchecked.png")));
        suffix.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/unchecked.png")));
    }
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox FR;
    private javax.swing.JTextField FRText;
    private javax.swing.JMenuItem about;
    private javax.swing.JCheckBox anagram;
    private javax.swing.JMenuItem apri;
    private javax.swing.JButton apriT;
    private javax.swing.JCheckBox caseSensitive;
    private javax.swing.JMenuItem esci;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu help;
    private javax.swing.JEditorPane inputText;
    private javax.swing.JPanel inputTextP;
    private javax.swing.JTextArea inputWords;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JCheckBox length;
    private javax.swing.JButton newSearch;
    private javax.swing.JEditorPane outputText;
    private javax.swing.JCheckBox phrase;
    private javax.swing.JCheckBox prefix;
    private javax.swing.JMenuItem salva;
    private javax.swing.JButton saveT;
    private javax.swing.JButton search;
    private javax.swing.JPanel searchBack;
    private javax.swing.JCheckBox subString;
    private javax.swing.JCheckBox suffix;
    private javax.swing.JCheckBox wordCount;
    // End of variables declaration//GEN-END:variables
}
