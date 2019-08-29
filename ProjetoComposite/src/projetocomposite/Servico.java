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
public class Servico extends Loja {

    private String TipoServico;

    public Servico(String nome, String tipoServico) {
        super(nome);
        this.TipoServico = tipoServico;
    }

    public String getTipoServico() {
        return TipoServico;
    }

    public void setTipoServico(String TipoServico) {
        this.TipoServico = TipoServico;
    }

    @Override
    public void GetInfo() {
        System.out.println("Servico: Nome " + super.getNome() + " Culinaria: " + this.getTipoServico());
    }

}
