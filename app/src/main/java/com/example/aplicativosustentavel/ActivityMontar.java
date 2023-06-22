package com.example.aplicativosustentavel;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityMontar extends AppCompatActivity{
        Button btnmontar;
        @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activitymontar_bola);

            btnmontar = findViewById(R.id.btnmontar);

            btnmontar.setOnClickListener(v -> {
                Intent Montar= new Intent (ActivityMontar.this, ActivitySucesso.class);
                startActivity(Montar);
            });
        }
}
