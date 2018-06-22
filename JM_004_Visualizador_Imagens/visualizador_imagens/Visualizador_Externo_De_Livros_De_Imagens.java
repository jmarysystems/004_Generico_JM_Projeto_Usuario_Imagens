/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visualizador_imagens;

import br.com.jmary.home.Home;
import br.com.jmary.utilidades.Exportando;
import br.com.jmary.utilidades.JpgToHtml;
import br.com.jmary.utilidades.JpgToPdf;
import exercicios_tipos_de_buscas.Exercicis_Busca_Por_ID_Assunto;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.TreeSet;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import leitura_e_aprendizagem.JPHtmlPrincipal;

/**
 *
 * @author admin
 */
public class Visualizador_Externo_De_Livros_De_Imagens extends javax.swing.JPanel {

    JPHtmlPrincipal JPHtmlPrincipal;
    int id_AssuntoBanco = 0;
    
    String endereco_Externo_da_Pasta = System.getProperty("user.dir") + "\\00_Externo\\";      
    int img_Atual = 0;
    
    int largura = 0;
    int altura = 0;
    
    Home Home;
    
    public TreeSet<String> keySet = new TreeSet<String>();
    /**
     * Creates new form Visualizador_Interno2
     * @param Home2
     * @param img_Atual2
     * @param endereco_Externo_da_Pasta2
     * @param largura2
     * @param altura2
     * @param JPHtmlPrincipal2
     * @param id_AssuntoBanco2
     */
    public Visualizador_Externo_De_Livros_De_Imagens( Home Home2, int img_Atual2, String endereco_Externo_da_Pasta2, int largura2, int altura2, 
            JPHtmlPrincipal JPHtmlPrincipal2, int id_AssuntoBanco2 ) {
        initComponents();
        
        JPHtmlPrincipal = JPHtmlPrincipal2;
        id_AssuntoBanco = id_AssuntoBanco2;
        
        Home = Home2;
        
        img_Atual = img_Atual2;
        endereco_Externo_da_Pasta = endereco_Externo_da_Pasta2;
        
        largura = largura2;
        altura = altura2;
        
        setarPastaInicio(img_Atual2);

        inicio();
        setFocusable(true);
    }
    
