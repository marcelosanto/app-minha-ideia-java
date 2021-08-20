package com.marcelo.appminhaideia.view;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.marcelo.appminhaideia.R;
import com.marcelo.appminhaideia.controller.ClienteController;
import com.marcelo.appminhaideia.controller.ProdutoController;
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


        for (int i = 0; i < 49; i++) {
            clienteController = new ClienteController(getApplicationContext());
            obj = new Cliente("Marcelo" + i, i + "rocha@gmail.com");

            clienteController.incluir(obj);
        }
        //obj.setId(11);

        for (Cliente obj : clienteController.listar()) {
            Log.i("Retorno", "Cliente listar: " + obj.getId() + " " + obj.getNome() + " " + obj.getEmail());
        }

        /*
         Atualizar dados
        if (clienteController.alterar(obj)) {
            Toast.makeText(this, " " + obj.getNome() + " atualizado com sucesso.", Toast.LENGTH_LONG).show();
            Log.i(AppUtil.TAG, "Cliente: dado atualizado com sucesso");
        } else {
            Toast.makeText(this, "Cliente não atualizado", Toast.LENGTH_LONG).show();
            Log.e(AppUtil.TAG, "Cliente: dado não atualizado");
        }*/

        /* Excluir
        if (clienteController.deletar(obj.getId())) {
            Toast.makeText(this, " " + obj.getNome() + " excluido com sucesso.", Toast.LENGTH_LONG).show();
            Log.i(AppUtil.TAG, "Cliente: dado excluido com sucesso");
        } else {
            Toast.makeText(this, "Cliente não excluido", Toast.LENGTH_LONG).show();
            Log.e(AppUtil.TAG, "Cliente: dado não excluido");
        }*/

        /* Incluir
        if (clienteController.incluir(obj)) {
            Toast.makeText(this, " " + obj.getNome() + " inserido com sucesso.", Toast.LENGTH_LONG).show();
            Log.i(AppUtil.TAG, "Cliente: dado inserido com sucesso");
        } else {
            Toast.makeText(this, "Cliente não inserido", Toast.LENGTH_LONG).show();
            Log.e(AppUtil.TAG, "Cliente: dado não inserido");
        }*/


        // produtoController =n ew ProdutoController(getApplicationContext());
        // objProduto =new Produto("Chinelo","Havaianas");
        //objProduto.setId(1);

        //Excluir
        /*
        if (produtoController.deletar(objProduto.getId())) {
            Toast.makeText(this, "Produto " + objProduto.getNome() + " excluido com sucesso.", Toast.LENGTH_LONG).show();
            Log.i(AppUtil.TAG, "Produto excluido com sucesso");
        } else {
            Toast.makeText(this, "Produto não excluido", Toast.LENGTH_LONG).show();
            Log.e(AppUtil.TAG, "Produto não excluido");
        }*/


        //Incluir
       /* if (produtoController.incluir(objProduto)) {
            Toast.makeText(this, "Produto " + objProduto.getNome() + " inserido com sucesso.", Toast.LENGTH_LONG).show();
            Log.i(AppUtil.TAG, "Produto: dado inserido com sucesso");
        } else {
            Toast.makeText(this, "Produto não inserido", Toast.LENGTH_LONG).show();
            Log.e(AppUtil.TAG, "Produto: dado não inserido");
        }*/
    }
}
