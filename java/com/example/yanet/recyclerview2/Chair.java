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

public class Chair extends AppCompatActivity implements View.OnClickListener {
private ImageButton ibtCha;
private Button btNext;
private Button btReturn;
private MediaPlayer mediaPlayer;
private SoundPool soundPool;
private int chair;


@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chair);

        ibtCha = (ImageButton) findViewById(R.id.iv_chair);
        btNext = (Button) findViewById(R.id.bt_chair1);
        btReturn = (Button) findViewById(R.id.bt_chair2);


        ibtCha.setOnClickListener(this);
        btNext.setOnClickListener(this);
        btReturn.setOnClickListener(this);

        soundPool = new SoundPool(8, AudioManager.STREAM_MUSIC,0);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        chair = soundPool.load(this, R.raw.silla,1);
        mediaPlayer = new MediaPlayer();

        }
@Override
public void onClick(View v) {
        switch (v.getId()){
        case R.id.iv_chair:
        soundPool.play(chair, 1, 1,0,0,1);
        break;
        case R.id.bt_chair1:
        Intent i = new Intent(this, Dice.class);
        startActivity(i);
        finish();
        break;
        case R.id.bt_chair2:
        Intent in = new Intent(this, Lamp.class);
        startActivity(in);
        finish();
        break;
default:
        break;


        }

        }
        }
