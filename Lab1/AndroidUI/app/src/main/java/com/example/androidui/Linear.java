package com.example.androidui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Linear extends AppCompatActivity {
    Button bth,bth2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);
        bth = (Button) findViewById(R.id.cons);
        bth2 = (Button) findViewById(R.id.coor);
        bth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Linear.this,MainActivity.class));
            }
        });
        bth2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Linear.this,Coor.class));
            }
        });
    }
}
