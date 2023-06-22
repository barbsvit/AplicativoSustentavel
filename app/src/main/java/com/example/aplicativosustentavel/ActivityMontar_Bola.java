package com.example.aplicativosustentavel;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityMontar_Bola extends AppCompatActivity {
 Button btnmontar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitymontar_bola);

        btnmontar.setOnClickListener(v -> {
            Intent Montar= new Intent(ActivityMontar_Bola.this,ActivitySucesso.class);
            startActivity(Montar);
        });

    }
}
