package com.company.Controller;
import com.company.Model.Cliente;
import com.company.Model.Produto;

import java.util.ArrayList;

public class Boleto {
    private Cliente cliente;
    private Estoque estoque;
    private ArrayList<Produto> carrinho = new ArrayList<Produto>();

    public Boleto (Cliente cli, Estoque estoque){
        this.cliente = cli;
        this.estoque = estoque;
    }

    public void addProdCarrinho(Produto prod, int quant){
        carrinho.add(estoque.adicionaCarrinho(prod,quant));
    }

    public void ImprimeBoleto(){
        System.out.println("Cliente: " + cliente.getNomeCliente());
        System.out.println("CPF na Nota: " + cliente.getCpfCliente());
        System.out.println("Endereco de Entrega: " + cliente.getEndereco());
        System.out.println("Produto    ID   Quantidade");
        try{
            for (Produto prod:carrinho) {
                System.out.println(prod.getNomeProduto() + " (" + prod.getId() + ") " + prod.getQuantidade());
            }
        }catch(NullPointerException e){}
        

    }
}
