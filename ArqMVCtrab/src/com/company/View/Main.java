package com.company.View;
import com.company.Model.*;
import com.company.Controller.*;

public class Main {

    public static void main(String[] args) {
        
        /**
         * PRODUTOS
         */
        Produto prod1 = new Produto(1,"PS5",1);
        Produto prod2 = new Produto(2,"XBOX Series X",1);
        Produto prod3 = new Produto(3,"Controle DualShock PS5",2);
        Produto prod4 = new Produto(4,"Controle Xbox",2);
        Produto prod5 = new Produto(5,"Placa Nvidia RTX 3080",1);
        Produto prod6 = new Produto(6,"PC Master Race 16Gb Memória RAM",1);

        /**
         * CLIENTES
         */
        Cliente cliente1 = new Cliente("Bolinha de Neve", 3222134, "Rua dos Hamisters");
        Cliente cliente2 = new Cliente("Alex Karev", 12345678, "Rua dos Cachorros Alados");
        Cliente cliente3 = new Cliente("Pessoa Experta", 87654321, "Rua dos Master Race");

        /**
         * ESTOQUE
         */
        Estoque estoque = new Estoque();
        estoque.addProdEstoque(prod1);
        estoque.addProdEstoque(prod2);
        estoque.addProdEstoque(prod3);
        estoque.addProdEstoque(prod4);
        estoque.addProdEstoque(prod5);
        estoque.addProdEstoque(prod6);

        /**
         * BOLETOS
         */
        Boleto boleto1 = new Boleto(cliente1,estoque);
        boleto1.addProdCarrinho(prod1, 1);
        boleto1.addProdCarrinho(prod3,1);

        Boleto boleto2 = new Boleto(cliente2,estoque);
        boleto2.addProdCarrinho(prod2, 1);
        boleto2.addProdCarrinho(prod4, 2);

        Boleto boleto3 = new Boleto(cliente3, estoque);
        boleto3.addProdCarrinho(prod6, 1);
        boleto3.addProdCarrinho(prod5, 1);

        /**
         * IMPRIMINDO O BOLETO
         */
        boleto1.ImprimeBoleto();
        System.out.println("\n");
        boleto2.ImprimeBoleto();
        System.out.println("\n");
        boleto3.ImprimeBoleto();
        System.out.println("\n");

    }
}
