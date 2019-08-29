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
public class Depto extends Loja {

    private String DescricaoDepto;

    public Depto(String nome, String descricaoDepto) {
        super(nome);
        this.DescricaoDepto = descricaoDepto;
    }

    @Override
    public void GetInfo() {
        System.out.println("Depto: Nome " + super.getNome() + " Descrição: " + this.getDescricaoDepto());
    }

    public void setDescricaoDepto(String descricaoDepto) {
        this.DescricaoDepto = descricaoDepto;
    }

    public String getDescricaoDepto() {
        return DescricaoDepto;
    }

}
