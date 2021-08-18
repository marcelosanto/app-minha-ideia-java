package com.marcelo.appminhaideia.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.marcelo.appminhaideia.R;
import com.marcelo.appminhaideia.controller.ClienteController;

public class MainActivity extends AppCompatActivity {

        ClienteController clienteController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clienteController = new ClienteController(getApplicationContext());
    }
}