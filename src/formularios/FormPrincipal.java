/*
 * Ícones retirados de  www.iconarchive.com
 *                      Artista: Oxygen Team
 */

package formularios;

//<editor-fold defaultstate="collapsed" desc="Desenvolvedores">

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @authors Ramon Honorio, Maikon Evangelista, João Paulo Silva
 */
//</editor-fold>
public class FormPrincipal extends javax.swing.JFrame {
    
    Cadastro cadastro;
    Remover remover;
    Editar editar;
    Consulta consulta;
    
    //<editor-fold defaultstate="collapsed" desc="Construtor FormPrincipal()">
    public FormPrincipal() {
        initComponents();
    }
//</editor-fold>

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoAdd = new javax.swing.JButton();
        botaoRem = new javax.swing.JButton();
        botaoConsulta = new javax.swing.JButton();
        botaoEdit = new javax.swing.JButton();
        lblAdd = new javax.swing.JLabel();
        lblRem = new javax.swing.JLabel();
        lblEdit = new javax.swing.JLabel();
        lblConsultar = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto Integrador");

        botaoAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arquivos/icones/add.png"))); // NOI18N
        botaoAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAddActionPerformed(evt);
            }
        });

        botaoRem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arquivos/icones/remove.png"))); // NOI18N
        botaoRem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemActionPerformed(evt);
            }
        });

        botaoConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arquivos/icones/consulta.png"))); // NOI18N
        botaoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultaActionPerformed(evt);
            }
        });

        botaoEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arquivos/icones/edit.png"))); // NOI18N
        botaoEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditActionPerformed(evt);
            }
        });

        lblAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdd.setText("Cadastrar");
        lblAdd.setPreferredSize(null);

        lblRem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRem.setText("Remover");
        lblRem.setPreferredSize(null);

        lblEdit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEdit.setText("Editar");
        lblEdit.setPreferredSize(null);

        lblConsultar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConsultar.setText("Consultar");
        lblConsultar.setPreferredSize(null);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblTitulo.setText("Cadastro de Clientes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoAdd))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botaoRem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblRem, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botaoEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botaoConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoConsulta)
                    .addComponent(botaoEdit)
                    .addComponent(botaoRem)
                    .addComponent(botaoAdd))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAddActionPerformed
        cadastro = new Cadastro();
        cadastro.setVisible(true);
    }//GEN-LAST:event_botaoAddActionPerformed

    private void botaoRemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemActionPerformed
        // TODO add your handling code here:
        remover = new Remover();
        remover.setVisible(true);
    }//GEN-LAST:event_botaoRemActionPerformed

    private void botaoEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditActionPerformed
        // TODO add your handling code here:
        editar = new Editar();
        editar.setVisible(true);
    }//GEN-LAST:event_botaoEditActionPerformed

    private void botaoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultaActionPerformed
        // TODO add your handling code here:
        consulta = new Consulta();
        consulta.setVisible(true);
    }//GEN-LAST:event_botaoConsultaActionPerformed
    
    //<editor-fold defaultstate="collapsed" desc="Método Main()">
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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }
//</editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdd;
    private javax.swing.JButton botaoConsulta;
    private javax.swing.JButton botaoEdit;
    private javax.swing.JButton botaoRem;
    private javax.swing.JLabel lblAdd;
    private javax.swing.JLabel lblConsultar;
    private javax.swing.JLabel lblEdit;
    private javax.swing.JLabel lblRem;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
