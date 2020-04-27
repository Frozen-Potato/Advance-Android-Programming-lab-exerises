package com.example.uihierarchies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String[] Countries = new String[] {
                "Finland","England","Japan","France","USA","Vietnam"
        };
        //initialize the object
        ListView myListView = (ListView) findViewById(R.id.country_list_view);
        //point myListView to country_list_view
        final ArrayAdapter<String> aa;
        aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Countries);
        myListView.setAdapter(aa);
        //set mylistView to aa
    }
}
