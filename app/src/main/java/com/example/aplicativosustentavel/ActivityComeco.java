package com.example.aplicativosustentavel;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityComeco extends AppCompatActivity {
    Button btniniciar;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitycomeco);

        btniniciar= findViewById(R.id.btniniciar);

        btniniciar.setOnClickListener(v -> {
            Intent Iniciar= new Intent (ActivityComeco.this, ActivityMontar_Bola.class);
            startActivity(Iniciar);
        });
    }
}
