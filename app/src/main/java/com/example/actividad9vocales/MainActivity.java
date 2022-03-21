package com.example.actividad9vocales;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;
    MediaPlayer mp1;
    MediaPlayer mp2;
    MediaPlayer mp3;
    MediaPlayer mp4;

    ImageButton btnA;
    ImageButton btnE;
    ImageButton btnI;
    ImageButton btnO;
    ImageButton btnU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnA=(ImageButton) findViewById(R.id.btnA);
        btnE=(ImageButton) findViewById(R.id.btnE);
        btnI=(ImageButton) findViewById(R.id.btnI);
        btnO=(ImageButton) findViewById(R.id.btnO);
        btnU=(ImageButton) findViewById(R.id.btnU);

        mp=MediaPlayer.create(this, R.raw.vo);
        mp1=MediaPlayer.create(this, R.raw.ve);
        mp2=MediaPlayer.create(this, R.raw.vi);
        mp3=MediaPlayer.create(this, R.raw.vu);
        mp4=MediaPlayer.create(this, R.raw.va);

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });
        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp1.start();
            }
        });
        btnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp2.start();
            }
        });
        btnO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp3.start();
            }
        });
        btnU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp4.start();
            }
        });
    }
}