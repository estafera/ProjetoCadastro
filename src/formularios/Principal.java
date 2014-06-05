/*
 *  Projeto Integrador — 1º Semestre TADS — Turma B
 *  Raikon Project
 *
 *  @authors Ramon Honorio, Maikon Evangelista
 *
 *  Ícones retirados de  www.iconarchive.com
 *                      Artista: Oxygen Team
 */

package formularios;

import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {
    
    /*
    *   Variaveis dos formularios
    */
    Cadastro cadastro;
    Remover remover;
    Editar editar;
    Consulta consulta;
    EscolhaConsulta pesquisa;
    
    //<editor-fold defaultstate="collapsed" desc="Construtor FormPrincipal()">
    /*
    *   Inicializa os componentes da janela (JFrame)
    */
    public Principal() {
        initComponents();
    }
//</editor-fold>

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoCadastro = new javax.swing.JButton();
        botaoRem = new javax.swing.JButton();
        botaoConsulta = new javax.swing.JButton();
        botaoEdit = new javax.swing.JButton();
        lblCadastro = new javax.swing.JLabel();
        lblRem = new javax.swing.JLabel();
        lblEdit = new javax.swing.JLabel();
        lblConsultar = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblTitulo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto Integrador");

        botaoCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arquivos/icones/add.png"))); // NOI18N
        botaoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastroActionPerformed(evt);
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

        lblCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCadastro.setText("Cadastrar");
        lblCadastro.setPreferredSize(null);

        lblRem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRem.setText("Remover");
        lblRem.setPreferredSize(null);

        lblEdit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEdit.setText("Editar");
        lblEdit.setPreferredSize(null);

        lblConsultar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConsultar.setText("Consultar");
        lblConsultar.setPreferredSize(null);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 72)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("de Clientes");

        lblTitulo1.setFont(new java.awt.Font("Tahoma", 0, 72)); // NOI18N
        lblTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo1.setText("Cadastro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoCadastro))
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
                            .addComponent(lblConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTitulo))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblTitulo, lblTitulo1});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo1)
                .addGap(1, 1, 1)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoConsulta)
                    .addComponent(botaoEdit)
                    .addComponent(botaoRem)
                    .addComponent(botaoCadastro))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastroActionPerformed
        // Se o botão for clicado, a função abaixo será chamada.
        criarCadastro();
    }//GEN-LAST:event_botaoCadastroActionPerformed

    private void botaoRemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemActionPerformed
        // Se o botão for clicado, a função abaixo será chamada.
        criarRemover();
    }//GEN-LAST:event_botaoRemActionPerformed

    private void botaoEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditActionPerformed
        // Se o botão for clicado, a função abaixo será chamada.
        criarEditar();
    }//GEN-LAST:event_botaoEditActionPerformed

    private void botaoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultaActionPerformed
        // Se o botão for clicado, a função abaixo será chamada.
        escolherConsulta();
        
    }//GEN-LAST:event_botaoConsultaActionPerformed
    
    //<editor-fold defaultstate="collapsed" desc="opcoesConsulta()">
    public int opcoesConsulta(){
        /*
        *   Cria as opções do JOptionPane da consulta
        */
        Object[] op = {"Consulta Geral", "Pesquisar um único cliente"};
        
        return JOptionPane.showOptionDialog(null, "Escolha qual tipo de consulta deseja realizar:", "Consulta",
                0, 1, null, op, op);
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="escolherConsulta()">
    /*
    *   Verifica qual opção foi escolhida pelo usuário e chama as respectivas funções
    */
    public void escolherConsulta(){
        switch(opcoesConsulta()){
            case 0:
                criarConsulta();
                break;
            case 1:
                criarPesquisa();
                break;
        }
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="criarConsulta()">
    /*
    *   Cria a janela.
    *   Se existirem clientes: ela se torna visível
    *   Se não, é atribuido um valor nulo.
    */
    public void criarConsulta(){
        consulta = new Consulta();
        if(consulta.haClientes())
            consulta.setVisible(true);
        else
            consulta = null;
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="criarPesquisa()">
    /*
    *   Cria a janela.
    *   Se existirem clientes: ela se torna visível
    *   Se não, é atribuido um valor nulo.
    */
    public void criarPesquisa(){
        pesquisa = new EscolhaConsulta();
        if(pesquisa.haClientes())
            pesquisa.setVisible(true);
        else
            pesquisa = null;
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="criarEditar()">
    /*
    *   Cria a janela.
    *   Se existirem clientes: ela se torna visível
    *   Se não, é atribuido um valor nulo.
    */
    public void criarEditar(){
        editar = new Editar();
        if(editar.haClientes())
            editar.setVisible(true);
        else
            editar = null;
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="criarRemover()">
    /*
    *   Cria a janela.
    *   Se existirem clientes: ela se torna visível
    *   Se não, é atribuido um valor nulo.
    */
    public void criarRemover(){
        remover = new Remover();
        if(remover.haClientes())
            remover.setVisible(true);
        else
            remover = null;
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="criarCadastro()">
    /*
    *   Cria a janela, independentemente de existirem clientes ou não.
    */
    public void criarCadastro(){
        cadastro = new Cadastro();
        cadastro.setVisible(true);
    }
//</editor-fold>
    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
//</editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastro;
    private javax.swing.JButton botaoConsulta;
    private javax.swing.JButton botaoEdit;
    private javax.swing.JButton botaoRem;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblConsultar;
    private javax.swing.JLabel lblEdit;
    private javax.swing.JLabel lblRem;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    // End of variables declaration//GEN-END:variables
}
