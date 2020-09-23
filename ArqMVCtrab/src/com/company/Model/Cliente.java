package com.company.Model;

public class Cliente {
    private String nome;
    private int cpf;
    private String endereco;

    public Cliente (String nome, int cpf, String endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNomeCliente(){return nome;}
    public int getCpfCliente(){return cpf;}
    public String getEndereco(){return endereco;}

}
