package com.company;

import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> estoque;
    private Produto prodaux;


    public Estoque(){
    }
    public void addProdEstoque(Produto prod){
        estoque.add(prod);
    }
    public void removeTodosProdEstoque(Produto prod){
            estoque.remove(prod);
    }
    public Produto adicionaCarrinho(Produto prod, int qnt){
        int aux = 0;
        Produto prodAux = new Produto(prod.getId(),prod.getNomeProduto(),qnt);
        //se tem no estdoque
        for (Produto produt:estoque) {
            if(produt.getId() == prod.getId()){
                if(produt.getQuantidade()<qnt){
                    //nao tem no estoque
                    System.out.println("Sem quantidade no estoque.");
                    return null;
                }else if(produt.getQuantidade()==qnt){
                    //possui mesma quant no estoque entao remove quantidade

                    prodAux = prod;

                    removeTodosProdEstoque(prod);

                    System.out.println("Produto adicionado ao carrinho.");
                    return prodAux;
                }else{
                    //possui no estoque entao remove quantidade

                    produt.setQuantidade(produt.getQuantidade() - qnt);

                    System.out.println("Produto adicionado ao carrinho.");
                    return prodAux;
                }
            }
        }
        System.out.println("Produto inexistente no estoque.");
        return null;
    }
}
