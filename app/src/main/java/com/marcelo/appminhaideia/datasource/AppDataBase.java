package com.marcelo.appminhaideia.datasource;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.marcelo.appminhaideia.core.AppUtil;
import com.marcelo.appminhaideia.datamodel.ClienteDataModel;
import com.marcelo.appminhaideia.datamodel.ProdutoDataModel;

public class AppDataBase extends SQLiteOpenHelper {

    private static final String DB_NAME = "AppMinhaIdeia-sqlite";
    private static final int DB_VERSION = 1;

    SQLiteDatabase db;

    public AppDataBase(Context context) {
        super(context, DB_NAME, null, DB_VERSION);

        Log.d(AppUtil.TAG, "AppDataBase: Criado o banco de dados");

        db = getWritableDatabase();


    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ClienteDataModel.criarTabela());

        Log.d(AppUtil.TAG, "AppDataBase: TabelaCliente " + ClienteDataModel.criarTabela());

        db.execSQL(ProdutoDataModel.criarTabela());

        Log.d(AppUtil.TAG, "AppDataBase: TabelaProduto " + ProdutoDataModel.criarTabela());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
