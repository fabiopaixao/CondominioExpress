/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author Tarcísio
 */

  
  
public class JFMenu extends javax.swing.JFrame {

    /**
     * Creates new form JFMenu
     */
public JFMenu() {
initComponents();

new Thread(){
@Override
public void run (){
for(;;){
dataEhora();

try {
sleep(1000);

} catch (InterruptedException ie) {
ie.printStackTrace();
}

}
}

}.start();

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
        jLabel2 = new javax.swing.JLabel();
        jData = new javax.swing.JLabel();
        jHora = new javax.swing.JLabel();
        jDesktop = new javax.swing.JDesktopPane();
        try {
            fundo =(javax.swing.JLabel)java.beans.Beans.instantiate(getClass().getClassLoader(), "Visao.JFMenu_jLabel3");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCondomino = new javax.swing.JMenuItem();
        jMenuItemApartamentos = new javax.swing.JMenuItem();
        jMenuItemVeiculos = new javax.swing.JMenuItem();
        jMenuItemPrestadorServicos = new javax.swing.JMenuItem();
        jMenuItemVisitantes = new javax.swing.JMenuItem();
        jMenuItemFuncionarios = new javax.swing.JMenuItem();
        jMenuItemUsuarios = new javax.swing.JMenuItem();
        jMenuPortaria = new javax.swing.JMenu();
        jMenuItemOcorrencia = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuRelatorio = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuItemSobre = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Condomínio Express  |  Menu Principal");
        setExtendedState(6);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Seja bem-vindo ao sistema Condomínio Express");

        jData.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/icones painel/calendario.png"))); // NOI18N
        jData.setText(" Data");

        jHora.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jHora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/icones painel/relogio.png"))); // NOI18N
        jHora.setText(" Hora");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 307, Short.MAX_VALUE)
                .addComponent(jData)
                .addGap(45, 45, 45)
                .addComponent(jHora)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jData)
                    .addComponent(jHora))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jDesktop.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jDesktop.add(fundo);
        fundo.setBounds(0, 0, 1920, 1080);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jMenuCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/icones menu/menu.png"))); // NOI18N
        jMenuCadastro.setText("Menu   ");
        jMenuCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuCadastro.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jMenuCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroActionPerformed(evt);
            }
        });

        jMenuItemCondomino.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jMenuItemCondomino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/icones menu/condomino.png"))); // NOI18N
        jMenuItemCondomino.setText("Condômino");
        jMenuItemCondomino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemCondomino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCondominoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCondomino);

        jMenuItemApartamentos.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jMenuItemApartamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/icones menu/Apartamento.png"))); // NOI18N
        jMenuItemApartamentos.setText("Apartamento");
        jMenuItemApartamentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemApartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemApartamentosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemApartamentos);

        jMenuItemVeiculos.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jMenuItemVeiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/icones menu/veiculo.png"))); // NOI18N
        jMenuItemVeiculos.setText("Veículo");
        jMenuItemVeiculos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVeiculosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemVeiculos);

        jMenuItemPrestadorServicos.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jMenuItemPrestadorServicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/icones menu/PrestadorServico.png"))); // NOI18N
        jMenuItemPrestadorServicos.setText("Prestador de serviço");
        jMenuItemPrestadorServicos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemPrestadorServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPrestadorServicosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemPrestadorServicos);

        jMenuItemVisitantes.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jMenuItemVisitantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/icones menu/visitante.png"))); // NOI18N
        jMenuItemVisitantes.setText("Visitante");
        jMenuItemVisitantes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemVisitantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVisitantesActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemVisitantes);

        jMenuItemFuncionarios.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jMenuItemFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/icones menu/funcionario.png"))); // NOI18N
        jMenuItemFuncionarios.setText("Funcionário");
        jMenuItemFuncionarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFuncionariosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemFuncionarios);

        jMenuItemUsuarios.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jMenuItemUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/icones menu/usuario.png"))); // NOI18N
        jMenuItemUsuarios.setText("Usuário");
        jMenuItemUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuariosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemUsuarios);

        jMenuBar1.add(jMenuCadastro);
        jMenuCadastro.getAccessibleContext().setAccessibleName("Menu   ");

        jMenuPortaria.setText("Portaria   ");
        jMenuPortaria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuPortaria.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jMenuItemOcorrencia.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jMenuItemOcorrencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/icones menu/ocorrencias.png"))); // NOI18N
        jMenuItemOcorrencia.setText("Ocorrência");
        jMenuItemOcorrencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemOcorrencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemOcorrenciaActionPerformed(evt);
            }
        });
        jMenuPortaria.add(jMenuItemOcorrencia);

        jMenuItem2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/icones menu/entradasaida.png"))); // NOI18N
        jMenuItem2.setText("Entrada Visitante");
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuPortaria.add(jMenuItem2);

        jMenuBar1.add(jMenuPortaria);

        jMenuRelatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuRelatorio.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jMenuRelatorio.setLabel("Relatórios   ");

        jMenuItem5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/icones menu/Relatoriousuario.png"))); // NOI18N
        jMenuItem5.setText("Condôminos");
        jMenuItem5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuRelatorio.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/icones menu/relatorio-1.png"))); // NOI18N
        jMenuItem6.setText("Apartamentos");
        jMenuItem6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuRelatorio.add(jMenuItem6);

        jMenuBar1.add(jMenuRelatorio);

        jMenuAjuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuAjuda.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jMenuAjuda.setLabel("Ajuda   ");

        jMenuItemSobre.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jMenuItemSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/icones menu/sobre.png"))); // NOI18N
        jMenuItemSobre.setText("Sobre");
        jMenuItemSobre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSobreActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jMenuItemSobre);

        jMenuBar1.add(jMenuAjuda);

        jMenuSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuSair.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jMenuSair.setLabel("Sair   ");

        jMenuItem1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/icones menu/fechar.png"))); // NOI18N
        jMenuItem1.setText("Sair do Sistema");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItem1);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(801, 529));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
     System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Data do Sistema
        
       
        
          // Hora do Sistema
        
     
    }//GEN-LAST:event_formWindowOpened

    private void jMenuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroActionPerformed

    }//GEN-LAST:event_jMenuCadastroActionPerformed

    private void jMenuItemCondominoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCondominoActionPerformed
       JFCADCondominio JFCADCondo = new   JFCADCondominio();
        jDesktop.add(JFCADCondo);
         JFCADCondo.setVisible(true);
         JFCADCondo.setPosicao(); 
    }//GEN-LAST:event_jMenuItemCondominoActionPerformed

    private void jMenuItemApartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemApartamentosActionPerformed
   JFCADApartamento JFCApart = new   JFCADApartamento();
        jDesktop.add(JFCApart);
         JFCApart.setVisible(true);
         JFCApart.setPosicao(); 
    }//GEN-LAST:event_jMenuItemApartamentosActionPerformed

    private void jMenuItemVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVeiculosActionPerformed
        JFCADVeiculos JFCVeiculo = new   JFCADVeiculos();
        jDesktop.add(JFCVeiculo);
         JFCVeiculo.setVisible(true);
         JFCVeiculo.setPosicao();
    }//GEN-LAST:event_jMenuItemVeiculosActionPerformed

    private void jMenuItemPrestadorServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPrestadorServicosActionPerformed
        JFCADPrestador JFCprestador = new JFCADPrestador ();
        jDesktop.add(JFCprestador);
        JFCprestador.setVisible(true);
        JFCprestador.setPosicao();
    }//GEN-LAST:event_jMenuItemPrestadorServicosActionPerformed

    private void jMenuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSobreActionPerformed
       JFInfo jfinfo = new JFInfo();
        jDesktop.add( jfinfo);
       jfinfo.setVisible(true);
         jfinfo.setPosicao();
    }//GEN-LAST:event_jMenuItemSobreActionPerformed

    private void jMenuItemVisitantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVisitantesActionPerformed
        JFCADVisitantes cadvisitantes = new  JFCADVisitantes ();
        jDesktop.add( cadvisitantes );
       cadvisitantes.setVisible(true);
       cadvisitantes.setPosicao();
    }//GEN-LAST:event_jMenuItemVisitantesActionPerformed

    private void jMenuItemFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFuncionariosActionPerformed
     JFCADfuncionarios cadfuncionarios = new JFCADfuncionarios();
     jDesktop.add(cadfuncionarios);
     cadfuncionarios.setVisible(true);
      cadfuncionarios.setPosicao();
    }//GEN-LAST:event_jMenuItemFuncionariosActionPerformed

    private void jMenuItemUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuariosActionPerformed
    JFCADUsuarios cadusuarios = new JFCADUsuarios();
    jDesktop.add(cadusuarios);
    cadusuarios.setVisible(true);
    cadusuarios.setPosicao();
    }//GEN-LAST:event_jMenuItemUsuariosActionPerformed

    private void jMenuItemOcorrenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOcorrenciaActionPerformed
   JFCADocorrencia cadocorrencias = new   JFCADocorrencia();
   jDesktop.add(cadocorrencias);
   cadocorrencias.setVisible(true);
   cadocorrencias.setPosicao();
    }//GEN-LAST:event_jMenuItemOcorrenciaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
   JFCADentrada cadentrada = new   JFCADentrada();
   jDesktop.add(cadentrada);
   cadentrada.setVisible(true);
   cadentrada.setPosicao();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     * 
     */
    public void dataEhora(){
Calendar cal = new GregorianCalendar();
int dia = cal.get(Calendar.DAY_OF_MONTH);
int mes = cal.get(Calendar.MONTH);
int ano = cal.get(Calendar.YEAR);
int hora = cal.get (Calendar.HOUR_OF_DAY);     
int minuto = cal.get (Calendar.MINUTE);  
int segundo = cal.get (Calendar.SECOND);

jData.setText("Data: "+dia+"/"+(mes+1)+"/"+ano);
jHora.setText("Hora: "+hora+":"+minuto+":"+segundo);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel jData;
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JLabel jHora;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItemApartamentos;
    private javax.swing.JMenuItem jMenuItemCondomino;
    private javax.swing.JMenuItem jMenuItemFuncionarios;
    private javax.swing.JMenuItem jMenuItemOcorrencia;
    private javax.swing.JMenuItem jMenuItemPrestadorServicos;
    private javax.swing.JMenuItem jMenuItemSobre;
    private javax.swing.JMenuItem jMenuItemUsuarios;
    private javax.swing.JMenuItem jMenuItemVeiculos;
    private javax.swing.JMenuItem jMenuItemVisitantes;
    private javax.swing.JMenu jMenuPortaria;
    private javax.swing.JMenu jMenuRelatorio;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables


    }





