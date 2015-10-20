/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.una.poo;

/**
 *
 * @author William Silva
 * @author Cintia Ferreira
 */
public class ProdutoPerecivel extends Produto{

    private int prazoDeConsumo;

    public ProdutoPerecivel(int prazoDeConsumo, int codBarras, String nome, String descricao, String categoria, int diasGarantiaPosVenda) {
        super(codBarras, nome, descricao, categoria, diasGarantiaPosVenda);
        this.prazoDeConsumo = prazoDeConsumo;
    }

    public int getPrazoDeConsumo() {
        return prazoDeConsumo;
    }

    public void setPrazoDeConsumo(int prazoDeConsumo) {
        this.prazoDeConsumo = prazoDeConsumo;
    }
 
    
 
}
