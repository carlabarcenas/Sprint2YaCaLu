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

public class Glasses extends AppCompatActivity implements View.OnClickListener{

    private ImageButton ibGla;
    private Button btNext;
    private Button btReturn;
    private MediaPlayer mediaPlayer;
    private SoundPool soundPool;
    private int glasses;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glasses);

        ibGla = (ImageButton) findViewById(R.id.iv_len);
        btNext = (Button) findViewById(R.id.bt_lent);
        btReturn = (Button) findViewById(R.id.bt_lente);


        ibGla.setOnClickListener(this);
        btNext.setOnClickListener(this);
        btReturn.setOnClickListener(this);

        soundPool = new SoundPool(8, AudioManager.STREAM_MUSIC,0);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        glasses = soundPool.load(this, R.raw.lent,1);
        mediaPlayer = new MediaPlayer();

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_len:
                soundPool.play(glasses, 1, 1,0,0,1);
                break;
            case R.id.bt_lent:
                Intent i = new Intent(this, Keys.class);
                startActivity(i);
                finish();
                break;
            case R.id.bt_lente:
                Intent in = new Intent(this, Dice.class);
                startActivity(in);
                finish();
                break;
            default:
                break;


        }


    }
}