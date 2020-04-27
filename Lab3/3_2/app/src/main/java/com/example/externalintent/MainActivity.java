package com.example.externalintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.sql.BatchUpdateException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button callBth = (Button) findViewById(R.id.call);
        callBth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri number = Uri.parse("tel:65456465");
                startActivity(new Intent(Intent.ACTION_DIAL,number));
            }
        });
        Button mapBth = (Button) findViewById(R.id.map);
        mapBth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri location = Uri.parse("geo:65.0066,25.4901?z=12");
                startActivity(new Intent(Intent.ACTION_VIEW, location));
            }
        });
        final EditText text = (EditText) findViewById(R.id.addr);
        Button goBth = (Button) findViewById(R.id.go);
        goBth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri web = Uri.parse(text.toString());
                startActivity(new Intent(Intent.ACTION_VIEW, web));
            }
        });
    }
}