    private void inicio() {                                      
        try { 

        this.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent evt) {
                keySet.add(keyString(evt));
            }
            @Override
            public void keyReleased(KeyEvent evt) {
                keySet.remove(keyString(evt));
            }
            @Override
            public void keyTyped(KeyEvent evt) {
////////////////////////////////////////////////////////////////////////////////                 
                tecla(keyString(evt));
////////////////////////////////////////////////////////////////////////////////                
            }
        });
        } catch( Exception e ){ } 
    }
    
    private void tecla(String c){
        switch(c){
		case "right":
                    img_Atual++;
                    setarImg_Estatico();
                    System.out.println("tecla(String c) right");
		break;
		case "left":
                    img_Atual--;
                    setarImg_Estatico();
                    System.out.println("tecla(String c) left");
		break;
		}
    }
    
    private String keyString(KeyEvent evt) {
        if(evt.getKeyChar() != KeyEvent.CHAR_UNDEFINED) {
            return String.valueOf(evt.getKeyChar()).toLowerCase();
        } else {
            switch(evt.getKeyCode()) {
            case KeyEvent.VK_ALT: return "alt";
            case KeyEvent.VK_CONTROL: return "control";
            case KeyEvent.VK_SHIFT: return "shift";
            case KeyEvent.VK_LEFT: return "left";
            case KeyEvent.VK_RIGHT: return "right";
            case KeyEvent.VK_UP: return "up";
            case KeyEvent.VK_DOWN: return "down";
            case KeyEvent.VK_ENTER: return "enter";
            case KeyEvent.VK_DELETE: return "delete";
            case KeyEvent.VK_TAB: return "tab";
            case KeyEvent.VK_WINDOWS: return "windows";
            case KeyEvent.VK_BACK_SPACE: return "backspace";
            case KeyEvent.VK_ALT_GRAPH: return "altgr";
            case KeyEvent.VK_F1: return "F1";
            case KeyEvent.VK_F2: return "F2";
            case KeyEvent.VK_F3: return "F3";
            case KeyEvent.VK_F4: return "F4";
            case KeyEvent.VK_F5: return "F5";
            case KeyEvent.VK_F6: return "F6";
            case KeyEvent.VK_F7: return "F7";
            case KeyEvent.VK_F8: return "F8";
            case KeyEvent.VK_F9: return "F9";
            case KeyEvent.VK_F10: return "F10";
            case KeyEvent.VK_F11: return "F11";
            case KeyEvent.VK_F12: return "F12";
            default: return "";
            }
        }
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfPagina = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btPosTrees = new javax.swing.JButton();
        bt_criar_exe = new javax.swing.JLabel();
        bt_fazer_exe = new javax.swing.JLabel();
        lbConteudo_Online = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_controle_menus_norte/imagens/pdf_16_16.gif"))); // NOI18N
        jLabel12.setToolTipText("GERAR ARQUIVO PDF");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel12MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel12MouseReleased(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_controle_menus_norte/imagens/FonteAum.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_controle_menus_norte/imagens/laranja_anterior.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_controle_menus_norte/imagens/laranja_proximo.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
        });

        tfPagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPaginaActionPerformed(evt);
            }
        });
        tfPagina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPaginaKeyPressed(evt);
            }
        });

        jLabel6.setText("Ir Para");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_controle_menus_norte/imagens/laranja_home.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel11MousePressed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_controle_menus_norte/imagens/laranja_proximo.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_controle_menus_norte/imagens/FonteDim.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_controle_menus_norte/imagens/16_chrome.png"))); // NOI18N
        jLabel13.setToolTipText("GERAR ARQUIVO HTML");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel13MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel13MouseReleased(evt);
            }
        });

        btPosTrees.setText("<<");
        btPosTrees.setToolTipText("Contrair Descontrair JTREE");
        btPosTrees.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btPosTrees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPosTreesActionPerformed(evt);
            }
        });
        btPosTrees.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btPosTreesKeyPressed(evt);
            }
        });

        bt_criar_exe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_leitura_e_aprendizagem/novo.gif"))); // NOI18N
        bt_criar_exe.setText("Criar Exercícios");
        bt_criar_exe.setToolTipText("Criar Exercícios");
        bt_criar_exe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_criar_exe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt_criar_exeMousePressed(evt);
            }
        });

        bt_fazer_exe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_leitura_e_aprendizagem/java.gif"))); // NOI18N
        bt_fazer_exe.setText("Fazer Exercícios");
        bt_fazer_exe.setToolTipText("Fazer Exercícios");
        bt_fazer_exe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_fazer_exe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt_fazer_exeMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(btPosTrees, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addGap(10, 10, 10)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPagina, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(23, 23, 23)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(23, 23, 23)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(29, 29, 29)
                .addComponent(bt_fazer_exe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_criar_exe)
                .addGap(0, 105, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bt_fazer_exe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btPosTrees, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfPagina)))
            .addComponent(bt_criar_exe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel12, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        lbConteudo_Online.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbConteudo_Online.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbConteudo_Online.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_controle_menus_norte/imagens/anao.gif"))); // NOI18N
        lbConteudo_Online.setToolTipText("");
        lbConteudo_Online.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbConteudo_Online.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lbConteudo_OnlineKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(">>");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<<");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbConteudo_Online, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbConteudo_Online, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        img_Atual = 0; try{ img_Atual = Integer.parseInt( tfPagina.getText().trim() ); }catch(Exception e){}
        setarImagemExterna(img_Atual);
       setarImg_Estatico();
    }//GEN-LAST:event_jLabel5MousePressed

    Exportando Exportando;
    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        img_Atual++;
        setarImg_Estatico();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        img_Atual--;
        setarImg_Estatico();
    }//GEN-LAST:event_jLabel2MousePressed

    private void tfPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPaginaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPaginaActionPerformed

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        largura -= 5;
        altura -= 5;
        setarPastaInicio(img_Atual);
    }//GEN-LAST:event_jLabel7MousePressed

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        largura += 5;
        altura += 5;
        setarPastaInicio(img_Atual);
    }//GEN-LAST:event_jLabel8MousePressed

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        img_Atual--;
        if( jLabel9.isEnabled() == true ){
            jLabel9.setEnabled(false);
            setarImg_Estatico();
            jLabel9.setEnabled(true);
        }
    }//GEN-LAST:event_jLabel9MousePressed

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
        img_Atual++;
        if( jLabel10.isEnabled() == true ){
            jLabel10.setEnabled(false);
            setarImg_Estatico();
            jLabel10.setEnabled(true);
        }
    }//GEN-LAST:event_jLabel10MousePressed

    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MousePressed
        img_Atual=0;
        if( jLabel11.isEnabled() == true ){
            jLabel11.setEnabled(false);
            setarImg_Estatico();
            jLabel11.setEnabled(true);
        }
    }//GEN-LAST:event_jLabel11MousePressed

    private void jLabel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MousePressed
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 );

            if( jLabel12.isEnabled() ){
                try{
                    jLabel12.setEnabled(false);
                    
                    JpgToPdf JpgToPdf = new JpgToPdf( endereco_Externo_da_Pasta, "zz" );
                    JpgToPdf.JpgParaPdf();
                    
                    jLabel12.setEnabled(true);
                } catch( Exception e ){
                    jLabel12.setEnabled(true);
                }
            }
        } catch( Exception e ){ } } }.start();       
    }//GEN-LAST:event_jLabel12MousePressed

    private void jLabel12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseReleased

    private void jLabel13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MousePressed
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 );

            String bookInfo_BookURL = "";
                
            if( jLabel13.isEnabled() ){
                try{
                    jLabel13.setEnabled(false);
                    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
                    String bookInfo_BookURL2 = endereco_Externo_da_Pasta.replace("\\", "/");
                    String bookInfo_BookURL3 = bookInfo_BookURL2.replace("//", "/");
                    String str[] = bookInfo_BookURL3.split("/");
                if( !str.equals("") ){
                        
                    for (int i = 0; i < str.length; i++){
                            
                        String opcao = str[i].trim();
                        if(opcao.equals("00_Externo")){
                                
                            StringBuilder temp = new StringBuilder();
                            //temp.append("//");
                            int ctemp = 0;
                            for (int j = i; j < str.length; j++){
                                    
                                temp.append( str[j].trim() ); 
                                    
                                ctemp = str.length - 1;
                                if(j < ctemp){
                                        
                                    temp.append("/");
                                }
                            }

                            bookInfo_BookURL = temp.toString();
                            break;
                        }
                    }
                }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    /*
                    JpgToHtml_Livro_Externo JpgToHtml_Livro_Externo = 
                            new JpgToHtml_Livro_Externo( endereco_Externo_da_Pasta, "zz", bookInfo_BookURL );
                    JpgToHtml_Livro_Externo.JpgToHtml();
                    */
                    JpgToHtml JpgToHtml = 
                            new JpgToHtml( endereco_Externo_da_Pasta, bookInfo_BookURL );
                    JpgToHtml.JpgToHtml();
                    
                    jLabel13.setEnabled(true);
                } catch( Exception e ){
                    jLabel13.setEnabled(true);
                }
            }
        } catch( Exception e ){ } } }.start(); 
    }//GEN-LAST:event_jLabel13MousePressed

    private void jLabel13MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseReleased

    private void btPosTreesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPosTreesActionPerformed
        String tx = btPosTrees.getText().trim();
        switch (tx) {
            case "<<":
            splitPane( 0 );
            btPosTrees.setText(">>");
            break;
            case ">>":
            splitPane( 1 );
            btPosTrees.setText("<<");
            break;
        }
    }//GEN-LAST:event_btPosTreesActionPerformed

    private void lbConteudo_OnlineKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbConteudo_OnlineKeyPressed
        
    }//GEN-LAST:event_lbConteudo_OnlineKeyPressed

    private void tfPaginaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPaginaKeyPressed
        try{
            
            if (evt.getKeyCode() == KeyEvent.VK_RIGHT || evt.getKeyCode() == KeyEvent.VK_KP_RIGHT) {
             
                img_Atual++;
                setarImg_Estatico();  
                
                new Thread() {   @Override public void run() { try { 
                    Thread.sleep( 100 );
                    tfPagina.requestFocus();
                    Thread.sleep( 1000 );
                    tfPagina.requestFocus();
                } catch( Exception e ){ } } }.start();
                
            }
            else if (evt.getKeyCode() == KeyEvent.VK_LEFT || evt.getKeyCode() == KeyEvent.VK_KP_LEFT) {
            
                img_Atual--;
                setarImg_Estatico();  
                new Thread() {   @Override public void run() { try { 
                    Thread.sleep( 100 );
                    tfPagina.requestFocus();
                    Thread.sleep( 1000 );
                    tfPagina.requestFocus();
                } catch( Exception e ){} } }.start();
            }
        } catch( Exception e ){}        
    }//GEN-LAST:event_tfPaginaKeyPressed

    private void btPosTreesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btPosTreesKeyPressed
        try{
            
            if (evt.getKeyCode() == KeyEvent.VK_RIGHT || evt.getKeyCode() == KeyEvent.VK_KP_RIGHT) {
             
                img_Atual++;
                setarImg_Estatico();  
                
                new Thread() {   @Override public void run() { try { 
                    Thread.sleep( 100 );
                    btPosTrees.requestFocus();
                    Thread.sleep( 1000 );
                    btPosTrees.requestFocus();
                } catch( Exception e ){ Exportando.fechar(); e.printStackTrace(); } } }.start();
                
            }
            else if (evt.getKeyCode() == KeyEvent.VK_LEFT || evt.getKeyCode() == KeyEvent.VK_KP_LEFT) {
            
                img_Atual--;
                setarImg_Estatico();  
                new Thread() {   @Override public void run() { try { 
                    Thread.sleep( 100 );
                    btPosTrees.requestFocus();
                    Thread.sleep( 1000 );
                    btPosTrees.requestFocus();
                } catch( Exception e ){ Exportando.fechar(); e.printStackTrace(); } } }.start();
            }
        } catch( Exception e ){}
    }//GEN-LAST:event_btPosTreesKeyPressed

    private void bt_criar_exeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_criar_exeMousePressed
        //String assunto_recebido = materia_X + " > " + subcaegoria_X + " > " + assunto_X.toUpperCase();
        //Home.criar_exercicios(assunto_recebido);
        if( bt_criar_exe.isEnabled() ){
            new Thread() {   @Override public void run() { try {         
            
                bt_criar_exe.setEnabled(false);
                        
                //if(BookInfo.tipoNoBanco.equals("ASSUNTO")){
                
                    Exercicis_Busca_Por_ID_Assunto Exercicis_Busca_Por_ID_Assunto = new Exercicis_Busca_Por_ID_Assunto( Home, id_AssuntoBanco ); 
                    Exercicis_Busca_Por_ID_Assunto.criar_exercicios();
                //}
                
                bt_criar_exe.setEnabled(true);
                
            } catch( Exception e ){ bt_criar_exe.setEnabled(true); } } }.start();  
        }
    }//GEN-LAST:event_bt_criar_exeMousePressed

    private void bt_fazer_exeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_fazer_exeMousePressed
        //String assunto_t = materia_X + " > " + subcaegoria_X + " > " + assunto_X.toUpperCase();
        //Home.fazer_Exercicios(assunto_t);
        if( bt_fazer_exe.isEnabled() ){
            new Thread() {   @Override public void run() { try {         
            
                bt_fazer_exe.setEnabled(false);
                        
                //if(BookInfo.tipoNoBanco.equals("ASSUNTO")){
                
                    Exercicis_Busca_Por_ID_Assunto Exercicis_Busca_Por_ID_Assunto = new Exercicis_Busca_Por_ID_Assunto( Home, id_AssuntoBanco ); 
                    Exercicis_Busca_Por_ID_Assunto.fazer_Exercicios();
                //}
                
                bt_fazer_exe.setEnabled(true);
                
            } catch( Exception e ){ bt_fazer_exe.setEnabled(true); } } }.start();  
        }
    }//GEN-LAST:event_bt_fazer_exeMousePressed

    private void splitPane( int zeroOuUm ){
        //spPrincipal.setDividerLocation(80);
        try{
            
            BasicSplitPaneUI ui = (BasicSplitPaneUI)JPHtmlPrincipal.jSplitPaneHtmlPrincipal.getUI();
            JButton oneClick = (JButton)ui.getDivider().getComponent( zeroOuUm );
            oneClick.doClick();
        
        } catch( Exception e ){
            JOptionPane.showMessageDialog(null, "BarraJEditorPane - Método: splitPane\n" + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPosTrees;
    private javax.swing.JLabel bt_criar_exe;
    private javax.swing.JLabel bt_fazer_exe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbConteudo_Online;
    private javax.swing.JTextField tfPagina;
    // End of variables declaration//GEN-END:variables

    File file_ou_pasta;
    String[] listaDosArquivos;           
    int      qtdArquivos;
    private void setarPastaInicio(int img_Atual_x){ 

        try { 
            file_ou_pasta = new File( endereco_Externo_da_Pasta );
            
            if ( file_ou_pasta.exists() == true ) { 
                
                listaDosArquivos = file_ou_pasta.list();            
                qtdArquivos = listaDosArquivos.length;
            }
            
            setarImagemExterna(img_Atual_x);
        } catch( Exception e ){ } 
    }
    
    private void setarImagemExterna( int img_Atual2 ){ 
        img_Atual = img_Atual2;
        
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 );

                if( (img_Atual < qtdArquivos) && (img_Atual >= 0) ){
                
                    File img = new File( file_ou_pasta, listaDosArquivos[ img_Atual ] );

                    BufferedImage bufImg = null;
                    ImageIcon     icon   = null;
                    Image         image  = null;
                    try{
                        bufImg = ImageIO.read( img );
                        icon   = new ImageIcon(bufImg);
                        image  = icon.getImage();//ImageIO.read(f);  
                    } catch (IOException ex) {}  

                    try {  
                        image = icon.getImage();//ImageIO.read(f);  
                        int widith = image.getWidth(icon.getImageObserver() ) + largura;
                        int height = image.getHeight(icon.getImageObserver() )+ altura;
                                                                        
                        lbConteudo_Online.setIcon(new ImageIcon(image.getScaledInstance(
                            widith, height, Image.SCALE_DEFAULT)));
                       
                    }catch(Exception ex){}
                
                    String nome = img.getName();
                    String nomeList[] = nome.split(Pattern.quote("."));
                }
                else{   
                    if( img_Atual <= 0){
                        int qtd_Arquivos_da_Pasta = qtdArquivos-1;
                        img_Atual = qtd_Arquivos_da_Pasta;
                    }
                    else{
                        img_Atual = 0;
                    }
                    
                    File img = new File( file_ou_pasta, listaDosArquivos[ img_Atual ] );

                    BufferedImage bufImg = null;
                    ImageIcon     icon   = null;
                    Image         image  = null;
                    try{
                        bufImg = ImageIO.read( img );
                        icon   = new ImageIcon(bufImg);
                        image  = icon.getImage();//ImageIO.read(f);  
                    } catch (IOException ex) {}  

                    try {  
                        image = icon.getImage();//ImageIO.read(f);  
                        int widith = image.getWidth(icon.getImageObserver() ) + largura;
                        int height = image.getHeight(icon.getImageObserver() )+ altura;
                                                                        
                        lbConteudo_Online.setIcon(new ImageIcon(image.getScaledInstance(
                            widith, height, Image.SCALE_DEFAULT)));
                        
                    }catch(Exception ex){}
                
                    String nome = img.getName();
                    String nomeList[] = nome.split(Pattern.quote("."));
                }
            
        } catch( InterruptedException e ){ } } }.start();
    }
    
    private void setarImg_Estatico() {                                     
        //setarImagemExterna(img_Atual);
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 );
            //if( jLabel9.isEnabled() == true ){
                //jLabel9.setEnabled(false);
                
                Exportando = new Exportando("ABRINDO...");
                Exportando.setVisible(true);Exportando.pbg.setMinimum(0);
                Exportando.pbg.setMaximum( 100 );
                Exportando.pbg.setValue( 50 );
            
                /*Home.ControleTabs.removerTabSelecionado();
                Home.ControleTabs.AddTabsAoHome("Visualizador Imagem Externa", "/imagens_internas/livroTp.gif", 
                        new Visualizador_Externo_De_Livros_De_Imagens(Home,img_Atual,endereco_Externo_da_Pasta,largura,altura) );*/
                setarImagemExterna(img_Atual);

                Exportando.fechar(); 
                //jLabel9.setEnabled(true);                
            //}
        } catch( Exception e ){ 
            Exportando.fechar(); e.printStackTrace();
            jLabel9.setEnabled(true);
            jLabel10.setEnabled(true);
            jLabel11.setEnabled(true);
        } } }.start();
    }
    
}