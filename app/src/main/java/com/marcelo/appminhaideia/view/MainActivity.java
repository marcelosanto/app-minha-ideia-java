package com.marcelo.appminhaideia.view;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.marcelo.appminhaideia.R;

public class MainActivity extends AppCompatActivity {

    String TAG = "APP MINHA IDEIA";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: Tela Principal carregada...");


    }
}