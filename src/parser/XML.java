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
    
    
    public XML(String destinoDoArquivo){
        
        destino = destinoDoArquivo;
        arquivoClientes = new File(destino+nomeArqClientes);
        
        parser.setMode(XStream.NO_REFERENCES);
        parser.alias("Cliente", Cliente.class);
    }
    
    public Cliente[] criarClientesTeste(){
        int cadastros = 0;
        Cliente[] c = new Cliente[2];
        
        c[0] = new Cliente();
        c[0].cod = cadastros;
        c[0].nome = "Ramon Honorio";
        c[0].cpf = "12345678900";
        c[0].endereco = "Rua qualquer, 86";
        c[0].cidade = "São Paulo/SP";
        c[0].telefone = "1166123552";
        c[0].email = "ramonaqh@gmail.com";
        
        c[0].programa = "Jogo";
        c[0].plataforma = "Desktop";
        c[0].descricao = "Descrição do jogo qualquer de desktop.";
        
        cadastros++;
        //---------------
        c[1] = new Cliente();
        c[1].cod = cadastros;
        c[1].nome = "Sakata Gintoki";
        c[1].cpf = "98765432100";
        c[1].endereco = "Distrito Kabuki, 264";
        c[1].cidade = "Edo";
        c[1].telefone = "948461262";
        c[1].email = "yorozuyaGintoki@gmail.com";        
        
        c[1].programa = "Site";
        c[1].plataforma = "Web";
        c[1].descricao = "Descrição do site qualquer.";
        
        return c;
    }
    
    public Object serializar(File arquivo) throws FileNotFoundException{
        arqEntrada = new FileInputStream(arquivo);
        return parser.fromXML(arqEntrada);
    }
    
    public void deserializar(File destino, Cliente[] lista) throws FileNotFoundException, IOException {
        criarNovoArquivo(destino);
        arqSaida = new FileOutputStream(destino);
        parser.toXML(lista, arqSaida);
    }
    
    public Cliente[] lerClientes() throws FileNotFoundException {
        try {
            return (Cliente[]) serializar(arquivoClientes);
        } catch (FileNotFoundException e){
            try{
                deserializar(arquivoClientes, criarClientesTeste());
            } catch (IOException f){
                System.out.println("IO lerClientes()");
            }
            return (Cliente[]) serializar(arquivoClientes);
        }
        //return (Cliente[]) lerArquivo(arquivo);
    }
    
    public void listarClientes(int numCadastros) throws FileNotFoundException{
        Cliente[] cliente = lerClientes();
        System.out.println("====== CONSULTA ========\n"
                + "> Qtd espaço na matriz: "+cliente.length);
        for (int i = 0; i < numCadastros; i++) {
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
    
    public void salvarClientes(Cliente[] cliente) throws IOException{
        deserializar(arquivoClientes, cliente);
        System.out.println("XML salvo em: "+arquivoClientes);
    }
    
    public void salvarClientesTeste() throws IOException{
        Cliente[] cliente = criarClientesTeste();
        deserializar(arquivoClientes, cliente);
    }
    
    public void criarNovoArquivo(File f){
        if(f.exists()){
            f.delete();
        }
        try{ 
            f.createNewFile();
        } catch (IOException e){
            System.out.println("IO criarNovoArquivo() "+e);
        }
    }
    
//<editor-fold defaultstate="collapsed" desc="rascunhos">
    /*
    public void deserializarCad(File destino, Cadastros c) throws FileNotFoundException, IOException{
    criarNovoArquivo(destino);
    arqSaida = new FileOutputStream(destino);
    parser.toXML(c, arqSaida);
    }
    
    public void salvarCadastros(Cadastros c) throws IOException {
    deserializarCad(arquivoCadastros, c);
    }
    
    
    public Cadastros lerCadastros() throws FileNotFoundException {
    try {
    return (Cadastros) serializar(arquivoCadastros);
    } catch (FileNotFoundException e){
    try{
    Cadastros t = new Cadastros();
    t.qtd=2;
    deserializarCad(arquivoCadastros, t);
    } catch (IOException f){
    System.out.println("IO lerCadastros()");
    }
    return (Cadastros) serializar(arquivoCadastros);
    }
    //return (Cliente[]) lerArquivo(arquivo);
    }*/
//</editor-fold>
    
}
