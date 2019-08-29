/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocomposite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author guilherme.rmendes
 */
public class Shopping {

    private String Nome;
    private List<ILoja> lojas = new ArrayList<>();

    public Shopping(String nome) {
        this.Nome = nome;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public List<ILoja> getLojas() {
        return lojas;
    }

    public void MostrarLojas() {
        System.out.println("Shopping: " + this.getNome());
        System.out.println("Lojas: ");
        for (ILoja loja : lojas) {
            loja.GetInfo();
        }
    }

}
