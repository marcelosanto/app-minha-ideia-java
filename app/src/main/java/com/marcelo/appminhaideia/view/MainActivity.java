package com.marcelo.appminhaideia.view;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.marcelo.appminhaideia.R;
import com.marcelo.appminhaideia.controller.ClienteController;

public class MainActivity extends AppCompatActivity {

    TextView txtNome, txtEmail;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor dados;

    String nomeProduto;
    int codigoProduto;
    float precoProduto;
    boolean estoque;

    ClienteController clienteController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         txtNome = findViewById(R.id.txtMainNome);
         txtEmail = findViewById(R.id.txtMainEmail);

         Log.d(AppUtil.TAG, "onCreate: Tela Principal carregada...");

         Bundle bundle = getIntent().getExtras();

         Log.d(AppUtil.TAG, "onCreate: Nome..." + bundle.getString("nome"));
         Log.d(AppUtil.TAG, "onCreate: Email..." + bundle.getString("email"));

         txtNome.setText("Nome: " + bundle.getString("nome"));
         txtEmail.setText("Email: " + bundle.getString("email"));

         sharedPreferences = getSharedPreferences(AppUtil.PREF_NOME, Context.MODE_PRIVATE);

         Log.i(AppUtil.TAG, "onCreate: Pasta Shared criada...");

         dados = sharedPreferences.edit();
         nomeProduto = "Tênis";
         codigoProduto = 125877;
         precoProduto = 997.99f;
         estoque = true;

         dados.putString("nomeProduto", nomeProduto);
         dados.putInt("codigoProduto", codigoProduto);
         dados.putFloat("precoProduto", precoProduto);
         dados.putBoolean("estoque", estoque);

         dados.apply(); // salva os dados

         //Modo debug
         Log.i(AppUtil.TAG, "onCreate: Dados para serem salvos");
         Log.w(AppUtil.TAG, "onCreate: Produto: " + nomeProduto);
         Log.w(AppUtil.TAG, "onCreate: Código: " + codigoProduto);
         Log.w(AppUtil.TAG, "onCreate: Preço: " + precoProduto);
         Log.w(AppUtil.TAG, "onCreate: Tem no Estoque: " + estoque);

         //dados.clear(); //limpa todos os dados
         //dados.apply();

         //dados.remove("estoque") // limpa determinado dado
         //dados.apply();

         Log.i(AppUtil.TAG, "onCreate: Dados recuperados");
         Log.d(AppUtil.TAG, "onCreate: Produto: " + sharedPreferences.getString("nomeProduto", ""));
         Log.d(AppUtil.TAG, "onCreate: Código: " + sharedPreferences.getInt("codigoProduto", 0));
         Log.d(AppUtil.TAG, "onCreate: Preço: " + sharedPreferences.getFloat("precoProduto", 0.0f));
         Log.d(AppUtil.TAG, "onCreate: Tem no Estoque: " + sharedPreferences.getBoolean("estoque", false));
         */

        clienteController = new ClienteController(getApplicationContext());
    }
}