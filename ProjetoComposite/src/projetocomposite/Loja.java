/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocomposite;

/**
 *
 * @author guilherme.rmendes
 */
public abstract class Loja implements ILoja {

    private String Nome;

    public Loja(String nome) {
        this.Nome = nome;
    }

    public String getNome() {
        return this.Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

}
