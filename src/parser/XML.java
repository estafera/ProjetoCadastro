/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parser;

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
 * @authors Ramon Honorio, Maikon Evangelista, João Paulo Silva
 */
//</editor-fold>
public class XML {
    
    XStream parser = new XStream(new DomDriver());
    OutputStream arqSaida = null;
    InputStream arqEntrada = null;
    
    public String destino; // = "./arquivos/clientes.xml";
    public String nomeArqClientes = "clientes.xml";
    
    File arquivoClientes, arquivoCadastros;    
    
    //<editor-fold defaultstate="collapsed" desc="Construtor">
    public XML(String destinoDoArquivo){
        destino = destinoDoArquivo;
        arquivoClientes = new File(destino+nomeArqClientes);
        
        parser.setMode(XStream.NO_REFERENCES);
        parser.alias("Cliente", Cliente.class);
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="criarClientesTeste()">
    public Cliente[] criarClientesTeste(){
        Cliente[] cliente = new Cliente[2];
        
        cliente[0] = new Cliente();
        cliente[0].cod = 0;
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
    public Object serializar(File destino) throws FileNotFoundException{
        arqEntrada = new FileInputStream(destino);
        return parser.fromXML(arqEntrada);
    }
    
    // SALVA AS INFORMAÇÕES DO XML
    public void deserializar(File destino, Cliente[] lista) throws FileNotFoundException, IOException {
        criarNovoArquivo(destino);
        arqSaida = new FileOutputStream(destino);
        parser.toXML(lista, arqSaida);
    }
    
    // TRATAMENTO DE ERROS AO LER O XML DOS CLIENTES
    public Cliente[] lerClientes() throws FileNotFoundException {
        try {
            // 
            return (Cliente[]) serializar(arquivoClientes);
        } catch (FileNotFoundException e){
            try {
                deserializar(arquivoClientes, criarClientesTeste());
            } catch (IOException f) {
                System.out.println("IO lerClientes()");
            }
            return (Cliente[]) serializar(arquivoClientes);
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
        deserializar(arquivoClientes, cliente);
        System.out.println("XML salvo em: "+arquivoClientes);
    }
    
    
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
