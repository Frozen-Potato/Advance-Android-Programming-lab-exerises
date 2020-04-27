package com.example.androidui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Coor extends AppCompatActivity {
    Button bth,bth2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coor);
        bth = (Button) findViewById(R.id.cons);
        bth2 = (Button) findViewById(R.id.linear);
        bth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Coor.this,MainActivity.class));
            }
        });
        bth2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Coor.this,Linear.class));
            }
        });
    }
}
