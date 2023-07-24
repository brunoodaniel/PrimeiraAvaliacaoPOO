package services;

import models.Produto;

import java.util.ArrayList;

public class GerenciamentoDeVendas {

    ArrayList<Produto> produtosCadastrados = new ArrayList<>();
    double valorTotal;
    public void produtosVendidos(Object produto) {
        this.produtosCadastrados.add((Produto) produto);
        valorTotal += ((Produto) produto).getValorUnitario() * ((Produto) produto).getQuantidadeVendida();

    }

    public void relatorio(){
        System.out.println("Valor total de vendas: " + valorTotal);
        System.out.println("Média das vendas: " + valorTotal/produtosCadastrados.size());

    }

}



