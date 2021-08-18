package com.marcelo.appminhaideia.model;

import android.util.Log;

import com.marcelo.appminhaideia.controller.ICrud;
import com.marcelo.appminhaideia.core.AppUtil;

public class Cliente implements ICrud {

    private int id; // Chave primaria no Banco de Dados
    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void incluir() {
        Log.i(AppUtil.TAG, "Incluir: Cliente");

    }

    @Override
    public void alterar() {
        Log.i(AppUtil.TAG, "Alterar: Cliente");
    }

    @Override
    public void deletar() {
        Log.i(AppUtil.TAG, "Deletar: Cliente");
    }

    @Override
    public void listar() {
        Log.i(AppUtil.TAG, "Listar: Cliente");
    }
}
