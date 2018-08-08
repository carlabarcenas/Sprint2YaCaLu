package com.example.yanet.recyclerview2;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Pencil extends AppCompatActivity implements View.OnClickListener{

private ImageButton ivPen;
private Button btnNex;
private Button btnRet;

private MediaPlayer mediaPlayer;
private SoundPool soundPool;
private  int pencil;


@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pencil);

        ivPen= (ImageButton)findViewById(R.id.iv_pen);
        btnNex=(Button)findViewById(R.id.bt_pen1);
        btnRet=(Button)findViewById(R.id.bt_pen2);


        ivPen.setOnClickListener(this);
        btnNex.setOnClickListener(this);
        btnRet.setOnClickListener(this);

        soundPool = new SoundPool(8, AudioManager.STREAM_MUSIC,0);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        pencil= soundPool.load(this, R.raw.lap,1);
        mediaPlayer = new MediaPlayer();

        }

@Override
public void onClick(View v) {
        switch (v.getId()) {
        case R.id.iv_pen:
        soundPool.play(pencil, 1, 1, 0, 0, 1);
        break;

        case R.id.bt_pen1:
        Intent i = new Intent(this, Lamp.class);
        startActivity(i);
        finish();
        break;
        case R.id.bt_pen2:
        Intent in = new Intent(this, Bucket.class);
        startActivity(in);
        finish();
        break;
default:
        break;

        }

          }
        }