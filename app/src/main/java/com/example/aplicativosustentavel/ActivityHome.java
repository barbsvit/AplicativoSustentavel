package com.example.aplicativosustentavel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.atomic.AtomicBoolean;

public class ActivityHome extends AppCompatActivity {
    Button btnproximo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityhome);

        btnproximo= (Button) findViewById(R.id.btnproximo);


        btnproximo.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent Proximo= new Intent (ActivityHome.this, ActivityComeco.class);
                startActivity(Proximo);
            }
        });
    }
}


