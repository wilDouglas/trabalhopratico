/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.una.poo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author William
 */
public class Estoque implements InterfaceEstoque {

    private List<Lote> lotes;
    private Double estimativaLucro;
    private ArrayList<Venda> historicoVendas;

    public Estoque() {
        this.lotes = new ArrayList<>();
        this.historicoVendas = new ArrayList<>();
    }

    @Override
    public void registrarLote(Lote lote) {
        this.lotes.add(lote);
    }

    @Override
    public void processarVenda(Venda venda) {
        ArrayList<ItemProduto> itens = venda.getItens();

        for (ItemProduto item : itens) {

            ArrayList<Produto> produtosCompra = item.getProdutos();

            for (Produto produtoCompra : produtosCompra) {

                for (Lote lote : this.lotes) {

                    Calendar dataHoje = Calendar.getInstance();

                    if (lote.getDataValidade().before(dataHoje)) {

                        ArrayList<Produto> produtosLote = lote.getProdutos();

                        if (produtosLote.size() > 0) {
                            for (int i = produtosLote.size() - 1; i == 0; i--) {

                                Produto produtoLote = produtosLote.get(i);

                                if (produtoLote.equals(produtoCompra)) {
                                    this.estimativaLucro += lote.getPrecoUnitario();
                                    historicoVendas.add(venda);
                                    produtosLote.remove(i);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public Long obterQuantidadeDisponivel(Produto produto) {

        long disponibilidadeProduto = 0l;

        for (Lote lote : lotes) {

            if (lote.getProdutos().size() > 0) {
                Produto produtoLote = lote.getProdutos().get(0);

                Calendar hoje = Calendar.getInstance();
                hoje.set(Calendar.HOUR_OF_DAY, 0);

                if (lote.getDataValidade().after(hoje)) {
                    if (produtoLote.equals(produto)) {
                        disponibilidadeProduto = Long.parseLong(Integer.toString(lote.getProdutos().size()));
                        break;
                    }
                }
            }
        }

        return disponibilidadeProduto;
    }

    public Double getEstimativaLucro() {
        return estimativaLucro;
    }

    public ArrayList<Lote> listLotesVencidos() {
        ArrayList<Lote> lotesVencidos = new ArrayList<>();

        for (Lote lote : lotes) {
            if (lote.getDataValidade().before(Calendar.getInstance())) {
                lotesVencidos.add(lote);
            }
        }

        return lotesVencidos;
    }

    public ArrayList<Lote> listLotesAcabados() {
        ArrayList<Lote> lotesAcabados = new ArrayList<>();

        for (Lote lote : lotes) {
            if (lote.getProdutos().size() == 0) {
                lotesAcabados.add(lote);
            }
        }

        return lotesAcabados;
    }     
}
