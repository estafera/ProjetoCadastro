/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//<editor-fold defaultstate="collapsed" desc="Desenvolvedores">
/*
 * @authors Ramon Honorio, Maikon Evangelista
 */
//</editor-fold>
public class XML {
    // BIBLIOTECA UTILIZADA
    XStream xstream = new XStream(new DomDriver());
    
    // ARQUIVOS DE ENTRADA E SAÍDA
    OutputStream arqSaida = null;
    InputStream arqEntrada = null;
    
    public String destino; // = "./arquivos/db/clientes.xml";
    public String nomeDoArquivo = "clientes.xml";
    
    File arquivo;    
    
    //<editor-fold defaultstate="collapsed" desc="Construtor">
    public XML(String destinoDoArquivo){
        destino = destinoDoArquivo;
        arquivo = new File(destino+nomeDoArquivo);
        
        // FUNÇÕES ABAIXO JÁ SÃO FORNECIDAS PELA BIBLIOTECA
        xstream.setMode(XStream.NO_REFERENCES);
        xstream.alias("Cliente", Cliente.class);
    }
//</editor-fold>
    
    // CRIA DOIS CLIENTES DE TESTE
    //<editor-fold defaultstate="collapsed" desc="criarClientesTeste()">
    public Cliente[] criarClientesTeste(){
        Cliente[] cliente = new Cliente[2];
        
        cliente[0] = new Cliente();
        cliente[0].cod = 0;
        cliente[0].data = "05/04/2014 04:30";
        cliente[0].nome = "Ramon Honorio";
        cliente[0].cpf = "12345678900";
        cliente[0].endereco = "Rua qualquer, 86";
        cliente[0].cidade = "São Paulo/SP";
        cliente[0].telefone = "1166123552";
        cliente[0].email = "ramonaqh@gmail.com";
        
        cliente[0].programa = "Jogo";
        cliente[0].plataforma = "Desktop";
        cliente[0].descricao = "Descrição do jogo qualquer de desktop.";
        
        //---------------
        cliente[1] = new Cliente();
        cliente[1].cod = 1;
        cliente[1].data = "15/04/2014 15:21";
        cliente[1].nome = "Sakata Gintoki";
        cliente[1].cpf = "98765432100";
        cliente[1].endereco = "Distrito Kabuki, 264";
        cliente[1].cidade = "Edo";
        cliente[1].telefone = "948461262";
        cliente[1].email = "yorozuyaGintoki@gmail.com";
        
        cliente[1].programa = "Site";
        cliente[1].plataforma = "Web";
        cliente[1].descricao = "Descrição do site qualquer.";
        
        return cliente;
    }
//</editor-fold>
    
    // LÊ AS INFORMAÇÕES DO XML E RETORNA UMA MATRIZ
    public Object serializar(File destino) throws FileNotFoundException {
        arqEntrada = new FileInputStream(destino);
        return xstream.fromXML(arqEntrada);
    }
    
    // SALVA AS INFORMAÇÕES DO XML
    public void deserializar(File destino, Cliente[] lista) throws FileNotFoundException, IOException {
        criarNovoArquivo(destino);
        arqSaida = new FileOutputStream(destino);
        xstream.toXML(lista, arqSaida);
    }
    
    // TRATAMENTO DE ERROS AO LER O XML DOS CLIENTES
    public Cliente[] lerClientes() throws FileNotFoundException {
        try {
            // 
            return (Cliente[]) serializar(arquivo);
        } catch (FileNotFoundException e){
            try {
                deserializar(arquivo, criarClientesTeste());
            } catch (IOException f) {
                System.out.println("IO lerClientes()");
            }
            return (Cliente[]) serializar(arquivo);
        }
    }
    
    // LISTA OS CLIENTES NO CONSOLE
    public void listarClientes(int numeroDeCadastros) throws FileNotFoundException {
        Cliente[] cliente = lerClientes();
        
        System.out.println("====== CONSULTA ========\n"
                + "> Qtd de espaço na matriz: "+cliente.length);
        
        for (int i = 0; i < numeroDeCadastros; i++) {
            try {
                System.out.println(
                        "==============\n"
                        + "Cod Cliente: "+cliente[i].cod+"\n"
                        + "Data de Cadastramento: "+cliente[i].data+"\n"
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
            } catch (NullPointerException e){}
        }
        System.out.println("==============");
    }
    
    // SALVA E MOSTRA O LOCAL ONDE FOI ARMAZENADO
    public void salvarClientes(Cliente[] cliente) throws IOException{
        deserializar(arquivo, cliente);
        System.out.println("XML salvo em: "+arquivo);
    }
    
    /*
        FUNÇÃO QUE SUBSTITUI O ARQUIVO EXISTENTE (SE EXISTIR)
        POR UM NOVO COM AS INFORMAÇÕES ATUALIZADAS
    */
    public void criarNovoArquivo(File arquivo){
        if(arquivo.exists()){
            arquivo.delete();
        }
        try { 
            arquivo.createNewFile();
        } catch (IOException e){
            System.out.println("> Erro ao criar o arquivo XML. "+e);
        }
    }   
    
}
