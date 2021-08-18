package com.marcelo.appminhaideia.controller;

import android.content.Context;
import android.util.Log;

import com.marcelo.appminhaideia.core.AppUtil;
import com.marcelo.appminhaideia.datasource.AppDataBase;

public class ClienteController extends AppDataBase {

    public ClienteController(Context context) {
        super(context);
        Log.d(AppUtil.TAG, "ClienteController: conectado");
    }
}
