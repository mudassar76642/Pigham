package com.example.pigham;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signup extends AppCompatActivity {

   Button btnsignup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        getSupportActionBar().hide();// to hide tha Action bar


        btnsignup = findViewById(R.id.buttonsignup);
        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openveryfycode=new Intent(signup.this , verfifycode.class);
                startActivity(openveryfycode);
            }
        });

    }

}