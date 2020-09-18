package com.company;

public class Produto {
    private int id;
    private String nomeProduto;
    private int quantidade;

    public Produto(int id, String nome, int qnt){
        this.id = id;
        nomeProduto = nome;
        quantidade = qnt;
    }

    public void AddProduto(int id, String nomeProduto, int quantidade){
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getId() {
        return id;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void RemoveQuantidade(int quant){
        if(this.quantidade < quant){
            System.out.println("Quantidade em estoque insuficiente.");
        }else{
            this.quantidade = this.quantidade - quant;
        }
    }
}
