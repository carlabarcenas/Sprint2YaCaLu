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

public class Table extends AppCompatActivity implements View.OnClickListener{
private ImageButton ibTable;
private Button btNext;
private Button btReturn;
private MediaPlayer mediaPlayer;
private SoundPool soundPool;
private int table;

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);


        ibTable = (ImageButton) findViewById(R.id.iv_table);
        btNext = (Button) findViewById(R.id.bt_table0);
        btReturn = (Button) findViewById(R.id.bt_table1);


        ibTable.setOnClickListener(this);
        btNext.setOnClickListener(this);
        btReturn.setOnClickListener(this);

        soundPool = new SoundPool(8, AudioManager.STREAM_MUSIC,0);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        table = soundPool.load(this, R.raw.mes,1);
        mediaPlayer = new MediaPlayer();

        }
@Override
public void onClick(View v) {
        switch (v.getId()){
        case R.id.iv_table:
        soundPool.play(table, 1, 1,0,0,1);
        break;
        case R.id.bt_table0:
        Intent i = new Intent(this, Camera.class);
        startActivity(i);
        finish();
        break;
        case R.id.bt_table1:
        Intent in = new Intent(this, Lantern.class);
        startActivity(in);
        finish();
        break;
default:
        break;


        }


        }
        }