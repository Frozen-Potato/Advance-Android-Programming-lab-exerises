package com.example.event_handling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String lang;
    private String greet;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout main = new LinearLayout(this);
        final LinearLayout lo1 = new LinearLayout(this);
        final LinearLayout lo2 = new LinearLayout(this);

        final Button fi = new Button(this);
        final Button sv = new Button(this);
        final Button en = new Button(this);
        final Button sp = new Button(this);

        final TextView hi = new TextView(this);

        final EditText text = new EditText(this);

        main.setOrientation(LinearLayout.VERTICAL);
        lo1.setOrientation(LinearLayout.HORIZONTAL);
        lo2.setOrientation(LinearLayout.HORIZONTAL);

        fi.setText("Suomeksi");
        sv.setText("Sverige");
        en.setText("English");
        sp.setText("Surprise");

        main.addView(text);
        lo1.addView(fi);
        lo1.addView(sv);
        lo2.addView(en);
        lo2.addView(sp);
        main.addView(lo1);
        main.addView(lo2);
        main.addView(hi);
        setContentView(main);

        lang = "Hello ";
        name = "Z";
        greet = lang + name;

        hi.setText(greet);

        TextWatcher input = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                name = s.toString();
                greet = lang + name;
                hi.setText(greet);
            }
        };

        text.addTextChangedListener(input);

        fi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lang = "Terve ";
                greet = lang + name;
                hi.setText(greet);
            }
        });
        sv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lang = "Hejjsan ";
                greet = lang + name;
                hi.setText(greet);
            }
        });
        en.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lang = "Hi ";
                greet = lang + name;
                hi.setText(greet);
            }
        });
        sp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lang = "Halo ";
                greet = lang + name;
                hi.setText(greet);
            }
        });

    }
}
