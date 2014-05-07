package formularios;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import parser.Cadastros;
import parser.Cliente;
import parser.XML;

//<editor-fold defaultstate="collapsed" desc="Desenvolvedores">
/*
 * @authors Ramon Honorio, Maikon Evangelista, João Paulo Silva
 */
//</editor-fold>
public class Editar extends javax.swing.JFrame {
//<editor-fold defaultstate="collapsed" desc="INFORMAÇÕES DO CLIENTE">
    /*  
        0 - codigo do cliente
        1 - nome completo
        2 - cpf
        3 - telefone
        4 - cidade/estado
        5 - endereço
        6 - email
        7 - nome do programa
        8 - plataforma
        9 - descrição
    */
//</editor-fold>
    int qtdClientes = 0, atual = 0;
    Cliente[] cliente;
    Cadastros cadastros = new Cadastros();
    String destino = "./src/arquivos/db/";
    XML xml = new XML(destino);
    
    //<editor-fold defaultstate="collapsed" desc="método construtor Editar()">
    public Editar() {
        /*initComponents();
        try {
            leituraInicial();
        } catch(FileNotFoundException e){
            System.out.println("Arquivo não encontrado "+e);
        }
        preencherCampos();*/
        inicializar();
    }
//</editor-fold>

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGrupoPlataforma = new javax.swing.ButtonGroup();
        lblNome = new javax.swing.JLabel();
        lblIdade = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        lblEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lblTel = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        lblPlataforma = new javax.swing.JLabel();
        lblPrograma = new javax.swing.JLabel();
        txtPrograma = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblinf1 = new javax.swing.JLabel();
        lblinf2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        botaoVoltar = new javax.swing.JButton();
        labelClientesCad = new javax.swing.JLabel();
        txtCadastros = new javax.swing.JTextField();
        botaoProximo = new javax.swing.JButton();
        botaoAnterior = new javax.swing.JButton();
        lblCod = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        botaoSalvar = new javax.swing.JButton();
        radioWeb = new javax.swing.JRadioButton();
        radioDesk = new javax.swing.JRadioButton();
        radioMobile = new javax.swing.JRadioButton();
        radioOutra = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar");

        lblNome.setText("Nome:");

        lblIdade.setText("CPF:");

        lblDescricao.setText("Descrição:");

        jScrollPane2.setFocusable(false);

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane2.setViewportView(txtDescricao);

        lblEndereco.setText("Endereço:");

        lblTel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTel.setText("Telefone:");
        lblTel.setFocusable(false);

        txtTel.setEditable(false);

        lblPlataforma.setText("Plataforma:");

        lblPrograma.setText("Nome do programa:");

        lblCidade.setText("Cidade/Estado:");

        lblinf1.setText("Informações do cliente");

        lblinf2.setText("Informações do projeto");

        lblEmail.setText("Email:");

        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        labelClientesCad.setText("Clientes cadastrados: ");

        txtCadastros.setEditable(false);
        txtCadastros.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCadastros.setFocusable(false);
        txtCadastros.setRequestFocusEnabled(false);

