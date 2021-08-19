package com.marcelo.appminhaideia.view;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.marcelo.appminhaideia.R;
import com.marcelo.appminhaideia.controller.ClienteController;
import com.marcelo.appminhaideia.controller.ProdutoController;
import com.marcelo.appminhaideia.core.AppUtil;
import com.marcelo.appminhaideia.model.Cliente;
import com.marcelo.appminhaideia.model.Produto;

public class MainActivity extends AppCompatActivity {

    ClienteController clienteController;
    Cliente obj;

    ProdutoController produtoController;
    Produto objProduto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clienteController = new ClienteController(getApplicationContext());

        obj = new Cliente("Marcelo", "rocha@gmail.com");

        if (clienteController.incluir(obj)) {
            Toast.makeText(this, " " + obj.getNome() + " inserido com sucesso.", Toast.LENGTH_LONG).show();
            Log.i(AppUtil.TAG, "Cliente: dado inserido com sucesso");
        } else {
            Toast.makeText(this, "Cliente não inserido", Toast.LENGTH_LONG).show();
            Log.e(AppUtil.TAG, "Cliente: dado não inserido");
        }

        produtoController = new ProdutoController(getApplicationContext());
        objProduto = new Produto("Chinelo", "Havaianas");

        if (produtoController.incluir(objProduto)) {
            Toast.makeText(this, "Produto " + objProduto.getNome() + " inserido com sucesso.", Toast.LENGTH_LONG).show();
            Log.i(AppUtil.TAG, "Produto: dado inserido com sucesso");
        } else {
            Toast.makeText(this, "Produto não inserido", Toast.LENGTH_LONG).show();
            Log.e(AppUtil.TAG, "Produto: dado não inserido");
        }
    }
}