package com.example.aplicativosustentavel;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActivitySucesso extends AppCompatActivity {
  Button btnvoltar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitysucesso);

    btnvoltar= findViewById(R.id.btnvoltar);

    btnvoltar.setOnClickListener(v -> {
        Intent Voltar = new Intent(ActivitySucesso.this,ActivityComeco.class);
        startActivity(Voltar);
    });
    }
}
