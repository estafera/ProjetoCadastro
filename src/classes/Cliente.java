/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

import java.io.Serializable;

//<editor-fold defaultstate="collapsed" desc="Desenvolvedores">
/*
 * @authors Ramon Honorio, Maikon Evangelista
 */
//</editor-fold>
public class Cliente {
    public int cod; // -- Código do cliente
    
    // -- Data de cadastramento
    public String data;
    
    // -- Inf do cliente
    public String nome;
    public String cpf;
    public String telefone;
    public String cidade;
    public String endereco;
    public String email;
    
    // -- Inf do programa
    public String programa;
    public String plataforma;
    public String descricao;
}
