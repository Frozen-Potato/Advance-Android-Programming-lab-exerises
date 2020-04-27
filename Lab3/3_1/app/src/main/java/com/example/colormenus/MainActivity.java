package com.example.colormenus;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.red:
                setbackGroundColor("red");
                return true;
            case R.id.yellow:
                setbackGroundColor("yellow");
                return true;
            case R.id.white:
                setbackGroundColor("white");
            default:
                return super.onContextItemSelected(item);
        }
    }
    public void setbackGroundColor(String color){
        LinearLayout view = (LinearLayout) findViewById(R.id.bgc);
        view.setBackgroundColor(Color.parseColor(color));
        TextView text = (TextView) findViewById(R.id.color);
        text.setText(color);
    }

}
