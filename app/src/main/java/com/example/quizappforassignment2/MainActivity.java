package com.example.quizappforassignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.start_game).setOnClickListener(view -> {
            Intent intent = new Intent(this, QnAActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.about).setOnClickListener(view -> {
            Intent intent = new Intent(this, AboutUs.class);
            startActivity(intent);
        });
    }
}