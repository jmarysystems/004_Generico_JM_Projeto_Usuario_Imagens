/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package home_controle_menus_norte.menu_01_jm_Usuarios_Imagens;

import br.com.jmary.home.Home;
import br.com.jmary.utilidades.JOPM;
import home_controle_menus_norte.Controle_de_Alterar_Menu_Norte;
import home_controle_menus_norte.menu_01_jm_Conexao_Com_Banco_De_Dados.Menu_1_JM_Conexao_Com_Banco_De_Dados;
import home_controle_menus_norte.menu_01_jm_Criar_Banco_De_Dados.Menu_1_JM_Criar_Banco_De_Dados;
import home_controle_menus_norte.menu_01_jm_Usuarios_do_Sistema.Menu_1_JM_Usuarios_do_Sistema;
import home_controle_menus_norte.menu_01_jm_login.Menu_1_JM_Login;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author AnaMariana
 */
public class Menu_1_JM extends javax.swing.JPanel {
    private static final long serialVersionUID = 1L;
    
    Home Home;
    Controle_de_Alterar_Menu_Norte Controle_de_Alterar_Menu_Norte;
    //Sistema_Home  Sistema_Home;
    
    Alterar_Seta_Submenu Alterar_Seta_Submenu;

    /**
     * Creates new form PnHomeDesigner
     * @param Home2
     * @param Controle_de_Alterar_Menu_Norte2
     */
    public Menu_1_JM( Home Home2, Controle_de_Alterar_Menu_Norte Controle_de_Alterar_Menu_Norte2 ) {
        initComponents();
        ((BasicInternalFrameUI)Fonema_E_Letra_Frame_Interno.getUI()).setNorthPane(null); //retirar o painel superior 
        
        Home = Home2;
        Controle_de_Alterar_Menu_Norte = Controle_de_Alterar_Menu_Norte2;
        //Sistema_Home  = Fonema_E_Letra_Home2;
        
        //Habilita troca de seta
        Alterar_Seta_Submenu = new Alterar_Seta_Submenu( this, Controle_de_Alterar_Menu_Norte, Home );
                        
        inicio();
    }
    
