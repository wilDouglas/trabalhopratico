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
public class Lote {
    
    private ArrayList<Produto> produtos;
    private double precoUnitario;
    private Calendar dataFabricacao;
    private Calendar dataValidade;

    public Lote(ArrayList<Produto> produtos, double precoUnitario, Calendar dataFabricacao, Calendar dataValidade) {
        this.produtos = produtos;
        this.precoUnitario = precoUnitario;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataValidade;
    }
    
          
    public double calcularPrecoTotal(){
        return this.precoUnitario * produtos.size();
    }     

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public Calendar getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Calendar dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public Calendar getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Calendar dataValidade) {
        this.dataValidade = dataValidade;
    }
    
    
}
