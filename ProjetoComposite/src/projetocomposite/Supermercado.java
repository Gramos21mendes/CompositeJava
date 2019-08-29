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
public class Supermercado extends Loja {

    private String TamanhoMercado;
    private List<ILoja> lojas = new ArrayList<>();

    public Supermercado(String nome, String tamanhoMercado) {
        super(nome);
        this.TamanhoMercado = tamanhoMercado;
    }

    public String getTamanhoMercado() {
        return TamanhoMercado;
    }

    public void setTamanhoMercado(String TamanhoMercado) {
        this.TamanhoMercado = TamanhoMercado;
    }

    public List<ILoja> getLojas() {
        return lojas;
    }

    @Override
    public void GetInfo() {
        for (ILoja loja : lojas) {
            loja.GetInfo();
        }
    }

}
