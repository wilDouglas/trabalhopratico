/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.una.poo;

import java.util.ArrayList;

/**
 *
 * @author William Silva
 * @author Cintia Ferreira
 */
public abstract class Produto {
    
    private int codBarras;
    private String nome;
    private String descricao;
    private String categoria;
    private ArrayList<Double> historicoVendas; 
    private int diasGarantiaPosVenda;

    public Produto(int codBarras, String nome, String descricao, String categoria, int diasGarantiaPosVenda) {
        this.codBarras = codBarras;
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.diasGarantiaPosVenda = diasGarantiaPosVenda;
    }

    public int getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(int codBarras) {
        this.codBarras = codBarras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getDiasGarantiaPosVenda() {
        return diasGarantiaPosVenda;
    }

    public void setDiasGarantiaPosVenda(int diasGarantiaPosVenda) {
        this.diasGarantiaPosVenda = diasGarantiaPosVenda;
    }

    @Override
    public boolean equals(Object obj) {
        Produto produto = (Produto) obj;
        if(produto.getNome().equals(nome))
        {
            return true;
        }
        
        return false;
    }    
    
}
