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

public class Lamp extends AppCompatActivity implements View.OnClickListener{
private ImageButton ibtLam;
private Button btNext;
private Button btReturn;
private MediaPlayer mediaPlayer;
private SoundPool soundPool;
private int lampara;

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lamp);



        ibtLam = (ImageButton) findViewById(R.id.iv_lamp);
        btNext = (Button) findViewById(R.id.bt_lamp0);
        btReturn = (Button) findViewById(R.id.bt_lamp1);


        ibtLam.setOnClickListener(this);
        btNext.setOnClickListener(this);
        btReturn.setOnClickListener(this);

        soundPool = new SoundPool(8, AudioManager.STREAM_MUSIC,0);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        lampara = soundPool.load(this, R.raw.lamp,1);
        mediaPlayer = new MediaPlayer();

        }
@Override
public void onClick(View v) {
        switch (v.getId()){
        case R.id.iv_lamp:
        soundPool.play(lampara, 1, 1,0,0,1);
        break;
        case R.id.bt_lamp0:
        Intent i = new Intent(this, Chair.class);
        startActivity(i);
        finish();
        break;
        case R.id.bt_lamp1:
        Intent in = new Intent(this, Pencil.class);
        startActivity(in);
        finish();
        break;
default:
        break;


        }
        }

        }