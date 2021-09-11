package br.ufpb.dcx.aps.atividades.a01;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    // iniciando a lista do tipo ItemPedido vazia.
    private List<ItemPedido> itens = new ArrayList<ItemPedido>();

    public Pedido() {
    }

    public void addProduto(Produto produto, int quant) {
        if (quant >= 1) {
            ItemPedido item = new ItemPedido(produto, quant);
            itens.add(item);
        } else {
            throw new RuntimeException("a quantidade deve ser maior que zero");
        }
    }

    public void addProduto(Produto produto) {
        ItemPedido item = new ItemPedido(produto);
        itens.add(item);
    }

    public int quantProdutos() {
        int quantTotalProdutos = 0;
        // for each
        // para cada elemento do tipo ItemPedido no ArrayList itens, faça algo.

        // Tipo Apelido e Coleção
        for (ItemPedido elemento : itens) {
            quantTotalProdutos += elemento.getQuantidade();
        }
        return quantTotalProdutos;
    }

    public double getTotal() {
        int valorTotal = 0;
        for (ItemPedido elemento : itens) {
            valorTotal += elemento.getTotal();
        }
        return valorTotal;
    }

    public List<ItemPedido> getItens() {
        return this.itens;
    }

}
