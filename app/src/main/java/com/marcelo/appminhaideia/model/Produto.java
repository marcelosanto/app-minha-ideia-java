package com.marcelo.appminhaideia.model;

import android.util.Log;

import com.marcelo.appminhaideia.controller.ICrud;
import com.marcelo.appminhaideia.core.AppUtil;

public class Produto implements ICrud {

    private String nome;
    private String fornecedor;

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

    @Override
    public void incluir() {
        Log.i(AppUtil.TAG, "Incluir: Produtos");

    }

    @Override
    public void alterar() {
        Log.i(AppUtil.TAG, "Alterar: Produtos");
    }

    @Override
    public void deletar() {
        Log.i(AppUtil.TAG, "Deletar: Produtos");
    }

    @Override
    public void listar() {
        Log.i(AppUtil.TAG, "Listar: Produtos");
    }
}
