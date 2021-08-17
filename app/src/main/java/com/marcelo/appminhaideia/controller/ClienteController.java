package com.marcelo.appminhaideia.controller;

import android.util.Log;

import com.marcelo.appminhaideia.core.AppUtil;

public class ClienteController {

    String versaoApp;

    public ClienteController() {
        this.versaoApp = AppUtil.versaoDoApp();

        Log.d(AppUtil.TAG, "ClienteController: Versão App: " + versaoApp);
    }
}
