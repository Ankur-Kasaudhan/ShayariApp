package com.example.shayari;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Terms_Conditions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.t_c);

        getSupportActionBar().show();
        getSupportActionBar().setTitle("T&C");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}