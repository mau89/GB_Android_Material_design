package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // buttons_activity
        //setContentView(R.layout.buttons_activity);
        // ToolbarActivity
        //setContentView(R.layout.toolbar_activity);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int i = item.getItemId();
        switch (i) {
            case android.R.id.home:
                Log.d("Кнопка домой", "onOptionsItemSelected");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
