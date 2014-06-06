/*
 *  Projeto Integrador — 1º Semestre TADS — Turma B
 *  Raikon Project
 *  @authors Ramon Honorio, Maikon Evangelista
 */

package formularios;

import classes.Cliente;
import classes.XML;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

public class EscolhaConsulta extends javax.swing.JFrame {
    int ultimo = 0;
    Cliente[] cliente;
    String destino = "./src/arquivos/db/";
    XML xml = new XML(destino);
    ConsultaIndividual consultaIndividual;
    
    int posicao = -1;
    
    public EscolhaConsulta() {
        /*
        *   Construtor — chama o método inicializar
        */
        inicializar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoDeBotoes = new javax.swing.ButtonGroup();
        lblTitulo = new javax.swing.JLabel();
        btPesquisar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        radioNome = new javax.swing.JRadioButton();
        radioCpf = new javax.swing.JRadioButton();
        radioEmail = new javax.swing.JRadioButton();
        lblSubtitulo = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta individual");

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Consulta no banco de dados");

        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        grupoDeBotoes.add(radioNome);
        radioNome.setSelected(true);
        radioNome.setText("Nome:");
        radioNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNomeActionPerformed(evt);
            }
        });

        grupoDeBotoes.add(radioCpf);
        radioCpf.setText("CPF:");
        radioCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCpfActionPerformed(evt);
            }
        });

        grupoDeBotoes.add(radioEmail);
        radioEmail.setText("E-mail:");
        radioEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioEmailActionPerformed(evt);
            }
        });

        lblSubtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubtitulo.setText("Escolha a forma de pesquisa e preencha o campo correspondente");

        txtCpf.setEnabled(false);

        txtEmail.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSubtitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btPesquisar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioNome)
                            .addComponent(radioEmail)
                            .addComponent(radioCpf))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                            .addComponent(txtNome)
                            .addComponent(txtCpf))))
                .addGap(20, 20, 20))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btPesquisar, btVoltar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSubtitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioCpf)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPesquisar)
                    .addComponent(btVoltar))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        /*
        *   Se o botão for clicado, será chamada a função pesquisar();
        */
        pesquisar();
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        /*
        * Fecha a janela
        */
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void radioCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCpfActionPerformed
        /*
        * Se esta opcao for selecionada, os outros campos serão desabilidados.
        */
        txtCpf.setEnabled(true);
        txtNome.setEnabled(false);
        txtEmail.setEnabled(false);
    }//GEN-LAST:event_radioCpfActionPerformed

    private void radioEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioEmailActionPerformed
        /*
        * Se esta opcao for selecionada, os outros campos serão desabilidados.
        */
        txtEmail.setEnabled(true);
        txtNome.setEnabled(false);
        txtCpf.setEnabled(false);
    }//GEN-LAST:event_radioEmailActionPerformed

    private void radioNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNomeActionPerformed
        /*
        * Se esta opcao for selecionada, os outros campos serão desabilidados.
        */
        txtNome.setEnabled(true);
        txtCpf.setEnabled(false);
        txtEmail.setEnabled(false);
    }//GEN-LAST:event_radioNomeActionPerformed

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
        } catch(FileNotFoundException e){
            System.out.println("Arquivo não encontrado "+e);
        } catch (NullPointerException e){
            System.out.println(">> Não há clientes cadastrados.");
        }
    }
//</editor-fold> 
    
    //<editor-fold defaultstate="collapsed" desc="Buscas (nome/cpf/email)">
    /*
    *   Funções que percorrem o vetor de clientes verificando se os dados que usuário
    *   digitou, coincidem com os dados de alguma posição do vetor.
    */
    
    //<editor-fold defaultstate="collapsed" desc="buscarNome(String nome)">
    void buscarNome(String nome){
        ultimo = ultimoCliente(cliente).cod;
        
        for (int i = 0; i <= ultimo; i++) {
            if(nome.equalsIgnoreCase(cliente[i].nome)) {
                posicao = i;
                break;
            } else {
                posicao = -1;
            }
        }
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="buscarCpf(String cpf)">
    void buscarCpf(String cpf){
        ultimo = ultimoCliente(cliente).cod;
        
        for (int i = 0; i <= ultimo; i++) {
            if(cpf.equalsIgnoreCase(cliente[i].cpf)) {
                posicao = i;
                break;
            } else {
                posicao = -1;
            }
        }
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="buscarEmail(String email)">
    void buscarEmail(String email){
        ultimo = ultimoCliente(cliente).cod;
        
        for (int i = 0; i <= ultimo; i++) {
            if(email.equalsIgnoreCase(cliente[i].email)) {
                posicao = i;
                break;
            } else {
                posicao = -1;
            }
        }
    }
//</editor-fold>
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="opcaoSelecionada()">
    /*
    * Checa qual opção de busca está selecionada e retorna um valor inteiro
    * que será usado em outra função.
    */
    int opcaoSelecionada(){
        if(radioNome.isSelected()){
            return 1;
        } else if(radioCpf.isSelected()){
            return 2;
        } else if(radioEmail.isSelected()){
            return 3;
        } else {
            return 0;
        }
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="pesquisar()">
    /*
    *   Verifica qual radioButton está selecionado para realizar a respectiva
    *   busca. Se encontrar um cliente com o dado inserido pelo usuário, será
    *   criada uma janela da classe ConsultaIndividual; caso contrário, exibirá
    *   uma mensagem de erro.
    */
    void pesquisar(){
        String txt = "";
        switch(opcaoSelecionada()){
            case 1:
                txt =txtNome.getText();
                System.out.println("> Realizando busca por [NOME]:\t"+txt);
                buscarNome(txt);
                break;
            case 2:
                txt = txtCpf.getText();
                System.out.println("> Realizando busca por [CPF]:\t"+txt);
                buscarCpf(txt);
                break;
            case 3:
                txt = txtEmail.getText();
                System.out.println("> Realizando busca por [EMAIL]:\t"+txt);
                buscarEmail(txt);
                break;
        }
        
        if(posicao>=0){
            consultaIndividual = new ConsultaIndividual(posicao);
            consultaIndividual.setVisible(true);
        } else {
            System.out.println("> Cliente não encontrado.");
            JOptionPane.showMessageDialog(null, "Cliente não encontrado.","Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="haClientes()">
    /*
    * VERIFICA SE JÁ EXISTEM CLIENTES CADASTRADOS E RETORNA O VALOR COMO TRUE/FALSE
    */
    public boolean haClientes(){
        return cliente[0]!=null;
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="ultimoCliente()">
    /*
    * A lista de clientes (VETOR) é passada como parâmetro.
    * Percorre o vetor para verificar a última posição VÁLIDA de cliente.
    * Ou seja, essa função busca um OBJETO cliente NÃO-NULO e o retorna.
    */
    Cliente ultimoCliente(Cliente[] lista){
        int ultimoCl = 0;
        boolean haNulos = false;
        
        for (int i = 0; i < lista.length; i++) {
            // CHECA SE O CLIENTE DA POSIÇÃO I NÃO É NULO
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
            java.util.logging.Logger.getLogger(EscolhaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EscolhaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EscolhaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EscolhaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EscolhaConsulta().setVisible(true);
            }
        });
    }
//</editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btVoltar;
    private javax.swing.ButtonGroup grupoDeBotoes;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton radioCpf;
    private javax.swing.JRadioButton radioEmail;
    private javax.swing.JRadioButton radioNome;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
