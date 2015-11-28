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

import java.util.ArrayList;

public interface InterfaceEstoque {

    public void registrarLote(Lote lote);

    public void processarVenda(Venda venda);

    public Long obterQuantidadeDisponivel(Produto produto);
}
