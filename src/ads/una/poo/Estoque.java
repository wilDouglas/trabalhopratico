/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.una.poo;

import java.util.List;

/**
 *
 * @author William
 */
public class Estoque implements InterfaceEstoque {

    private List<Lote> lotes;

    @Override
    public void registrarLote(Lote lote) {
        this.lotes.add(lote);
    }

    @Override
    public void processarVenda(Venda venda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Long obterQuantidadeDisponivel(Produto produto) {

        long disponibilidadeProduto = 0l;

        for (Lote lote : lotes) {

            if (lote.getProdutos().size() > 0) {
                Produto produtoLote = lote.getProdutos().get(0);

                if (produtoLote.equals(produto)) {
                    disponibilidadeProduto = Long.parseLong(Integer.toString(lote.getProdutos().size()));
                    break;
                }
            }
        }

        return disponibilidadeProduto;
    }

}
