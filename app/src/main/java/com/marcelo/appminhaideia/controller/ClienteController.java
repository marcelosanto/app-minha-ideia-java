package com.marcelo.appminhaideia.controller;

import android.util.Log;

import com.marcelo.appminhaideia.core.AppUtil;

public class ClienteController implements ICrud {

    String versaoApp;

    public ClienteController() {
        this.versaoApp = AppUtil.versaoDoApp();

        Log.i(AppUtil.TAG, "ClienteController: Versão App: " + versaoApp);
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
