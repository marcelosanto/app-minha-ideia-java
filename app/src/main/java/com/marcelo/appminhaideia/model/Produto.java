package com.marcelo.appminhaideia.model;

public class Produto {

    private int id;
    private String nome;
    private String fornecedor;

    public Produto(String nome, String fornecedor) {
        this.nome = nome;
        this.fornecedor = fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
