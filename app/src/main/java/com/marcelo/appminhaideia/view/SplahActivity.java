package com.marcelo.appminhaideia.view;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.marcelo.appminhaideia.R;
import com.marcelo.appminhaideia.controller.ClienteController;
import com.marcelo.appminhaideia.core.AppUtil;
import com.marcelo.appminhaideia.model.Cliente;

public class SplahActivity extends AppCompatActivity {

    int tempoDeEspera = 1000 * 3;

    Cliente objCliente;

    ClienteController clienteController;

    TextView txtAppVersion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Log.d(AppUtil.TAG, "onCreate: Tela Splash carregada...");

        txtAppVersion = findViewById(R.id.txtAppVersion);

        txtAppVersion.setText(AppUtil.versaoDoApp());

        trocarTela();
    }

    // CamelCase
    private void trocarTela() {

        Log.d(AppUtil.TAG, "trocarTela: Mudando de tela...");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                objCliente = new Cliente("Marcelo", "rocha@gmail.com");

                Log.d(AppUtil.TAG, "trocarTela: Esperando um tempo...");

                Intent trocarDeTela = new Intent(SplahActivity.this, MainActivity.class);

                Bundle bundle = new Bundle();
                bundle.putString("nome", objCliente.getNome());
                bundle.putString("email", objCliente.getEmail());

                trocarDeTela.putExtras(bundle);

                startActivity(trocarDeTela);
                finish();


            }
        }, tempoDeEspera);
    }
}