package com.example.pigham;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class signup extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        getSupportActionBar().hide();// to hide tha Action bar
    }
}