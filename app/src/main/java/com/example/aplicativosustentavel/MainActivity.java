package com.example.aplicativosustentavel;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnjogar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      btnjogar= findViewById(R.id.btnjogar);

        btnjogar.setOnClickListener(v -> {
            Intent Jogar= new Intent (MainActivity.this, ActivityHome.class);
            startActivity(Jogar);
        });
    }
}