package br.fiap.fornecedor;

public class Fornecedor {
    private String nome;
    private long cnpj;

    //alt insert
    public Fornecedor(String nome, long cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    //métodos de acesso get e set, acessam variáveis privadas e eles são sempre público.

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

}
