package com.company;

import java.util.ArrayList;

public class Boleto {
    private Cliente cliente;
    private Estoque estoque;
    private ArrayList<Produto> carrinho;

    public Boleto (Cliente cli, Estoque estoque){
        this.cliente = cli;
        this.estoque = estoque;
    }

    public void addProdCarrinho(Produto prod, int quant){
        carrinho.add(estoque.adicionaCarrinho(prod,quant));
    }

    public void ImprimeBoleto(){
        System.out.println("Produto    ID   Quantidade");
        for (Produto prod:carrinho) {
            System.out.println(prod.getNomeProduto() + " -- (" + prod.getId() + ")     " + prod.getQuantidade());
        }
    }
}
