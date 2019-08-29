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
public class ProjetoComposite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shopping shop = new Shopping("Marketplace");
        shop.getLojas().add(new Depto("Ropua", "Riachuelo"));
        shop.getLojas().add(new Restaurante("BBQ", "Mania de Churrasco"));
        shop.getLojas().add(new Servico("gerais", "PF"));

        Supermercado sup = new Supermercado("hiper", "Carrefour");

        sup.getLojas().add(new Restaurante("Cafe", "Casa do Pão de Queijo"));
        sup.getLojas().add(new Servico("Loteria", "Casa Lotércia"));
        
        shop.getLojas().add(sup);
        
        shop.MostrarLojas();
    }

}
