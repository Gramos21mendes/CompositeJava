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
public class Restaurante extends Loja {

    private String TipoCulinaria;

    public Restaurante(String nome, String tipoCulinaria) {
        super(nome);
        this.TipoCulinaria = tipoCulinaria;
    }

    public String getTipoCulinaria() {
        return TipoCulinaria;
    }

    public void setTipoCulinaria(String TipoCulinaria) {
        this.TipoCulinaria = TipoCulinaria;
    }

    @Override
    public void GetInfo() {
       System.out.println("Restaurante: Nome " + super.getNome() + " Culinaria: " + this.getTipoCulinaria());
    }

}
