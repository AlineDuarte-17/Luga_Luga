package model;

public class Produto {

    private String nome;

    private double preco;

    private String descricao;

    private String status;

    private double quantidade;

    public Produto(String nome, double preco, String descricao, String status, double quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.status = status;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
}
