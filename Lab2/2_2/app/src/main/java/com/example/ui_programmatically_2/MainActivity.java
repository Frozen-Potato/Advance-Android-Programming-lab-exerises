package com.example.ui_programmatically_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> countries = new ArrayList<>();
    private ArrayAdapter aa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL);
        final LinearLayout layOut = new LinearLayout(this);
        layOut.setOrientation(LinearLayout.HORIZONTAL);
        final Button bth1 = new Button(this);
        bth1.setText("Add");
        layOut.addView(bth1);
        final Button bth2 = new Button(this);
        bth2.setText("Edit");
        layOut.addView(bth2);
        final Button bth3 = new Button(this);
        bth3.setText("Remove");
        layOut.addView(bth3);
        final EditText edit = new EditText(this);
        edit.setHint("type...");
        final ListView list = new ListView(this);
        mainLayout.addView(layOut);
        mainLayout.addView(edit);
        mainLayout.addView(list);
        setContentView(mainLayout);

        countries.add("Finland");
        aa = new ArrayAdapter(this, android.R.layout.simple_list_item_1, countries);
        list.setAdapter(aa);

        bth1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countries.add(edit.getText().toString());
                aa = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, countries);
                list.setAdapter(aa);
            }
        });

        bth3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countries.remove(edit.getText().toString());
                aa = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, countries);
                list.setAdapter(aa);
            }
        });
    }
}
