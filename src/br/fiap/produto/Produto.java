package br.fiap.produto;

import br.fiap.fornecedor.Fornecedor;

public class Produto {



    private String nome;
    private double valorUnitario;
    private int quantidadeEstoque;
    private Fornecedor fornecedor;

    public Produto(String nome, int quantidadeEstoque, double valorUnitario, Fornecedor fornecedor) {
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
        this.valorUnitario = valorUnitario;
        this.fornecedor = fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
