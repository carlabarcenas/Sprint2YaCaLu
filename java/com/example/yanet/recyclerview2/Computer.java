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

public class Computer extends AppCompatActivity implements View.OnClickListener {

private ImageButton ivCompu;
private Button btnNext;
private Button  btnReturn;
private MediaPlayer mediaPlayer;
private SoundPool soundPool;
private int computer;

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);

        ivCompu = (ImageButton) findViewById(R.id.iv_computer);
        btnNext = (Button) findViewById(R.id.bt_next);
        btnReturn = (Button) findViewById(R.id.bt_return);


        ivCompu.setOnClickListener(this);
        btnNext.setOnClickListener(this);
        btnReturn.setOnClickListener(this);

        soundPool = new SoundPool(8, AudioManager.STREAM_MUSIC,0);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        computer= soundPool.load(this, R.raw.comp,1);
        mediaPlayer = new MediaPlayer();

        }
@Override
public void onClick(View v) {
        switch (v.getId()){
        case R.id.iv_computer:
        soundPool.play(computer, 1, 1,0,0,1);
        break;

        case R.id.bt_next:
        Intent i = new Intent(this, Celphone.class);
        startActivity(i);
        finish();
        break;
        case R.id.bt_return:
        Intent in = new Intent(this, Bed.class);
        startActivity(in);
        finish();
        break;
default:
        break;


        }
        }


        }
