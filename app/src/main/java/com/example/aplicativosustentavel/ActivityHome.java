package com.example.aplicativosustentavel;

import static com.example.aplicativosustentavel.R.id.KiyokoShimizu;
import static com.example.aplicativosustentavel.R.id.TobioKageyama;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityHome extends AppCompatActivity {

    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityhome);
    }
    public void onImageButtonClicked(View view) {
        // Is the button now checked?
        boolean checked;
        checked = ((ImageButton) view).isShown();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.KiyokoShimizu:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.TobioKageyama:
                if (checked)
                    // Ninjas rule
                    break;
        }
    }
}


