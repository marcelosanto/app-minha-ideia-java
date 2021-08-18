package com.marcelo.appminhaideia.model;

import android.util.Log;

import com.marcelo.appminhaideia.controller.ICrud;
import com.marcelo.appminhaideia.core.AppUtil;

public class Cliente implements ICrud {
    private String nome;
    private String email;
    private String telefone;
    private int idade;
    private boolean sexo;

    public Cliente(String nome, String email, String telefone, int idade, boolean sexo) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.idade = idade;
        this.sexo = sexo;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
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
