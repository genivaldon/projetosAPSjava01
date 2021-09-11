package br.ufpb.dcx.aps.atividades.a01;

public class ItemPedido {
    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto) {
        this.produto = produto;
        this.quantidade = 1;
    }

    public ItemPedido(Produto produto, int quant) {
        this.produto = produto;
        this.quantidade = quant;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public int getQuantidade() {
        return this.quantidade;
    }
    //delegando responsabilidade do total do pedido pra este metodo
    public double getTotal(){
        return this.quantidade * produto.getValor();
    }
}
