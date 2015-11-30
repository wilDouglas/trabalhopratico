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
public class Venda {

    private ArrayList<ItemProduto> itens;
    private String estado;
    private double valorDesconto;
    private Calendar dataVenda;
    
    public Venda() {
        dataVenda = Calendar.getInstance();
        this.estado = "em aberto";
        this.valorDesconto = 0;
        itens = new ArrayList<>();
    }
    
    

    public double obterPrecoTotal() {
        double precoTotal = 0;

        for (ItemProduto item : itens) {
            precoTotal += item.getPreco();
        }

        return precoTotal;
    }
    
    public void adicionarDesconto(double valorDesconto){
        this.valorDesconto = valorDesconto;
    }
    
    public double obterValorFinal(){
        return obterPrecoTotal() - this.valorDesconto;
    }

    public void adicionarItemProduto(ItemProduto item) {
        if (estado.equals("em aberto")) {
            this.itens.add(item);
        }
    }

    public void removerItemProduto(int posicao) {
        if (estado.equals("em aberto")) {
            this.itens.remove(posicao);
        }
    }

    public ArrayList<Produto> obterProdutosItem(int posicao) {
        return itens.get(posicao).getProdutos();
    }    
    
    public  void adicionarProdutosItem(int posicao,ArrayList<Produto> produtos){
        if(estado.equals("em aberto")){
            itens.get(posicao).setProdutos(produtos);
        }
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<ItemProduto> getItens() {
        return itens;
    }

    public Calendar getDataVenda() {
        return dataVenda;
    }
    
       
    

}
