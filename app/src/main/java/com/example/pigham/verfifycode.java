package com.example.pigham;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class verfifycode extends AppCompatActivity {

    Button conbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verfifycode);
        conbtn = findViewById(R.id.buttonContinue);

        conbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent openmainmenu=new Intent(verfifycode.this , mainmenu.class);
                startActivity(openmainmenu);
            }
        });

    }





}