package com.example.shayari;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Developer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);
        getSupportActionBar().setTitle("Developer");
        getSupportActionBar().show();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}