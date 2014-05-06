/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parser;

import java.io.Serializable;

/**
 *
 * @author RamonH
 */
public class ClientePrivate implements Serializable {
    
    private int cod;
    
    // -- Inf do cliente
    private String nome;
    private String cpf;
    private String telefone;
    private String cidade;
    private String endereco;
    private String email;
    
    // -- Inf do programa
    private String programa;
    private String plataforma;
    private String descricao;

    /**
     * Get the value of descricao
     *
     * @return the value of descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Set the value of descricao
     *
     * @param descricao new value of descricao
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    /**
     * Get the value of plataforma
     *
     * @return the value of plataforma
     */
    public String getPlataforma() {
        return plataforma;
    }

    /**
     * Set the value of plataforma
     *
     * @param plataforma new value of plataforma
     */
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    

    /**
     * Get the value of programa
     *
     * @return the value of programa
     */
    public String getPrograma() {
        return programa;
    }

    /**
     * Set the value of programa
     *
     * @param programa new value of programa
     */
    public void setPrograma(String programa) {
        this.programa = programa;
    }


    /**
     * Get the value of telefone
     *
     * @return the value of telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Set the value of telefone
     *
     * @param telefone new value of telefone
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    

    /**
     * Get the value of cidade
     *
     * @return the value of cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Set the value of cidade
     *
     * @param cidade new value of cidade
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    
    
    //<editor-fold defaultstate="collapsed" desc="Getters e setters">
    
    public int getCod() {
        return cod;
    }
    
    public void setCod(int cod) {
        this.cod = cod;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
//</editor-fold>
}
