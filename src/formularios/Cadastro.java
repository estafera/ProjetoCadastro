package formularios;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import parser.Cadastros;
import parser.Cliente;
import parser.XML;

//<editor-fold defaultstate="collapsed" desc="Desenvolvedores">
/*
 * @authors Ramon Honorio, Maikon Evangelista, João Paulo Silva
 */
//</editor-fold>
public class Cadastro extends javax.swing.JFrame {
    int incremento = 3, espacoMatriz; //qtd = 2, cadastros = 0;
    Cadastros cadastros = new Cadastros();
    Cliente[] cliente;
    String destino = "./src/arquivos/db/";
    XML xml = new XML(destino);
    
    //<editor-fold defaultstate="collapsed" desc="método construtor Cadastro()">
    public Cadastro(){
        //<editor-fold defaultstate="collapsed" desc="rascunho">
        /*
        initComponents();
        try {
        leituraInicial();
        } catch(FileNotFoundException e){
        System.out.println("Arquivo não encontrado "+e);
        }
        */
//</editor-fold>
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
        botaoCadastrar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        lblEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lblTel = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        radioWeb = new javax.swing.JRadioButton();
        radioDesk = new javax.swing.JRadioButton();
        radioMobile = new javax.swing.JRadioButton();
        radioOutra = new javax.swing.JRadioButton();
        lblPlataforma = new javax.swing.JLabel();
        lblPrograma = new javax.swing.JLabel();
        txtPrograma = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblinf1 = new javax.swing.JLabel();
        lblinf2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        botaoConsulta = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro");

        lblNome.setText("Nome:");

        lblIdade.setText("CPF:");

        lblDescricao.setText("Descrição:");

        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        botaoLimpar.setText("Limpar Campos");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane2.setViewportView(txtDescricao);

        lblEndereco.setText("Endereço:");

        lblTel.setText("Telefone:");

        bGrupoPlataforma.add(radioWeb);
        radioWeb.setSelected(true);
        radioWeb.setText("Web");

        bGrupoPlataforma.add(radioDesk);
        radioDesk.setText("Desktop");

        bGrupoPlataforma.add(radioMobile);
        radioMobile.setText("Mobile");

        bGrupoPlataforma.add(radioOutra);
        radioOutra.setText("Outra");

        lblPlataforma.setText("Plataforma:");

        lblPrograma.setText("Nome do programa:");

        lblCidade.setText("Cidade/Estado:");

        lblinf1.setText("Informações do cliente");

        lblinf2.setText("Informações do projeto");

        lblEmail.setText("Email:");

        botaoConsulta.setText("Consulta");
        botaoConsulta.setEnabled(false);
        botaoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultaActionPerformed(evt);
            }
        });

        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoLimpar)
                        .addGap(121, 121, 121)
                        .addComponent(botaoVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPlataforma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPrograma)
                                    .addComponent(botaoConsulta))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrograma)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioWeb)
                                .addGap(26, 26, 26)
                                .addComponent(radioDesk)
                                .addGap(18, 18, 18)
                                .addComponent(radioMobile)
                                .addGap(18, 18, 18)
                                .addComponent(radioOutra))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIdade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmail)
                            .addComponent(txtCidade)
                            .addComponent(txtEndereco)
                            .addComponent(txtNome)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTel)
                                .addGap(18, 18, 18)
                                .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblinf1)
                    .addComponent(lblinf2))
                .addGap(343, 343, 343))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botaoCadastrar, botaoConsulta, botaoLimpar});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblinf1, lblinf2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblinf1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdade)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidade)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addGap(11, 11, 11)
                .addComponent(lblinf2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrograma)
                    .addComponent(txtPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioWeb)
                    .addComponent(radioDesk)
                    .addComponent(radioMobile)
                    .addComponent(radioOutra)
                    .addComponent(lblPlataforma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDescricao)
                        .addGap(25, 25, 25)
                        .addComponent(botaoConsulta))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoVoltar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoCadastrar)
                        .addComponent(botaoLimpar)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botaoCadastrar, botaoConsulta, botaoLimpar});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        
        cadastrar();
        try {
            xml.salvarClientes(cliente);
            //xml.salvarCadastros(cadastros);
        } catch (IOException ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void botaoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultaActionPerformed
        // TODO add your handling code here:
        //imprimeClientes();
        try {
            xml.listarClientes(cadastros.proximo);
        } catch (FileNotFoundException x) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, x);
        }
        
    }//GEN-LAST:event_botaoConsultaActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        // TODO add your handling code here:
        //System.exit(0);
        limparCampos();
        this.dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    //<editor-fold defaultstate="collapsed" desc="limparCampos()">
    void limparCampos(){
        /*
        FUNÇÃO QUE ATRIBUI À TODOS OS CAMPOS
        UM VALOR NULO
        */
        txtNome.setText(null);
        txtCPF.setText(null);
        txtTel.setText(null);
        txtCidade.setText(null);
        txtEndereco.setText(null);
        txtEmail.setText(null);
        txtPrograma.setText(null);
        txtDescricao.setText(null);
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="imprimeClientes()">
    void imprimeClientes(){
        /*
        UTILIZA-SE UM LAÇO DE REPETIÇÃO (FOR) PARA QUE SEJA IMPRESSO NO CONSOLE
        CADA INFORMAÇÃO DO USUÁRIO CADASTRADO
        */
        
        System.out.println("====== CONSULTA ========\n> Qtd espaço na matriz: "+cliente.length);
        for (int i = 0; i < cadastros.proximo; i++) {
            System.out.println(
                    "==============\n"
                            + "Cod Cliente: "+cliente[i].cod+"\n"
                            + "Nome: "+cliente[i].nome+"\n"
                            + "CPF: "+cliente[i].cpf+"\n"
                            + "Tel: "+cliente[i].telefone+"\n"
                            + "Cidade: "+cliente[i].cidade+"\n"
                            + "Endereço: "+cliente[i].endereco+"\n"
                            + "Email: "+cliente[i].email+"\n"
                            + "Programa: "+cliente[i].programa+"\n"
                            + "Plataforma: "+cliente[i].plataforma+"\n"
                            + "Descrição: "+cliente[i].descricao
            );
        }
        System.out.println("==============");
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="matrizCheia()">
    boolean matrizCheia(){
        if(cadastros.proximo>=espacoMatriz){
            System.out.println("> Matriz atual cheia.");
            return true;
        } else {
            return false;
        }
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="novaMatriz()">
    Cliente[] novaMatriz() {
        //cadastros.ultimo = ultimoCliente(cliente).cod+1;
        int novaQtd = espacoMatriz+incremento;
        Cliente[] novaMatriz = new Cliente[novaQtd];
        
        for (int i = 0; i < ultimoCliente(cliente).cod+1 ; i++) {
            System.out.println("> Copiando informações do Cliente (cod "+i+
                    ") para a nova matriz.");
            
            novaMatriz[i] = cliente[i];
            System.out.println(">> novaMatriz["+i+"].nome = "+novaMatriz[i].nome);
            
            //<editor-fold defaultstate="collapsed" desc="modo manual">
            /*
            novaMatriz[i].cod = cliente[i].cod;
            novaMatriz[i].nome = cliente[i].nome;
            novaMatriz[i].cpf = cliente[i].cpf;
            novaMatriz[i].telefone = cliente[i].telefone;
            novaMatriz[i].cidade = cliente[i].cidade;
            novaMatriz[i].endereco = cliente[i].endereco;
            novaMatriz[i].email = cliente[i].email;
            novaMatriz[i].programa = cliente[i].programa;
            novaMatriz[i].plataforma = cliente[i].plataforma;
            novaMatriz[i].descricao = cliente[i].descricao;*/
//</editor-fold>
        }
        
        espacoMatriz = novaQtd;
        
        System.out.println("> Nova matriz criada."
                + "\n> Quantidade de espaço na matriz: "+espacoMatriz
                + "\n> Clientes cadastrados: "+ultimoCliente(cliente).cod
        );
        
        return novaMatriz;
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="cadastrar()">
    void cadastrar(){
        if(matrizCheia()){
            cliente = (Cliente[]) novaMatriz();
        }
        //cadastros.ultimo = ultimoCliente(cliente).cod;
        //System.out.println(">> cadastros.ultimo: "+cadastros.ultimo);
        
        // instanciando um objeto Cliente
        cliente[cadastros.proximo] = new Cliente();
        
        cliente[cadastros.proximo].cod = cadastros.proximo;
        cliente[cadastros.proximo].nome = txtNome.getText();
        cliente[cadastros.proximo].cpf = txtCPF.getText();
        cliente[cadastros.proximo].telefone = txtTel.getText();
        cliente[cadastros.proximo].cidade = txtCidade.getText();
        cliente[cadastros.proximo].endereco = txtEndereco.getText();
        cliente[cadastros.proximo].email = txtEmail.getText();
        cliente[cadastros.proximo].programa = txtPrograma.getText();
        cliente[cadastros.proximo].descricao = txtDescricao.getText();
        
        if(radioWeb.isSelected()){
            cliente[cadastros.proximo].plataforma = "Web";
        } else if(radioDesk.isSelected()){
            cliente[cadastros.proximo].plataforma = "Desktop";
        } else if(radioMobile.isSelected()){
            cliente[cadastros.proximo].plataforma = "Mobile";
        } else {
            cliente[cadastros.proximo].plataforma = "Outra";
        }
        
        cadastros.proximo++;
        //cad.numero=cadastros;
        System.out.println("> Cliente "+(cadastros.proximo)+" cadastrado.");
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="leituraInicial()">
    void leituraInicial() throws FileNotFoundException{
        
        cliente = xml.lerClientes();
        espacoMatriz = cliente.length;
        //System.out.println(">> Valor de espacoMatriz: "+espacoMatriz);
        cadastros.proximo = ultimoCliente(cliente).cod+1;
        //cadastros = xml.lerCadastros();
        
        System.out.println("> Dados de clientes carregados com sucesso." 
                //+ "\n>>>> ultimoCliente(cliente).cod="+ultimoCliente(cliente).cod
                //+ "\n>>>> cadastros.proximo: "+cadastros.proximo
        );
        
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="inicializar()">
    public void inicializar(){
        initComponents();
        limparCampos();
        try{
            leituraInicial();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: "+e);
        }
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="ultimoCliente()">
    Cliente ultimoCliente(Cliente[] c){
        int ultimo = 0;
        
        for (int i = 0; i < c.length; i++) {
            if(c[i]==null){
                if(i!=0) ultimo = i-1;
                break;
            }
        }
        if(ultimo==0){
            ultimo = c.length-1;
        }
        return c[ultimo];
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="[rascunhos] FUNÇÕES ANTIGAS">
    // === FUNÇÕES ANTIGAS == //
    /*
    private void inicializarClientes(){
    for (int i = 0; i < qtdClientes; i++) {
    cliente[i] = new Cliente();
    }
    }
    private void cadastrarOld(){
    if(matrizCheia()){
    oldClientes = novaMatrizOld();
    }
    
    oldClientes[cadastros][0] = cadastros.toString();
    oldClientes[cadastros][1] = txtNome.getText();
    oldClientes[cadastros][2] = txtCPF.getText();
    oldClientes[cadastros][3] = txtTel.getText();
    oldClientes[cadastros][4] = txtCidade.getText();
    oldClientes[cadastros][5] = txtEndereco.getText();
    oldClientes[cadastros][6] = txtEmail.getText();
    oldClientes[cadastros][7] = txtPrograma.getText();
    oldClientes[cadastros][9] = txtDescricao.getText();
    
    if(radioWeb.isSelected()){
    oldClientes[cadastros][8] = "Web";
    } else if(radioDesk.isSelected()){
    oldClientes[cadastros][8] = "Desktop";
    } else if(radioMobile.isSelected()){
    oldClientes[cadastros][8] = "Mobile";
    } else {
    oldClientes[cadastros][8] = "Outra";
    }
    
    System.out.println("> Cliente "+(cadastros+1)+" cadastrado.");
    cadastros++;
    }
    private String[][] novaMatrizOld(){
    
    int novaQtd = qtdClientes+incremento;
    String[][] novaMatriz = new String[novaQtd][qtdInformacoes];
    
    for (int i = 0; i < qtdClientes; i++) {
    System.out.println("> Copiando informações do Cliente (cod "+i+
    ") para a nova matriz:");
    for (int j = 0; j < qtdInformacoes; j++) {
    novaMatriz[i][j] = oldClientes[i][j];
    System.out.println(novaMatriz[i][j]);
    }
    System.out.println("============");
    }
    
    qtdClientes = novaQtd;
    
    return novaMatriz;
    }
    private void imprimeClientesOld(){
    System.out.println("====== CONSULTA ========\n> Qtd espaço na matriz: "+oldClientes.length);
    for (int i = 0; i < cadastros; i++) {
    System.out.println(
    "==============\n"
    + "Cod Cliente: "+oldClientes[i][0]+"\n"
    + "Nome: "+oldClientes[i][1]+"\n"
    + "CPF: "+oldClientes[i][2]+"\n"
    + "Tel: "+oldClientes[i][3]+"\n"
    + "Cidade: "+oldClientes[i][4]+"\n"
    + "Endereço: "+oldClientes[i][5]+"\n"
    + "Email: "+oldClientes[i][6]+"\n"
    + "Programa: "+oldClientes[i][7]+"\n"
    + "Plataforma: "+oldClientes[i][8]+"\n"
    + "Descrição: "+oldClientes[i][9]
    );
    }
    System.out.println("==============");
    }
    */
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Main()">
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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }
//</editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGrupoPlataforma;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoConsulta;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCidade;
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
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPrograma;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
