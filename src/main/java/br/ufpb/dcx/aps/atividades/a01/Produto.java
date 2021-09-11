package br.ufpb.dcx.aps.atividades.a01;

public class Produto {

    private String nome;
    private String descricao;
    private Double valor;

    public Produto() {
        this.nome = ""; 
        this.descricao = "";
        this.valor = 0.0; 
    }

    public Produto(String produto, String descricao, double valor) {
        this.nome = produto;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
