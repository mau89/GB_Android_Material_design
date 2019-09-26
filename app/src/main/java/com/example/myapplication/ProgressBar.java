package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ProgressBar extends AppCompatActivity {
    private android.widget.ProgressBar progressBar1;
    private android.widget.ProgressBar progressBarHorizontal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progress_bar);
        Button buttonDisplay = findViewById(R.id.buttonDisplay);
        Button buttonHide = findViewById(R.id.buttonHide);
        progressBar1 = findViewById(R.id.progressBar);
        progressBarHorizontal = findViewById(R.id.progressBarHorizontal);
        progressBarHorizontal.setMax(100);
        progressBarHorizontal.setProgress(60);
        buttonDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar1.setVisibility(View.VISIBLE);
                progressBarHorizontal.setVisibility(View.VISIBLE);
            }
        });
        buttonHide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar1.setVisibility(View.INVISIBLE);
                progressBarHorizontal.setVisibility(View.INVISIBLE);
            }
        });
    }
}
