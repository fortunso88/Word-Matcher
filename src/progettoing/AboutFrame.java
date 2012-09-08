
package progettoing;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

public class AboutFrame{
        JFrame info = new JFrame();
        JPanel pp = new JPanel();
        JLabel hann = new JLabel();
        JEditorPane inf = new JEditorPane();

        public AboutFrame(){
                        
            inf.setContentType( "text/html" );

            GroupLayout infoLayout = new GroupLayout(info.getContentPane());
            info.getContentPane().setLayout(infoLayout);
            infoLayout.setHorizontalGroup(
                infoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 400, Short.MAX_VALUE)
            );
            infoLayout.setVerticalGroup(
                infoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 300, Short.MAX_VALUE)
            );


            hann.setIcon(new ImageIcon(getClass().getResource("/progettoing/img/word.png"))); // NOI18N


            GroupLayout ppLayout = new GroupLayout(pp);
            pp.setLayout(ppLayout);
            ppLayout.setHorizontalGroup(
                ppLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(ppLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(hann)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                    .addComponent(inf, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
            );
            ppLayout.setVerticalGroup(
                ppLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(ppLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(ppLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(hann, GroupLayout.Alignment.TRAILING)
                        .addComponent(inf, GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE))
                    .addContainerGap())
            );

            GroupLayout layout = new GroupLayout(info.getContentPane());
            info.getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(pp, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(pp, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            inf.addMouseListener(new MouseAdapter() { 
                @Override
            public void mousePressed(MouseEvent me) { 
                info.setVisible(false); 
            }
            } );
            info.addMouseListener(new MouseAdapter() { 
                @Override
            public void mousePressed(MouseEvent me) { 
                info.setVisible(false); 
            }
            } );
            pp.addMouseListener(new MouseAdapter() { 
                @Override
            public void mousePressed(MouseEvent me) { 
                info.setVisible(false); 
            }
            } );
            info.setUndecorated(true);
            inf.setEditable(false);
            inf.setBackground(Color.WHITE);
            inf.setText("<font face=Geneva size=20>Word Matcher</font><br><br><br><font face=Verdana size=4>Questo progetto &egrave; stato realizzato da Cal&igrave; Salvatore, per un progetto di Ingegneria del Software.<br><a href=http://www.dmi.unict.it/~tramonta/>Prof. Emilio Tramontana</a><br><br>Contact:<a href='mailto:ture_schuldiner@hotmail.it'>Cal&igrave; Salvatore</a></font>");
            inf.addHyperlinkListener(new HyperlinkListener() {

                @Override
            public void hyperlinkUpdate(HyperlinkEvent e) {
                    if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) { //<<<======
                        if (!Desktop.isDesktopSupported()
                                || !Desktop.getDesktop().isSupported(
                                        Desktop.Action.BROWSE)) {
                            JOptionPane.showMessageDialog(null,
                                "Impossibile aprire il link!\nAzione non supportata!");
                            return;
                        }
                        try {
                            Desktop.getDesktop().browse(e.getURL().toURI());
                        } catch (Exception e1) {
                            JOptionPane.showMessageDialog(
                                    null,
                                    "Impossibile aprire il link!\n"
                                            + e1.getMessage());
                        }
                    }
                }
            });

            pp.setBackground(Color.WHITE);
           
            hann.setOpaque(true);
            info.pack();
            info.setLocation(500,150);
            info.setVisible(true);
    }
}