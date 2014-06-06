/*
 *  Projeto Integrador — 1º Semestre TADS — Turma B
 *  Raikon Project
 *  @authors Ramon Honorio, Maikon Evangelista
 */

package formularios;

import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
import classes.Cliente;
import classes.XML;

//<editor-fold defaultstate="collapsed" desc="Desenvolvedores">
/*
 * @authors Ramon Honorio, Maikon Evangelista
 */
//</editor-fold>
public class Consulta extends javax.swing.JFrame {
    
    // Variaveis
    int ultimo = 0, atual = 0;
    String destino = "./src/arquivos/db/";
    
    // Vetor de clientes
    Cliente[] cliente;
    
    // Criando um objeto da classe XML
    XML xml = new XML(destino);
    
    //<editor-fold defaultstate="collapsed" desc="método construtor Consulta()">
    /*
    *   Construtor — quando a classe é criada, imediatamente o método 
    *   inicializar() é chamado.
    */
    public Consulta() {
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
        botaoProximo = new javax.swing.JButton();
        botaoAnterior = new javax.swing.JButton();
        lblCod = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        radioOutra = new javax.swing.JRadioButton();
        radioMobile = new javax.swing.JRadioButton();
        radioDesk = new javax.swing.JRadioButton();
        radioWeb = new javax.swing.JRadioButton();
        lblData = new javax.swing.JLabel();
        txtData = new javax.swing.JLabel();
        txtCadastros = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta");

        lblNome.setText("Nome:");

        lblIdade.setText("CPF:");

        lblDescricao.setText("Descrição:");

        txtNome.setEditable(false);

        txtCPF.setEditable(false);

        jScrollPane2.setFocusable(false);

        txtDescricao.setEditable(false);
        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane2.setViewportView(txtDescricao);

        lblEndereco.setText("Endereço:");

        txtEndereco.setEditable(false);

        lblTel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTel.setText("Telefone:");
        lblTel.setFocusable(false);

        txtTel.setEditable(false);

        lblPlataforma.setText("Plataforma:");

        lblPrograma.setText("Nome do programa:");

        txtPrograma.setEditable(false);

        lblCidade.setText("Cidade/Estado:");

        txtCidade.setEditable(false);

        lblinf1.setText("Informações do cliente");

        lblinf2.setText("Informações do projeto");

        txtEmail.setEditable(false);

        lblEmail.setText("Email:");

        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        labelClientesCad.setText("Clientes cadastrados: ");

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

        radioOutra.setText("Outra");

        radioMobile.setText("Mobile");

        radioDesk.setText("Desktop");

        radioWeb.setText("Web");

        lblData.setText("Cadastro realizado em");

        txtData.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtData.setText("28/05/2014 às 11:02");

        txtCadastros.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelClientesCad)
                        .addGap(33, 33, 33)
                        .addComponent(txtCadastros, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(203, 309, Short.MAX_VALUE))
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCod)
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
                                .addGap(0, 25, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail)
                            .addComponent(txtCidade)
                            .addComponent(txtEndereco)
                            .addComponent(txtNome)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTel)
                                .addGap(18, 18, 18)
                                .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtPrograma, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(lblData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtData)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioWeb)
                                .addGap(50, 50, 50)
                                .addComponent(radioDesk)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addComponent(radioMobile)
                                .addGap(50, 50, 50)
                                .addComponent(radioOutra))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblinf1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoAnterior)
                        .addGap(18, 18, 18)
                        .addComponent(botaoProximo)))
                .addGap(20, 20, 20))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblinf1, lblinf2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelClientesCad)
                    .addComponent(txtCadastros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoProximo)
                        .addComponent(botaoAnterior))
                    .addComponent(lblinf1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCod)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblData)
                    .addComponent(txtData))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radioWeb)
                        .addComponent(radioDesk)
                        .addComponent(radioMobile)
                        .addComponent(radioOutra))
                    .addComponent(lblPlataforma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescricao)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoVoltar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        // DISPOSE: FUNÇÃO QUE FECHA A JANELA (DESTA CLASSE)
        dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAnteriorActionPerformed
        // Se o botão for clicado, as funções abaixo serão chamadas.
        anterior();
        preencherCampos();
    }//GEN-LAST:event_botaoAnteriorActionPerformed

    private void botaoProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProximoActionPerformed
        // Se o botão for clicado, as funções abaixo serão chamadas.
        proximo();
        preencherCampos();
    }//GEN-LAST:event_botaoProximoActionPerformed

    //<editor-fold defaultstate="collapsed" desc="leituraInicial()">
    /*
    * Faz uma leitura do XML e testa se há clientes cadastrados.
    * Para cada caso é exibida uma mensagem (console/JOptionPane para o usuario).
    */
    void leituraInicial() throws FileNotFoundException{
        cliente = xml.lerClientes();
        
        if(haClientes()){
            ultimo = ultimoCliente(cliente).cod;
            System.out.println("> Dados de clientes carregados com sucesso.");
        } else {
            JOptionPane.showMessageDialog(this, "Não há clientes cadastrados.", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="inicializar()">
    /*
    * Faz uma leitura do XML, carrega os componentes do formulário e trata
    * os possíveis erros (try/catch)
    */
    public void inicializar(){
        try {
            leituraInicial();
            initComponents();
            preencherCampos();
        } catch(FileNotFoundException e){
            System.out.println("Arquivo não encontrado "+e);
        } catch (NullPointerException e){
            System.out.println(">> Não há clientes cadastrados.");
        }
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="proximo()">
    /*
    *   Atribui o próximo cliente no vetor
    */
    void proximo(){
        if(atual<ultimo){
            ++atual;
        } else {
            atual = 0;
        }
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="anterior()">
    /*
    *   Atribui o cliente antecessor no vetor
    */
    void anterior(){
        if(atual>0){
            --atual;
        } else {
            atual = ultimo;
        }
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="ultimoCliente(Cliente[] c)">
    /*
    *   Retorna o último cliente do vetor
    */
    Cliente ultimoCliente(Cliente[] lista){
        int ultimoCl = 0;
        boolean haNulos = false;
        
        // VARRE O VETOR DE CLIENTES
        for (int i = 0; i < lista.length; i++) {
            // CHECA SE O CLIENTE DA POSIÇÃO I É NULO
            if(lista[i]==null){
                haNulos=true;
                // RETORNA O CLIENTE ANTERIOR 
                if(i!=0) ultimoCl = i-1;
                break;
            }
        }
        
        if(!haNulos){
            ultimoCl = lista.length-1;
        }
        
        return lista[ultimoCl];
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="resetarBotoes">
    /*
    *   Atribui à todos os botões da plataforma um valor de não-seleção
    */
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
    /*
    *   Seleciona o botão da plataforma que está salvo no XML e 'desabilita' os outros
    */
    void selecBotaoPlataforma(String p){
        switch(p){
            case "Web":
                radioWeb.setEnabled(true);
                radioWeb.setSelected(true);
                break;
            case "Desktop":
                radioDesk.setEnabled(true);
                radioDesk.setSelected(true);
                break;
            case "Mobile":
                radioMobile.setEnabled(true);
                radioMobile.setSelected(true);
                break;
            case "Outra":
                radioOutra.setEnabled(true);
                radioOutra.setSelected(true);
                break;
        }
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="preencherCampos()">
    /*
    *   Preenche os campos do form com as informações da posição (atual)
    *   no vetor
    */
    void preencherCampos(){
        txtCadastros.setText(String.valueOf(ultimo+1));
        
        txtCod.setText(String.valueOf(cliente[atual].cod));
        txtData.setText(cliente[atual].data);
        
        txtNome.setText(cliente[atual].nome);
        txtCPF.setText(cliente[atual].cpf);
        txtTel.setText(cliente[atual].telefone);
        txtCidade.setText(cliente[atual].cidade);
        txtEndereco.setText(cliente[atual].endereco);
        txtEmail.setText(cliente[atual].email);
        txtPrograma.setText(cliente[atual].programa);
        txtDescricao.setText(cliente[atual].descricao);
        
        resetarBotoes();
        selecBotaoPlataforma(cliente[atual].plataforma);
        
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="haClientes()">
    /*
    *   VERIFICA SE JÁ EXISTEM CLIENTES CADASTRADOS E RETORNA O VALOR COMO TRUE/FALSE
    */
    public boolean haClientes(){
        return cliente[0]!=null;
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
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consulta().setVisible(true);
            }
        });
    }
//</editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGrupoPlataforma;
    private javax.swing.JButton botaoAnterior;
    private javax.swing.JButton botaoProximo;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelClientesCad;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblData;
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
    private javax.swing.JLabel txtCadastros;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCod;
    private javax.swing.JLabel txtData;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPrograma;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
