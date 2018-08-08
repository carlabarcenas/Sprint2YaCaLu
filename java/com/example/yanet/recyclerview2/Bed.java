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

public class Bed extends AppCompatActivity implements View.OnClickListener{



    private ImageButton ibtBed;
    private Button btNext;
    private Button btReturn;
    private MediaPlayer mediaPlayer;
    private SoundPool soundPool;
    private int bed;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bed);

        ibtBed = (ImageButton) findViewById(R.id.iv_bed);
        btNext = (Button) findViewById(R.id.bt_bed);
        btReturn = (Button) findViewById(R.id.bt_bed1);


        ibtBed.setOnClickListener(this);
        btNext.setOnClickListener(this);
        btReturn.setOnClickListener(this);

        soundPool = new SoundPool(8, AudioManager.STREAM_MUSIC,0);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        bed = soundPool.load(this, R.raw.bedd,1);
        mediaPlayer = new MediaPlayer();

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_bed:
                soundPool.play(bed, 1, 1,0,0,1);
                break;
            case R.id.bt_bed:
                Intent i = new Intent(this, Computer.class);
                startActivity(i);
                finish();
                break;
            case R.id.bt_bed1:
                Intent in = new Intent(this, Entry.class);
                startActivity(in);
                finish();
                break;
            default:
                break;


        }
    }


}