    private void inicio(){
        
        //mnConfiguracoes.setVisible(false);        
        Home.Home_Frame_Interno.setJMenuBar( Fonema_E_Letra_Barra_Menu );               
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fonema_E_Letra_Frame_Interno = new javax.swing.JInternalFrame();
        Fonema_E_Letra_Barra_Menu = new javax.swing.JMenuBar();
        menu_seta = new javax.swing.JMenu();
        menu_ajuda = new javax.swing.JMenu();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menu_maimais = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        Fonema_E_Letra_Frame_Interno.setBorder(null);
        Fonema_E_Letra_Frame_Interno.setVisible(true);

        menu_seta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_controle_menus_norte/imagens/seta_para_cima.png"))); // NOI18N
        menu_seta.setToolTipText("Ocultar Submenu");
        menu_seta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_setaMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu_setaMousePressed(evt);
            }
        });
        Fonema_E_Letra_Barra_Menu.add(menu_seta);

        menu_ajuda.setText("Ajuda");
        menu_ajuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_ajudaMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu_ajudaMousePressed(evt);
            }
        });
        menu_ajuda.add(jSeparator3);

        Fonema_E_Letra_Barra_Menu.add(menu_ajuda);

        menu_maimais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_controle_menus_norte/imagens/maismais.gif"))); // NOI18N
        menu_maimais.setText("++");
        menu_maimais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_maimaisMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu_maimaisMousePressed(evt);
            }
        });
        menu_maimais.add(jSeparator1);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_controle_menus_norte/imagens/ip_conexao.png"))); // NOI18N
        jMenuItem4.setText("Login / Trocar de Usuário");
        jMenuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuItem4MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem4MousePressed(evt);
            }
        });
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menu_maimais.add(jMenuItem4);
        menu_maimais.add(jSeparator6);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_controle_menus_norte/imagens/usuarios.gif"))); // NOI18N
        jMenuItem1.setText("Usuários do Sistema");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem1MousePressed(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menu_maimais.add(jMenuItem1);
        menu_maimais.add(jSeparator5);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_controle_menus_norte/imagens/sql.png"))); // NOI18N
        jMenuItem3.setText("Conexão Banco de Dados");
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuItem3MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem3MousePressed(evt);
            }
        });
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menu_maimais.add(jMenuItem3);
        menu_maimais.add(jSeparator4);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_controle_menus_norte/imagens/sql.png"))); // NOI18N
        jMenuItem2.setText("Criar Banco de Dados");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem2MousePressed(evt);
            }
        });
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menu_maimais.add(jMenuItem2);

        Fonema_E_Letra_Barra_Menu.add(menu_maimais);

        Fonema_E_Letra_Frame_Interno.setJMenuBar(Fonema_E_Letra_Barra_Menu);

        javax.swing.GroupLayout Fonema_E_Letra_Frame_InternoLayout = new javax.swing.GroupLayout(Fonema_E_Letra_Frame_Interno.getContentPane());
        Fonema_E_Letra_Frame_Interno.getContentPane().setLayout(Fonema_E_Letra_Frame_InternoLayout);
        Fonema_E_Letra_Frame_InternoLayout.setHorizontalGroup(
            Fonema_E_Letra_Frame_InternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 563, Short.MAX_VALUE)
        );
        Fonema_E_Letra_Frame_InternoLayout.setVerticalGroup(
            Fonema_E_Letra_Frame_InternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fonema_E_Letra_Frame_Interno)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Fonema_E_Letra_Frame_Interno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 79, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void menu_setaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_setaMousePressed
        Home.tocarSon.tocar( 51 );
        Alterar_Seta_Submenu.tabJanelaSubmenu( this.menu_seta );
    }//GEN-LAST:event_menu_setaMousePressed

    
    private void menu_ajudaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_ajudaMousePressed
        //Sistema_Home.adicionarSubmenu(new Submenu2( Sistema_Home ) );     
    }//GEN-LAST:event_menu_ajudaMousePressed

    private void menu_maimaisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_maimaisMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_maimaisMousePressed

    private void jMenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MousePressed
        Home.tocarSon.tocar( 51 );
        try{
            
            Home.Controle_de_Alterar_Menu_Norte.adicionarSubmenu(new Menu_1_JM_Usuarios_do_Sistema( Home, Home.Controle_de_Alterar_Menu_Norte ) );
            
        } catch( Exception e ){ e.printStackTrace(); JOPM JOptionPaneMod = new JOPM( 2, "adicionarSubmenu( Component c ), \n"
                + e.getMessage() + "\n", "Classe: " + "Controle_de_Alterar_Menu_Norte" ); }
    }//GEN-LAST:event_jMenuItem1MousePressed

    private void menu_maimaisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_maimaisMouseEntered
        Home.tocarSon.tocar( 51 );
    }//GEN-LAST:event_menu_maimaisMouseEntered

    private void jMenuItem1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseEntered
        Home.tocarSon.tocar( 51 );
    }//GEN-LAST:event_jMenuItem1MouseEntered

    private void menu_ajudaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_ajudaMouseEntered
        Home.tocarSon.tocar( 51 );
    }//GEN-LAST:event_menu_ajudaMouseEntered

    private void menu_setaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_setaMouseEntered
        Home.tocarSon.tocar( 51 );
    }//GEN-LAST:event_menu_setaMouseEntered

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2MouseEntered

    private void jMenuItem2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MousePressed
        Home.tocarSon.tocar( 51 );
        try{
            
            Home.Controle_de_Alterar_Menu_Norte.adicionarSubmenu(new Menu_1_JM_Criar_Banco_De_Dados( Home, Home.Controle_de_Alterar_Menu_Norte ) );
            
        } catch( Exception e ){ e.printStackTrace(); JOPM JOptionPaneMod = new JOPM( 2, "adicionarSubmenu( Component c ), \n"
                + e.getMessage() + "\n", "Classe: " + "Controle_de_Alterar_Menu_Norte" ); }
    }//GEN-LAST:event_jMenuItem2MousePressed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3MouseEntered

    private void jMenuItem3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MousePressed
        Home.tocarSon.tocar( 51 );
        try{
            
            Home.Controle_de_Alterar_Menu_Norte.adicionarSubmenu(new Menu_1_JM_Conexao_Com_Banco_De_Dados( Home, Home.Controle_de_Alterar_Menu_Norte ) );
            
        } catch( Exception e ){ e.printStackTrace(); JOPM JOptionPaneMod = new JOPM( 2, "adicionarSubmenu( Component c ), \n"
                + e.getMessage() + "\n", "Classe: " + "Controle_de_Alterar_Menu_Norte" ); }
    }//GEN-LAST:event_jMenuItem3MousePressed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4MouseEntered

    private void jMenuItem4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem4MousePressed
        Home.tocarSon.tocar( 51 );
        try{
            
            Home.Controle_de_Alterar_Menu_Norte.adicionarSubmenu(new Menu_1_JM_Login( Home, Home.Controle_de_Alterar_Menu_Norte ) );
            
        } catch( Exception e ){ e.printStackTrace(); JOPM JOptionPaneMod = new JOPM( 2, "adicionarSubmenu( Component c ), \n"
                + e.getMessage() + "\n", "Classe: " + "Controle_de_Alterar_Menu_Norte" ); }
    }//GEN-LAST:event_jMenuItem4MousePressed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Fonema_E_Letra_Barra_Menu;
    private javax.swing.JInternalFrame Fonema_E_Letra_Frame_Interno;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JMenu menu_ajuda;
    private javax.swing.JMenu menu_maimais;
    private javax.swing.JMenu menu_seta;
    // End of variables declaration//GEN-END:variables
            
}
