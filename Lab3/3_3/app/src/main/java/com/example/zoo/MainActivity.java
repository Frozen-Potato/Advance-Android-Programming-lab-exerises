package com.example.zoo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.boobs:
                setAnimal("M");
                return true;
            case R.id.boobLess:
                setAnimal("S");
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }
    public void setAnimal(String animalType){
        final ImageView image1 = (ImageView) findViewById(R.id.image1);
        final ImageView image2 = (ImageView) findViewById(R.id.image2);
        final ImageView image3 = (ImageView) findViewById(R.id.image3);
        final ImageView image4 = (ImageView) findViewById(R.id.image4);
        switch (animalType){
            case "M":
                image1.setImageResource(R.drawable.bear);
                image1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mediaPlayer;
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.bear);
                        mediaPlayer.start();
                    }
                });
                image2.setImageResource(R.drawable.wolf);
                image2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mediaPlayer;
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.wolf);
                        mediaPlayer.start();
                    }
                });
                image3.setImageResource(R.drawable.elephant);
                image3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mediaPlayer;
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.elephant);
                        mediaPlayer.start();
                    }
                });
                image4.setImageResource(R.drawable.lamb);
                image4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mediaPlayer;
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.lamb);
                        mediaPlayer.start();
                    }
                });
                break;
            case "S":
                image1.setImageResource(R.drawable.huuhkaja);
                image1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mediaPlayer;
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.huuhkaja);
                        mediaPlayer.start();
                    }
                });
                image2.setImageResource(R.drawable.peippo);
                image2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mediaPlayer;
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.peippo);
                        mediaPlayer.start();
                    }
                });
                image3.setImageResource(R.drawable.peukaloinen);
                image3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mediaPlayer;
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.peukaloinen);
                        mediaPlayer.start();
                    }
                });
                image4.setImageResource(R.drawable.punatulkku);
                image4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mediaPlayer;
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.punatulkku);
                        mediaPlayer.start();
                    }
                });
                break;
            default:
                break;

        }
    }

}