        botaoProximo.setText("Próximo >");
        botaoProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProximoActionPerformed(evt);
            }
        });

        botaoAnterior.setText("< Anterior");
        botaoAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAnteriorActionPerformed(evt);
            }
        });

        lblCod.setText("Codigo do cliente:");

        txtCod.setEditable(false);
        txtCod.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCod.setFocusable(false);
        txtCod.setRequestFocusEnabled(false);

        botaoSalvar.setText("Salvar Alterações");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        bGrupoPlataforma.add(radioWeb);
        radioWeb.setSelected(true);
        radioWeb.setText("Web");

        bGrupoPlataforma.add(radioDesk);
        radioDesk.setText("Desktop");

        bGrupoPlataforma.add(radioMobile);
        radioMobile.setText("Mobile");

        bGrupoPlataforma.add(radioOutra);
        radioOutra.setText("Outra");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelClientesCad)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtCadastros, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(203, 203, 203))
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblinf1)
                            .addComponent(lblCod))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIdade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPlataforma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPrograma)
                                    .addComponent(lblinf2))
                                .addGap(0, 20, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEmail)
                            .addComponent(txtCidade)
                            .addComponent(txtEndereco)
                            .addComponent(txtNome)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtPrograma, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                                .addComponent(botaoAnterior)
                                .addGap(18, 18, 18)
                                .addComponent(botaoProximo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioWeb)
                                .addGap(52, 52, 52)
                                .addComponent(radioDesk)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radioMobile)
                                .addGap(42, 42, 42)
                                .addComponent(radioOutra)))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblinf1, lblinf2});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botaoSalvar, botaoVoltar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCadastros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelClientesCad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblinf1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCod)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoProximo)
                    .addComponent(botaoAnterior))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome)
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTel)
                    .addComponent(lblIdade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEndereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblinf2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrograma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radioWeb)
                        .addComponent(radioDesk)
                        .addComponent(radioMobile)
                        .addComponent(radioOutra))
                    .addComponent(lblPlataforma))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescricao)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVoltar)
                    .addComponent(botaoSalvar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        // TODO add your handling code here:
        //System.exit(0);
        cadastros.proximo=0;
        dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAnteriorActionPerformed
        // TODO add your handling code here:
        anterior();
        preencherCampos();
    }//GEN-LAST:event_botaoAnteriorActionPerformed

    private void botaoProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProximoActionPerformed
        // TODO add your handling code here:
        proximo();
        preencherCampos();
    }//GEN-LAST:event_botaoProximoActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        // TODO add your handling code here:
        alteracoes();
        try {
            xml.salvarClientes(cliente);
        } catch (IOException ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed
    
    //<editor-fold defaultstate="collapsed" desc="leituraInicial()">
    void leituraInicial() throws FileNotFoundException{
        cliente = xml.lerClientes();
        //System.out.println(cliente.length);
        
        if(haClientes()){
            cadastros.proximo = ultimoCliente(cliente).cod;
//<editor-fold defaultstate="collapsed" desc="rascunhos">
            //cad = xml.lerCadastros();
            //qtdClientes = cliente.length;
//</editor-fold>
            for (int i = 0; i <= cadastros.proximo; i++) {
                try {
                    if(cliente[i]!=null){
                        qtdClientes = i;
                    }
                } catch (NullPointerException e) {
                    System.out.println("Cliente com valor nulo - leituraInicial()");
                } catch (ArrayIndexOutOfBoundsException x){}
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não há clientes cadastrados.", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="inicializar()">
    public void inicializar(){
        try {
            leituraInicial();
            initComponents();
            cadastros.proximo=0;
            preencherCampos();
        } catch(FileNotFoundException e){
            System.out.println("Arquivo não encontrado "+e);
        } catch (NullPointerException e){
            System.out.println(">> Não há clientes cadastrados.");
        }
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="preencherCampos()">
    void preencherCampos(){
        txtCadastros.setText(String.valueOf(qtdClientes+1));
        txtCod.setText(String.valueOf(cliente[atual].cod));
        txtNome.setText(cliente[atual].nome);
        txtCPF.setText(cliente[atual].cpf);
        txtTel.setText(cliente[atual].telefone);
        txtCidade.setText(cliente[atual].cidade);
        txtEndereco.setText(cliente[atual].endereco);
        txtEmail.setText(cliente[atual].email);
        txtPrograma.setText(cliente[atual].programa);
        //txtPlataforma.setText(cliente[atual].plataforma);
        txtDescricao.setText(cliente[atual].descricao);
        
        //resetarBotoes();
        selecBotaoPlataforma(cliente[atual].plataforma);
        
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="resetarBotoes">
    void resetarBotoes(){
        radioWeb.setSelected(false);
        radioDesk.setSelected(false);
        radioMobile.setSelected(false);
        radioOutra.setSelected(false);
        radioWeb.setEnabled(false);
        radioMobile.setEnabled(false);
        radioDesk.setEnabled(false);
        radioOutra.setEnabled(false);
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="selecBotaoPlataforma()">
    void selecBotaoPlataforma(String p){
        switch(p){
            case "Web":
                //radioWeb.setEnabled(true);
                radioWeb.setSelected(true);
                break;
            case "Desktop":
                //radioDesk.setEnabled(true);
                radioDesk.setSelected(true);
                break;
            case "Mobile":
                //radioMobile.setEnabled(true);
                radioMobile.setSelected(true);
                break;
            case "Outra":
                //radioOutra.setEnabled(true);
                radioOutra.setSelected(true);
                break;
        }
    }
//</editor-fold>*/
    
    //<editor-fold defaultstate="collapsed" desc="proximo()">
    void proximo(){
        if(atual<qtdClientes){
            ++atual;
        } else {
            atual = 0;
        }
        //System.out.println("> Atual: "+atual);
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="anterior()">
    void anterior(){
        if(atual>0){
            --atual;
        } else {
            atual = qtdClientes;
        }
        //System.out.println("> Atual: "+atual);
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="ultimoCliente(Cliente[] c)">
    Cliente ultimoCliente(Cliente[] c){
        int ultimo = 0;
        
        for (int i = 0; i < c.length; i++) {
            if(c[i]==null){
                if(i!=0) ultimo = i-1;
                break;
            }
        }
        return c[ultimo];
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="alteracoes()">
    void alteracoes(){
        
        cliente[atual].cod = atual;
        cliente[atual].nome = txtNome.getText();
        cliente[atual].cpf = txtCPF.getText();
        cliente[atual].telefone = txtTel.getText();
        cliente[atual].cidade = txtCidade.getText();
        cliente[atual].endereco = txtEndereco.getText();
        cliente[atual].email = txtEmail.getText();
        cliente[atual].programa = txtPrograma.getText();
        cliente[atual].descricao = txtDescricao.getText();
        
        if(radioWeb.isSelected()){
            cliente[atual].plataforma = "Web";
        } else if(radioDesk.isSelected()){
            cliente[atual].plataforma = "Desktop";
        } else if(radioMobile.isSelected()){
            cliente[atual].plataforma = "Mobile";
        } else {
            cliente[atual].plataforma = "Outra";
        }
        
        //cad.numero=cadastros;
        System.out.println("> Alterações (CLIENTE "+(atual)+") realizadas.");
        JOptionPane.showMessageDialog(null, "As alterações foram realizadas.", 
                "Cliente (CODIGO: "+atual+")", JOptionPane.INFORMATION_MESSAGE);
    }
//</editor-fold>
    
    public boolean haClientes(){
        return cliente[0]!=null;
    }
    
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
            java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editar().setVisible(true);
            }
        });
    }
//</editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGrupoPlataforma;
    private javax.swing.JButton botaoAnterior;
    private javax.swing.JButton botaoProximo;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelClientesCad;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPlataforma;
    private javax.swing.JLabel lblPrograma;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblinf1;
    private javax.swing.JLabel lblinf2;
    private javax.swing.JRadioButton radioDesk;
    private javax.swing.JRadioButton radioMobile;
    private javax.swing.JRadioButton radioOutra;
    private javax.swing.JRadioButton radioWeb;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCadastros;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPrograma;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
