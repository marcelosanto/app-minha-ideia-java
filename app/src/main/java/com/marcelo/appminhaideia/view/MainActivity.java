package com.marcelo.appminhaideia.view;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.marcelo.appminhaideia.R;

public class MainActivity extends AppCompatActivity {

    String TAG = "APP MINHA IDEIA";

    TextView txtNome, txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNome = findViewById(R.id.txtMainNome);
        txtEmail = findViewById(R.id.txtMainEmail);

        Log.d(TAG, "onCreate: Tela Principal carregada...");

        Bundle bundle = getIntent().getExtras();

        Log.d(TAG, "onCreate: Nome..." + bundle.getString("nome"));
        Log.d(TAG, "onCreate: Email..." + bundle.getString("email"));

        txtNome.setText("Nome: " + bundle.getString("nome"));
        txtEmail.setText("Email: " + bundle.getString("email"));

    }
}