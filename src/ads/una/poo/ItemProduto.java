/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.una.poo;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author William Silva
 * @author Cintia Ferreira
 */

public class ItemProduto {
    
    private ArrayList<Produto> produtos;  
    private double preco;
    private Calendar dataCompra;

    public double getPreco() {
        return preco;
    }     

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
}
