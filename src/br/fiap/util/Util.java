package br.fiap.util;

import br.fiap.fornecedor.Fornecedor;
import br.fiap.produto.Produto;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Double.parseDouble;


public class Util {

    private Fornecedor[] fornecedor = new Fornecedor[2];
    private Produto[] produto = new Produto[2];
    private int idxProduto = 0;
    private int idxFornecedor = 0;

    public void menu() {
        int opcao = 0;
        String mensagem = "1. Cadastrar Produto\n 2.Pesquisar produto por nome\n 3. Pesquisar fornecedor pelo CNPJ\n 4. Finalizar";

        while (true) {
            opcao = parseInt(showInputDialog(mensagem));
            if (opcao == 4) {
                return;
            }
            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;

                case 2:
                    pesquisarProduto();
                    break;

                case 3:
                    pesquisarFornecedor();
                    break;
                default:
                    showInputDialog(null, "Opção inválida");
            }
        }
    }

    private void cadastrarProduto() {
        String nome;
        int quantidadeEstoque;
        double valorUnitario;
        Fornecedor fornecedor = pesquisarFornecedor();
        if (fornecedor == null) {
            fornecedor=cadastrarFornecedor();

        }
        nome = showInputDialog("Nome do produto");
        quantidadeEstoque = parseInt(showInputDialog("Quantidade em estoque"));
        valorUnitario = parseDouble(showInputDialog("Valor unitário"));
        produto[idxProduto] = new Produto(nome, quantidadeEstoque, valorUnitario, fornecedor);
        idxProduto++;
    }
    private Fornecedor cadastrarFornecedor(){
        String nome = showInputDialog("Nome do fornecedor");
        long cnpj=parseLong(showInputDialog("CNPJ do fornecedor"));
        fornecedor[idxFornecedor] = new Fornecedor (nome, cnpj);
        idxFornecedor++;
        return fornecedor[idxFornecedor -1];
    }

    private void pesquisarProduto() {
        String aux="Produto não encontrado";
    String nome = showInputDialog("Nome do produto");
    for(int i=0; i<idxProduto;i++){
        if(produto[i].getNome().equalsIgnoreCase(nome)){
            aux="";
            aux += "Nome do produto: "+ nome+"\n";
            aux += "Valor unitário do produto: "+ produto[i].getValorUnitario()+"\n";

        }
    }
    }

    private Fornecedor pesquisarFornecedor() {
        long cnpj = parseLong(showInputDialog("CNPJ do fornecedor"));
        for (int i = 0; i < idxFornecedor; i++) {
            if (fornecedor[i].getCnpj() == cnpj) {
                return fornecedor[i];
            }
        }
        showMessageDialog(null, "CNPJ não cadastrado");
        return null;
    }
}
