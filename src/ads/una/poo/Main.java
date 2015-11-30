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
public class Main {

    public static void main(String[] args) {

        Produto p = new ProdutoPerecivel(30,123456, "Açucar", "Açucar Tia Juana", "Alimentos", 5);
        
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new ProdutoPerecivel(30,123456, "Açucar", "Açucar Tia Juana", "Alimentos", 5));
        produtos.add(new ProdutoPerecivel(30,665655, "Açucar", "Açucar Tia Juana", "Alimentos", 5));
        produtos.add(new ProdutoPerecivel(30,252114, "Açucar", "Açucar Tia Juana", "Alimentos", 5));
        
        Calendar vencimento = Calendar.getInstance();
        vencimento.set(Calendar.DAY_OF_MONTH, 30);
        vencimento.set(Calendar.MONTH, 11);
        vencimento.set(Calendar.YEAR, 2016);
        
        Lote lote  = new Lote(produtos,2.25,Calendar.getInstance(),vencimento);
        
        Estoque estoque = new Estoque();
        estoque.registrarLote(lote);
        
        System.out.println(estoque.obterQuantidadeDisponivel(p));
        
        Venda venda = new Venda();
        ItemProduto item = new ItemProduto();
        item.setProdutos(produtos);
        venda.adicionarItemProduto(item);
        
        System.out.println(venda.obterPrecoTotal());
    }
}
